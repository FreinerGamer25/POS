
package Class;


abstract class Persona {
    private String nombre;
    private String telehone;
    private String email;
    private long cc;

    public Persona(String nombre, String telehone, String email, long cc) {
        this.nombre = nombre;
        this.telehone = telehone;
        this.email = email;
        this.cc = cc;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelehone() {
        return telehone;
    }

    public void setTelehone(String telehone) {
        this.telehone = telehone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }
    
}
