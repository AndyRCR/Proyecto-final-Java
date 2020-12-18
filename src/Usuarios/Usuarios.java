package Usuarios;

public class Usuarios {

    private String nombre;
    private String dni;
    private String password;

    public Usuarios(String nombre, String dni, String password) {
        this.nombre = nombre;
        this.dni = dni;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return this.dni;
    }

    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validarUsuario(String dni) {
        //Solicitar la busqueda
        return true; // Modificar por resultado de la validación
    }

}
