
package Data;
import Class.Client;
import java.util.List;

public class ClientsData {
    static private List<Client> clients;
    static public void setClients(List<Client> clients){
        ClientsData.clients = clients;
    }
    static private Client getClient(long cc){
        for (Client client : clients) {
            if(client.getCc() == cc){
                return client;
            }
        }
        return null;
    }
    static public boolean registerClient(String name, String telephone, String email, long cc){
        if (getClient(cc) != null){
            return false;
        }
        clients.add(new Client(name, telephone, email, cc));
        return true;
    }
    
   static public boolean removeClient(long cc){
       if (getClient(cc) == null){
            return false;
        }
       clients.removeIf(clint -> clint.getCc() == cc);
       return true;
   }
}
