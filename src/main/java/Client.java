public class Client {
    private String name;
    private Employee employee;

    public Client(String name, Employee employee){
        this.name = name;
        this.employee = employee;
    }

    public String getClient(){
        return "Client{" + "name: '" + this.name + '\'' +
                ", employee: '" + employee.getName() + '\'' +
                ", register: '" + employee.getRegister() + '\'' +
                '}';
    }
}
