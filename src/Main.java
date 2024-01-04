import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean progCont = true;

        while (progCont) {
            System.out.println("Welcome dans notre hôtel\n");
            System.out.println("1. Je veux faire une réservation");
            System.out.println("2.Je veux voir le detail des chambres");
            System.out.println("3. Je veux voir les repas");
            System.out.println("4. Quitter");
            System.out.print("Veuillez sélectionner une option:");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("le 1 marche");
                    break;
                case 2:
                    System.out.println("Ok, pour quel type de chambre souhaitez-vous vous informer ?");
                    System.out.println("1. Pour la Chambre Classique!");
                    System.out.println("2. Pour la Chambre Luxueuse !");
                    System.out.print("Entrez votre choix: ");
                    int choixChambre = scanner.nextInt();

                    switch (choixChambre){
                        case 1:
                            System.out.println("le choix 1");
                           break;
                        case 2:
                            System.out.println("le choix 2");
                            break;
                        default:
                            System.out.println("Le choix est invalide, veuillez réessayer !");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("le 3 marche");
                    break;
                case 4:
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