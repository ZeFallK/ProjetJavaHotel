import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Gestion {
    private List<Chambre> room =new ArrayList<>();
    private List<Reservation> command =new ArrayList<>();
    private List<Client> customer =new ArrayList<>();
    private List<Repas> food =new ArrayList<>();

    //faire constructeur

    public void addClient(Client client){
        customer.add(client);
    }
    public void addChambre(Chambre chambre){
        room.add(chambre);
    }
    public void addRepas(Repas repas){
        food.add(repas);
    }
}
