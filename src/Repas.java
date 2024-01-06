public class Repas  {
    private float prixR;
    private String plat;
    private int  numRepas;

    public Repas(float prix, String plat, int numRepas){
        this.prixR = prix;
        this.plat = plat;
        this.numRepas = numRepas;
    }

    public float getPrixR() {
        return prixR;
    }
    public void setPrixR(float prix) {
        this.prixR = prix;
    }
    public String getPlat() {
        return plat;
    }
    public void setPlat(String plat) {
        this.plat = plat;
    }
    public int getNumRepas() {
        return numRepas;
    }
    public void setNumRepas(int numRepas) {
        this.numRepas = numRepas;
    }
}
