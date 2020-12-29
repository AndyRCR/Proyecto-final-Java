package Usuarios;

import java.util.Date;

public class Paciente {
    private String nombrePaciente;
    private String dniPaciente;
    private String contraseñaPaciente;
    private boolean estadoPaciente;
    private Date fechaCitaPaciente;
    
    public Paciente(String nombrePaciente, String dniPaciente, String contraseñaPaciente, boolean estadoPaciente, Date fechaCitaPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.dniPaciente = dniPaciente;
        this.contraseñaPaciente = contraseñaPaciente;
        this.estadoPaciente = estadoPaciente;
        this.fechaCitaPaciente = fechaCitaPaciente;
    }
    
    public String getNombrePaciente() {
        return this.nombrePaciente;
    }

    public String getDniPaciente() {
        return this.dniPaciente;
    }

    public boolean getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(boolean estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }
    
    public Date getFechaCitaPaciente() {
        return fechaCitaPaciente;
    }

    public void setFechaCitaPaciente(Date fechaCitaPaciente) {
        this.fechaCitaPaciente = fechaCitaPaciente;
    }
    
}
