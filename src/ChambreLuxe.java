public class ChambreLuxe extends Chambre {
    private String themeChambre;//couleur, matiere
    private String service; //wifi, mini-bar, etc

    public ChambreLuxe(int numChambre, boolean isLitSimple, float prix, boolean isDispo, String themeChambre, String service) {
        super(numChambre, isLitSimple, prix, isDispo);
        this.themeChambre = themeChambre;
        this.service = service;
    }

    public String getThemeChambre() {
        return themeChambre;
    }

    public void setThemeChambre(String themeChambre) {
        this.themeChambre = themeChambre;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
