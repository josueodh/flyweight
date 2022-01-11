import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Client> clients = new ArrayList<>();

    public void register(String name, String employeeName, String employeeRegister){
        Employee employee = EmployeeFactory.getEmployee(employeeName, employeeRegister);
        Client client = new Client(name, employee);
        clients.add(client);
    }

    public List<String> listClients(){
        List<String> out = new ArrayList<String>();
        for(Client client: this.clients){
            out.add(client.getClient());
        }
        return out;
    }
}
