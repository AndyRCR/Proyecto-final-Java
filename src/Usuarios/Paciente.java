package Usuarios;

import java.util.Date;

public class Paciente extends Usuarios {
    private boolean estadoPaciente;
    private Date fechaCitaPaciente;
    
    public Paciente(String nombrePaciente, String dniPaciente, String contraseñaPaciente, boolean estadoPaciente, Date fechaCitaPaciente) {
        super(nombrePaciente, dniPaciente, contraseñaPaciente);
        this.estadoPaciente = estadoPaciente;
        this.fechaCitaPaciente = fechaCitaPaciente;
    }
    
    public String getNombrePaciente() {
        return super.getNombre();
    }

    public String getDniPaciente() {
        return super.getDNI();
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
