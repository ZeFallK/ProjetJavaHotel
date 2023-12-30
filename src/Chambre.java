public class Chambre {
    private int numChambre;
    private boolean isLitSimple;
    private float prix;
    private boolean isDispo;

    public Chambre(int numChambre, boolean isLitSimple, float prix, boolean isDispo) {
        this.numChambre = numChambre;
        this.isLitSimple = isLitSimple;
        this.prix = prix;
        this.isDispo = isDispo;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public boolean isLitSimple() {
        return isLitSimple;
    }

    public void setIsLitSimple(boolean isLitSimple) {
        this.isLitSimple = isLitSimple;
    }

    public float getPrix() {
        return prix;
    }

    public boolean isDispo() {
        return isDispo;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDispo(boolean dispo) {
        isDispo = dispo;
    }
}
