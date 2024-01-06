public class Chambre {
    private int numChambre;
    private String nomChambre;
    private boolean isLitSimple;
    private float prixC;
    private boolean isDispo;
    public Chambre(int numChambre, String nomChambre, boolean isLitSimple, float prixC, boolean isDispo) {
        this.numChambre = numChambre;
        this.nomChambre = nomChambre;
        this.isLitSimple = true;
        this.prixC = prixC;
        this.isDispo = true;
    }
    public String getNomChambre() {
        return nomChambre;
    }
    public void setNomChambre(String nomChambre) {
        this.nomChambre = nomChambre;
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
    public float getPrixC() {
        return prixC;
    }
    public boolean isDispo() {// ou return isDispo; de base
        return true;
    }
    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }
    public void setPrix(float prix) {
        this.prixC = prix;
    }
    public void setDispo(boolean dispo) {
        isDispo = dispo;
    }
}
