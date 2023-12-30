public class Client {
    private String prenom;
    private String nom;
    private int clientID;

    public Client(String prenom, String nom, int clientID) {
        this.prenom = prenom;
        this.nom = nom;
        this.clientID = clientID;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
}
