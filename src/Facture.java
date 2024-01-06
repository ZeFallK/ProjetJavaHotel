import java.io.Serializable;
import java.util.Date;
public class Facture implements Serializable {
    private Client client;
    private Chambre chambre;
    private Repas repas;
    private Date dateEntree;
    private Date dateSortie;
    private float total;

    public Facture(Client client, Chambre chambre, Repas repas, Date dateEntree, Date dateSortie, float total) {
        this.client = client;
        this.chambre = chambre;
        this.repas = repas;
        this.dateEntree = dateEntree;
        this.dateSortie = dateSortie;
        this.total = calculTot();
    }
    private float calculTot(){
        return 0.0f;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}