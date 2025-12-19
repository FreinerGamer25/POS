

package Data;

import Class.Employee;
import java.util.List;


public class EmpoloyeesData {
 static private List<Employee> employees;
    static public void setEmployees(List<Employee> employees){
        EmpoloyeesData.employees=employees;
    }
    static private Employee getEmployee(long cc){
        for (Employee i : employees) {
            if(i.getCc() == cc){
                return i;
            }
        }
        return null;
    }
    static public boolean registerEmployee(String name, String telephone, String email, long cc, String user, String password){
        if (getEmployee(cc) != null){
            return false;
        }
        employees.add(new Employee(user, password, name, telephone, email, cc ));
        return true;
    }
    
   static public boolean removeEmployee(long cc){
       if (getEmployee(cc) == null){
            return false;
        }
       employees.removeIf(i-> i.getCc() == cc);
       return true;
   }
}
