package Usuarios;

public class Medico{
    
    private int idMedico;
    private String nombreMedico;
    private String dniMedico;
    private String contraseñaMedico;
    private int turno;
    private int idhospital;

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getIdhospital() {
        return idhospital;
    }

    public void setIdhospital(int idhospital) {
        this.idhospital = idhospital;
    }
    

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getDniMedico() {
        return dniMedico;
    }

    public void setDniMedico(String dniMedico) {
        this.dniMedico = dniMedico;
    }

    public String getContraseñaMedico() {
        return contraseñaMedico;
    }

    public void setContraseñaMedico(String contraseñaMedico) {
        this.contraseñaMedico = contraseñaMedico;
    }


    
}
