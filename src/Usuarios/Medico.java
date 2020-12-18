package Usuarios;

public class Medico extends Usuarios {
    private int codigoMedico;
    
    public Medico(String nombreMedico, String dniMedico, String contraseñaMedico, int codigoMedico) {
        super(nombreMedico, dniMedico, contraseñaMedico);
        this.codigoMedico = codigoMedico;
    }
    
    public String getNobreMedico(){
        return super.getNombre();
    }
    
}
