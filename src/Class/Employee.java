

package Class;


public class Employee extends Persona{
    private String user;
    private String password;

    public Employee(String user, String password, String nombre, String telehone, String email, long cc) {
        super(nombre, telehone, email, cc);
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
