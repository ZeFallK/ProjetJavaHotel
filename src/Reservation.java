import java.util.Date;
public class Reservation {
    private int numReservation;
    private Client client;
    private Chambre chambre;
    private Repas repas;
    private Date dateEntree;
    private Date dateSortie;

    public Reservation(int numReservation, Client client, Chambre chambre, Repas repas, Date dateEntree, Date dateSortie) {
        this.numReservation = numReservation;
        this.client = client;
        this.chambre = chambre;
        this.repas = repas;
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
    }

    public int getNumReservation() {
        return numReservation;
    }

    public void setNumReservation(int numReservation) {
        this.numReservation = numReservation;
    }

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

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }
}
