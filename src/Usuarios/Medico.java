package Usuarios;

public class Medico {

    private int idMedico;
    private String nombreMedico;
    private String dniMedico;
    private String contraseñaMedico;
    private int turno;
    private int idhospital;
    private String hora;

    public String getHora() {
        return hora;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        switch (turno) {
            case 1:
                hora = "8:00-9:00";
                break;
            case 2:
                hora = "9:00-10:00";
                break;
            case 3:
                hora = "10:00-11:00";
                break;
            case 4:
                hora = "11:00-12:00";
                break;
            default:
                break;
        }
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
