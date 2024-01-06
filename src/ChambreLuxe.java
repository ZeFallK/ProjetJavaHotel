public class ChambreLuxe extends Chambre {

    private String service; //wifi, mini-bar, etc

    public ChambreLuxe(int numChambre, boolean isLitSimple, float prix, boolean isDispo, String service) {
        super(numChambre, isLitSimple, prix, isDispo);

        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
