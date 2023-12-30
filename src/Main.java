import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome dans notre hôtel");
        Client client = new Client("Alpha", "Diallo", 1);
        Chambre chambre1 = new Chambre(4,true,80,true);
        Repas commandeRepas = new Repas(80, "Pates", "Faln");
        Date dateEntree = new Date(2023 , 9, 1); // Attention, les mois commencent à 0
        Date dateSortie = new Date(2023, 9, 5);
        int numReservation = 1;

        // Création de la réservation
        Reservation reservation1 = new Reservation(numReservation, client, chambre1, commandeRepas, dateEntree, dateSortie);

        // Affichage des informations de la réservation
        System.out.println("Réservation créée pour " + client.getPrenom() + " " + client.getNom());
        System.out.println("Chambre: " + chambre1.getNumChambre());
        System.out.println("Date d'arrivée: " + dateEntree);
        System.out.println("Date de départ: " + dateSortie);


    }
}