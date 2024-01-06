import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //config chambre
        Gestion gestion = new Gestion();
        gestion.addChambre(new Chambre(1, true, 100, true));
        gestion.addChambre(new Chambre(2, true, 100, true));
        gestion.addChambre(new Chambre(3, true, 100, true));
        gestion.addChambre(new Chambre(4, true, 100, true));
        gestion.addChambre(new ChambreLuxe(5, true, 100, true, "WiFi"));
        gestion.addChambre(new ChambreLuxe(6, true, 100, true, "Salle de bain effet pluie"));
        gestion.addChambre(new ChambreLuxe(7, true, 100, true, "Frigo"));
        gestion.addChambre(new ChambreLuxe(8, true, 100, true, "Carte parking"));

        Scanner scanner = new Scanner(System.in);
        int option;
        boolean progCont = true;

        while (progCont) {
            System.out.println("Bienvenue dans notre hôtel\n");
            System.out.println("1. Je veux effectuer une réservation");
            System.out.println("2. Je veux modifier ma reservation");
            System.out.println("3. Je veux annuler ma réservation");
            System.out.println("4. Je veux avoir la liste des réservations");
            System.out.println("5. Je veux me renseigner sur les services et sur la selection de repas ");
            System.out.println("6. Quitter");
            System.out.print("Veuillez sélectionner une option:");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    gestion.createReservation();
                    break;
                case 2:
                    System.out.print("Entrez l'ID de la réservation à modifier: ");
                    int reservID = scanner.nextInt();
                    gestion.modifierReservation(reservID);
                    break;
                case 3:
                    System.out.println("3. Je veux annuler ma réservation");
                    System.out.print("Entrez le numéro de réservation que vous souhaitez annuler: ");
                    int reservAID = scanner.nextInt();
                    gestion.annulerReservation(reservAID);
                    break;
                case 4:
                    System.out.println("4. Je veux avoir la liste des réservations");
                    gestion.listerReservations();
                    break;
                case 5:
                    System.out.println("5. Je veux me renseigner sur les services et sur la selection de repas ");
                    System.out.println("Ok, pour quel type de chambre souhaitez-vous vous informer ?");
                    System.out.println("1. Pour la Chambre Classique!");
                    System.out.println("2. Pour la Chambre Luxueuse !");
                    System.out.println("3. Pour les Repas !");
                    System.out.print("Entrez votre choix: ");
                    int choix5 = scanner.nextInt();
                    switch (choix5) {
                        case 1:
                            System.out.println("Découvrez notre chambre classique, un choix abordable pour votre séjour.");
                            System.out.println("Choisissez entre un lit simple ou double pour votre confort et votre besoin.");
                            System.out.println("Réservez dès maintenant pour un séjour confortable et économique !\n");
                            break;
                        case 2:
                            System.out.println("Découvrez le summum du confort dans notre chambre de luxe.");
                            System.out.println("Conservez les avantages de la chambre classique, tout en vous offrant une expérience exceptionnelle.");
                            System.out.println("Vous pourrez entièrement configurer votre durant la réservations en ajoutant une terrasse, des équipements haut de gamme ou encore une douche à effet pluie !");
                            System.out.println("Profitez du service de conciergerie 24/7 et d'un accès exclusif au salon VIP.");
                            System.out.println("Réservez dès maintenant votre séjour pour une expérience inoubliable !\n");
                            break;
                        case 3:
                            System.out.println("Complétez votre séjour dans nos chambres en choisissant un délicieux repas pour chaque étape de votre journée.");
                            System.out.println("Nous vous proposons un menu varié avec une sélection de plats:");
                            System.out.println("Selection Plats (8 euros):  Burger/Frites classique, Poulet yassa, Pizza");
                            System.out.println("Vous pouvez choisir un plat par personne. Le total sera ajouté à votre facture lors de votre séjour.\n");
                            break;
                        default:
                            System.out.println("Choix invalide. Merci de bien vouloir réessayer\n");
                            break;
                    }
                    break;
                case 6:
                    progCont = false;
                    System.out.println("Merci d'avoir utilisé notre logiciel. A bientôt !");
                    break;
                default:
                    System.out.println("Choix invalide. Merci de bien vouloir réessayer");
                    break;
            }
        }
        scanner.close();
    }
}
