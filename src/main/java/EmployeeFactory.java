import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static Map<String, Employee> employees = new HashMap<>();

    public static Employee getEmployee(String name, String register){
        Employee employee = employees.get(register);
        if(employee == null){
            employee = new Employee(name, register);
            employees.put(register, employee);
        }
        return employee;
    }

    public static int getTotalEmplyees(){
        return employees.size();
    }
}
