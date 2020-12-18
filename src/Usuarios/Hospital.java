
package Usuarios;

public class Hospital {
    private String nombreHospital;
    private int aforo;
    
    public Hospital(String nombreHospital, int aforo){
        this.nombreHospital = nombreHospital;
        this.aforo = aforo;
    }
    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public int getAforo() {
        return aforo;
    }
}
