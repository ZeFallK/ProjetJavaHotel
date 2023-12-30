public class Repas {
    private double prix;
    private String plat;
    private String dessert;

    public Repas(double prix, String plat, String dessert){
        this.prix = prix;
        this.plat = plat;
        this.dessert = dessert;
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

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }
}
