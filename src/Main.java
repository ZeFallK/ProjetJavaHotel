import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //config chambre
        Gestion gestion = new Gestion();
        gestion.addChambre(new Chambre(1, "Chambre Classique", true, 100, true));
        gestion.addChambre(new Chambre(2, "Chambre Classique",true, 100, true));
        gestion.addChambre(new Chambre(3, "Chambre Classique",true, 100, true));
        gestion.addChambre(new Chambre(4, "Chambre Classique",true, 100, true));
        gestion.addChambre(new ChambreLuxe(5, "Chambre Luxe",true, 200, true, "WiFi"));
        gestion.addChambre(new ChambreLuxe(6, "Chambre Luxe",true, 200, true, "Salle de bain effet pluie"));
        gestion.addChambre(new ChambreLuxe(7, "Chambre Luxe",true, 200, true, "Frigo"));
        gestion.addChambre(new ChambreLuxe(8, "Chambre Luxe",true, 200, true, "Carte parking"));

        gestion.addRepas(new Repas(13, "Plat du jour", 1));
        gestion.addRepas(new Repas(13, "Club Sandwich", 2));
        gestion.addRepas(new Repas(13, "Poulet Yassa", 3));


        Scanner scanner = new Scanner(System.in);
        int option;
        boolean progCont = true;

        while (progCont) {
            System.out.println("Bienvenue dans notre hôtel\n");
            System.out.println("1. Je souhaite effectuer une réservation");
            System.out.println("2. Je souhaite modifier ma reservation");
            System.out.println("3. Je souhaite annuler ma réservation");
            System.out.println("4. Je souhaite avoir la liste des réservations");
            System.out.println("5. Je souhaite être renseigné sur les services et sur la sélection des repas ");
            System.out.println("6. Je souhaite réclamer ma facture");
            System.out.println("7. Quitter");
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
                    System.out.println("3. Je souhaite annuler ma réservation");
                    System.out.print("Veuillez entrez le numéro de réservation que vous souhaitez annuler: ");
                    int reservAID = scanner.nextInt();
                    gestion.annulerReservation(reservAID);
                    break;
                case 4:
                    System.out.println("4. Je souhaite avoir la liste des réservations");
                    gestion.listerReservations();

                    break;
                case 5:
                    System.out.println("5. Je souhaite être renseigné sur les services et sur la selection des repas ");
                    System.out.println("Très bien, pour quel type de chambre souhaitez-vous vous informer ?");
                    System.out.println("1. Pour la Chambre Classique!");
                    System.out.println("2. Pour la Chambre Luxueuse !");
                    System.out.println("3. Pour les Repas !");
                    System.out.print("Veuillez entrer votre choix: ");
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
                            System.out.println("Selection Plats (8 euros):  Plat du jour, Poulet Yassa, Club sandwich");
                            System.out.println("Vous pouvez choisir un plat par personne. Le total sera ajouté à votre facture lors de votre séjour.\n");
                            break;
                        default:
                            System.out.println("Choix invalide. Merci de bien vouloir réessayer\n");
                            break;
                    }
                    break;
                case 7:
                    progCont = false;
                    System.out.println("Merci d'avoir utilisé notre logiciel. A bientôt !");
                    break;
                case 6:
                    System.out.println("3. Je souhaite réclamer ma facture");
                    System.out.print("Veuillez entrez le numéro de réservation pour laquelle vous souhaitez une facture: ");
                    int reservFID = scanner.nextInt();
                    gestion.imprimerFacture(reservFID);
                    break;
                default:
                    System.out.println("Choix invalide. Merci de bien vouloir réessayer");
                    break;
            }
        }
        scanner.close();
    }
}
