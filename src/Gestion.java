import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestion {
    private List<Chambre> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Repas> meals = new ArrayList<>();

    public Gestion() {
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addChambre(Chambre chambre) {
        rooms.add(chambre);
    }

    public void addRepas(Repas repas) {
        meals.add(repas);
    }

    public void createReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le prénom du client: ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez le nom du client: ");
        String nom = scanner.nextLine();

        System.out.println("Voici la liste des chambres disponibles :");
        for (Chambre chambre : rooms) {
            if (chambre.isDispo()) {
                System.out.println(chambre.getNumChambre());
            }
        }

        boolean chambreDisponible = false;
        Chambre chambreChoisie = null;

        while (!chambreDisponible) {
            System.out.print("Choisissez le numéro de la chambre: ");
            int numChambre = scanner.nextInt();
            chambreChoisie = getChambreByNum(numChambre);

            if (chambreChoisie != null && chambreChoisie.isDispo()) {
                chambreDisponible = true;
                chambreChoisie.setDispo(false);
            } else {
                System.out.println("La chambre sélectionnée n'est pas disponible. Veuillez choisir une autre chambre.");
            }
        }

        if (chambreDejaPrise(chambreChoisie)) {
            System.out.println("La chambre est déjà réservée, nous pouvons vous proposer d'autres chambres semblables. Veuillez recommencer la réservation.");
            return;
        }

        System.out.println("Voici la liste des repas disponibles :");
        for (Repas repas : meals) {
            System.out.println(repas.getNumRepas() + " - " + repas.getPlat());
        }

        System.out.println("Le repas 1: Burger coûte 13 euros");
        System.out.println("Le repas 2: Poulet-Yassa coûte 13 euros");
        System.out.println("Le repas 3: Pizza coûte 13 euros");
        System.out.print("Choisissez le numéro du repas: ");
        int numRepas = scanner.nextInt();
        Repas repasChoisi = getRepasById(numRepas);

        System.out.print("Entrez la durée du séjour (en jours): ");
        int duree = scanner.nextInt();

        Client client = new Client(prenom, nom);
        Reservation newReserv = new Reservation(client, chambreChoisie, repasChoisi, duree);
        reservations.add(newReserv);

        System.out.println("Votre réservation est confirmée avec le numéro : " + newReserv.getReservID());
    }

    public void annulerReservation(int reservAID) {
        Reservation reservation = getReservationById(reservAID);

        if (reservation != null) {
            Chambre chambreReservee = reservation.getChambre();
            chambreReservee.setDispo(true); // Marquer la chambre comme disponible

            reservations.remove(reservation); // Supprimer la réservation de la liste

            System.out.println("La réservation avec le numéro " + reservAID + " a été annulée avec succès.");
        } else {
            System.out.println("Aucune réservation trouvée avec le numéro " + reservAID + ". Veuillez vérifier le numéro de réservation.");
        }
    }

    public void modifierReservation(int reservID) {
        Scanner scanner = new Scanner(System.in);

        Reservation reservation = getReservationById(reservID);

        if (reservation != null) {
            System.out.println("Modification de la réservation avec le numéro " + reservID);

            // Afficher les détails actuels de la réservation
            System.out.println("Détails actuels de la réservation :");
            System.out.println("Client : " + reservation.getClient().getPrenom() + " " + reservation.getClient().getNom());
            System.out.println("Chambre : " + reservation.getChambre().getNumChambre());
            System.out.println("Repas : " + reservation.getRepas());
            System.out.println("Durée : " + reservation.getDureeSejour() + " jours");

            // Demander à l'utilisateur s'il souhaite modifier la réservation
            System.out.print("Voulez-vous modifier cette réservation? (Tapez: Oui ou Non): ");
            String choix = scanner.next();

            if (choix.equalsIgnoreCase("Oui")) {
                // Modification de la réservation
                System.out.println("Modifiez les détails de la réservation :");

                // Modifiez les détails selon vos besoins (par exemple, la durée du séjour)
                System.out.print("Entrez la nouvelle durée du séjour (en jours): ");
                int nouvelleDuree = scanner.nextInt();
                reservation.setDureeSejour(nouvelleDuree);

                System.out.println("La réservation avec le numéro " + reservID + " a été modifiée avec succès.");
            } else {
                System.out.println("La réservation n'a pas été modifiée.");
            }
        } else {
            System.out.println("Aucune réservation trouvée avec le numéro " + reservID + ". Veuillez vérifier le numéro de réservation.");
        }
    }

    private Chambre getChambreByNum(int numChambre) {
        for (Chambre chambre : rooms) {
            if (chambre.getNumChambre() == numChambre && chambre.isDispo()) {
                return chambre;
            }
        }
        return null;
    }

    private Repas getRepasById(int id) {
        for (Repas repas : meals) {
            if (repas.getNumRepas() == id) {
                return repas;
            }
        }
        return null;
    }

    private boolean chambreDejaPrise(Chambre chambre) {
        for (Reservation reserv : reservations) {
            if (reserv.getChambre().equals(chambre)) {
                return true;
            }
        }
        return false;
    }

    private Reservation getReservationById(int reservID) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservID() == reservID) {
                return reservation;
            }
        }
        return null;
    }

    public void listerReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Il n'y a pas de réservations.");
        } else {
            System.out.println("Liste des réservations :");
            for (Reservation reserv : reservations) {
                System.out.println("Numéro de réservation : " + reserv.getReservID() +
                        ", Client : " + reserv.getClient().getPrenom() + " " + reserv.getClient().getNom() +
                        ", Chambre : " + reserv.getChambre().getNumChambre() +
                        ", Repas : " + reserv.getRepas() +
                        ", Durée : " + reserv.getDureeSejour() + " jours");
            }
        }
    }
}
