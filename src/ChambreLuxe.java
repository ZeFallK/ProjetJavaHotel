public class ChambreLuxe extends Chambre {

    private String service;

    public ChambreLuxe(int numChambre, String nomChambre, boolean isLitSimple, float prixC, boolean isDispo, String service) {
        super(numChambre,nomChambre, isLitSimple, prixC, isDispo);

        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
