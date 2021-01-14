package Usuarios;

import java.util.Date;

public class Paciente {
    private int idPaciente;
    private String nombrePaciente;
    private String dniPaciente;
    private String contraseñaPaciente;
    private int estadoPaciente;
    private Date fechaCitaPaciente;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public String getContraseñaPaciente() {
        return contraseñaPaciente;
    }

    public void setContraseñaPaciente(String contraseñaPaciente) {
        this.contraseñaPaciente = contraseñaPaciente;
    }

    public int getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(int estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public Date getFechaCitaPaciente() {
        return fechaCitaPaciente;
    }

    public void setFechaCitaPaciente(Date fechaCitaPaciente) {
        this.fechaCitaPaciente = fechaCitaPaciente;
    }

    
    
}
