package Usuarios;

public class Usuarios {

    private String nombre;
    private int DNI;
    private String password;

    public Usuarios() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validarUsuario(int DNI) {
        //Solicitar la busqueda
        return true; // Modificar por resultado de la validación
    }

}
