package Usuarios;

public class CitaMedica {

    private int idcita;
    private int idpaciente;
    private int idhospital;
    private String fecha;
    private int turno;
    private String medico_asignado;
    private int estado;
    private int idvacuna;
    private String hora;

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getIdhospital() {
        return idhospital;
    }

    public void setIdhospital(int idhospital) {
        this.idhospital = idhospital;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
            case 5:
                hora = "12:00-13:00";
                break;
            case 6:
                hora = "13:00-14:00";
                break;
            case 7:
                hora = "14:00-15:00";
                break;
            case 8:
                hora = "15:00-16:00";
                break;
            default:
                break;
        }
        this.turno = turno;
    }

    public String getHora() {
        return hora;
    }

    public String getMedico_asignado() {
        return medico_asignado;
    }

    public void setMedico_asignado(String medico_asignado) {
        this.medico_asignado = medico_asignado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdvacuna() {
        return idvacuna;
    }

    public void setIdvacuna(int idvacuna) {
        this.idvacuna = idvacuna;
    }

}
