import java.util.Date;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean progCont = true;

        while (progCont) {
            System.out.println("Welcome dans notre hôtel\n");
            System.out.println("1. Je veux faire une réservation");
            System.out.println("2. Je veux modifier ma reservation");
            System.out.println("3. Je veux annuler ma réservation");
            System.out.println("4. Je veux avoir la liste des réservations");
            System.out.println("5. Je veux me renseigner sur les services et les repas disponibles ");
            System.out.println("6. Quitter");
            System.out.print("Veuillez sélectionner une option:");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("le 1 marche");
                    break;
                case 2:

                    break;
//faire switch ici
                case 3:
                    System.out.println("3. Je veux annuler ma réservation");
                    break;
                case 4:
                    System.out.println("4. Je veux avoir la liste des réservations");
                    break;
                case 5:
                    System.out.println("5. Je veux me renseigner sur les services et les repas disponibles ");
                    System.out.println("Ok, pour quel type de chambre souhaitez-vous vous informer ?");
                    System.out.println("1. Pour la Chambre Classique!");
                    System.out.println("2. Pour la Chambre Luxueuse !");
                    System.out.println("3. Pour les Repas !");
                    System.out.print("Entrez votre choix: ");
                    int choix5 = scanner.nextInt();
                    switch (choix5){
                        case 1:
                            System.out.println("Découvrez notre chambre classique, un choix abordable pour votre séjour.");
                            System.out.println("Choisissez entre un lit simple ou double pour votre confort et votre besoin.");
                            System.out.println("Réservez dès maintenant pour un séjour confortable et économique !\n");
                            break;
                        case 2:
                            System.out.println("Découvrez le summum du confort dans notre chambre de luxe.");
                            System.out.println("Conservez les avantages de la chambre classique, tout en vous offrant une expérience exceptionnelle.");
                            System.out.println("Vous pourrez entierement configurer votre durant la reservations en ajoutant une terrasse, des équipements hauts de gamme ou encore une douche à effet pluie !");
                            System.out.println("Profitez du service de conciergerie 24/7 et d'un accès exclusif au salon VIP.");
                            System.out.println("Réservez dès maintenant votre séjour pour une expérience inoubliable !\n");

                            break;
                        case 3:
                            System.out.println("Complétez votre séjour dans nos chambres en choisissant un délicieux repas pour chaque étape de votre journée.");
                            System.out.println("Nous vous proposons un menu varié avec une sélection de plats et de desserts:");
                            System.out.println("Selection Plats (8 euros):  Burger/Frites classique, Poulet yassa, Pâtes à la carbonara, Salade César avec poulet grillé, Pizza");
                            System.out.println("Selection Desserts (5 euros): Tiramisu, Crumble aux pommes, Mousse aux chocolat, Crème brulée à la vanille, Glace à l'italienne");
                            System.out.println("Vous pouvez choisir un plat et un dessert par personne. Le total sera ajouté à votre facture lors de votre séjour.\n");
                            break;
                        default:
                            System.out.println("Choix invalide. Merci de bien vouloir réessayer\n");
                            break;
                    }
                    break;
                case 6:
                    progCont = false;
                    System.out.println("Merci d'avoir utiliser notre logiciel. A bientôt !");
                    break;
                default:
                    System.out.println("Choix invalide. Merci de bien vouloir réessayer");
                    break;
            }
        }
        scanner.close();
        //ajouter exceptions sur entrée utilisateur;

//        System.out.println("Welcome dans notre hôtel");
//        Client client = new Client("Alpha", "Diallo", 1);
//        Chambre chambre1 = new Chambre(4,true,80,true);
//        Repas commandeRepas = new Repas(80, "Pates", "Faln");
//        Date dateEntree = new Date(2023 , 9, 1); // Attention, les mois commencent à 0
//        Date dateSortie = new Date(2023, 9, 5);
//        int numReservation = 1;
//
//        // Création de la réservation
//        Reservation reservation1 = new Reservation(numReservation, client, chambre1, commandeRepas, dateEntree, dateSortie);
//
//        // Affichage des informations de la réservation
//        System.out.println("Réservation créée pour " + client.getPrenom() + " " + client.getNom());
//        System.out.println("Chambre: " + chambre1.getNumChambre());
//        System.out.println("Date d'arrivée: " + dateEntree);
//        System.out.println("Date de départ: " + dateSortie);


    }
}
