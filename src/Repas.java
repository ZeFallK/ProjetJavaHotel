public class Repas  {
    private double prix;
    private String plat;
    private int  numRepas;



    public Repas(double prix, String plat, int numRepas){
        this.prix = prix;
        this.plat = plat;
        this.numRepas = numRepas;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
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
