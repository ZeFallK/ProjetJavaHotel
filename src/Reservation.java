import java.util.Date;
public class Reservation {
    private static int numReservation = 1;
    private int reservID;
    private Client client;
    private Chambre chambre;
    private Repas repas;
    private int dureeSejour;
    private Date dateEntree;
    private Date dateSortie;


    public Reservation(Client client, Chambre chambre, Repas repas, int dureeSejour) {
        this.reservID = numReservation++;
        this.client = client;
        this.chambre = chambre;
        this.repas = repas;
        this.dureeSejour = dureeSejour;
//
    }

    public int getReservID() {
        return this.reservID;
    }
//
//    public void setNumReservation(int numReservation) {
//        this.numReservation = numReservation;
//    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Repas getRepas() {
        return repas;
    }

    public void setRepas(Repas repas) {
        this.repas = repas;
    }

    public int getDureeSejour() {
        return dureeSejour;
    }

    public void setDureeSejour(int dureeSejour) {
        this.dureeSejour = dureeSejour;
    }

//    public Date getDateEntree() {
//        return dateEntree;
//    }
//
//    public void setDateEntree(Date dateEntree) {
//        this.dateEntree = dateEntree;
//    }
//
//    public Date getDateSortie() {
//        return dateSortie;
//    }
//
//    public void setDateSortie(Date dateSortie) {
//        this.dateSortie = dateSortie;
//    }
}
