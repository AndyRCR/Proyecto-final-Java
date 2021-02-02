package vista;

import Usuarios.Hospital;
import Usuarios.Medico;
import Usuarios.Paciente;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.DAO.CitaMedicaDAO;
import modelo.DAO.HospitalDAO;
import modelo.DAO.MedicoDAO;

public class InterfazReservarCita extends javax.swing.JFrame {

    ArrayList<Hospital> hospitales;
    ArrayList<Medico> medicos;
    Paciente pa = new Paciente();
    Medico me = new Medico();
    Hospital ho = new Hospital();
    private Date fecha = new Date();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

    public void pasarPaciente(Paciente pa) {
        this.pa = pa;
    }

    public void mensaje(String m) {
        JOptionPane.showMessageDialog(null, m);
    }

    public void reiniciarCampos() {
        cboDistrito.setSelectedIndex(0);
        cboHoras.setSelectedIndex(0);
        cbovacuna.setSelectedIndex(0);
        cbofecha.setDate(null);
        cbofecha.setEnabled(false);
    }

    public void vacunas() {
        cbovacuna.addItem("Seleccione una vacuna");
        cbovacuna.addItem("Hepatitis B");
        cbovacuna.addItem("Difteria");
        cbovacuna.addItem("Tetanos");
        cbovacuna.addItem("Tosferina");
        cbovacuna.addItem("Poliomelitis");
        cbovacuna.addItem("Neumococo");
        cbovacuna.addItem("Rotavirus");
        cbovacuna.addItem("Sarampion");
        cbovacuna.addItem("Rubeola");
        cbovacuna.addItem("Parotiditis");
        cbovacuna.addItem("Varicela");
        cbovacuna.addItem("Papiloma Humano");
        cbovacuna.addItem("Covid-19");
    }

    public void distritos() {
        cboDistrito.addItem("Seleccion un distrito");
        cboDistrito.addItem("Ancón");
        cboDistrito.addItem("Ate Vitarte");
        cboDistrito.addItem("Barranco");
        cboDistrito.addItem("Breña");
        cboDistrito.addItem("Carabayllo");
        cboDistrito.addItem("Chaclacayo");
        cboDistrito.addItem("Chorrillos");
        cboDistrito.addItem("Cieneguilla");
        cboDistrito.addItem("Comas");
        cboDistrito.addItem("El Agustino");
        cboDistrito.addItem("Independencia");
        cboDistrito.addItem("Jesús María");
        cboDistrito.addItem("La Molina");
        cboDistrito.addItem("La Victoria");
        cboDistrito.addItem("Lima");
        cboDistrito.addItem("Lince");
        cboDistrito.addItem("Los Olivos");
        cboDistrito.addItem("Lurigancho");
        cboDistrito.addItem("Lurín");
        cboDistrito.addItem("Magdalena del Mar");
        cboDistrito.addItem("Miraflores");
        cboDistrito.addItem("Pachacamac");
        cboDistrito.addItem("Pucusana");
        cboDistrito.addItem("Pueblo Libre");
        cboDistrito.addItem("Puente Piedra");
        cboDistrito.addItem("Punta Hermosa");
        cboDistrito.addItem("Punta Negra");
        cboDistrito.addItem("Rímac");
        cboDistrito.addItem("San Bartolo");
        cboDistrito.addItem("San Borja");
        cboDistrito.addItem("San Isidro");
        cboDistrito.addItem("San Juan de Lurigancho");
        cboDistrito.addItem("San Juan de Miraflores");
        cboDistrito.addItem("San Luis");
        cboDistrito.addItem("San Martín de Porres");
        cboDistrito.addItem("San Miguel");
        cboDistrito.addItem("Santa Anita");
        cboDistrito.addItem("Santa María del Mar");
        cboDistrito.addItem("Santa Rosa");
        cboDistrito.addItem("Santiago de Surco");
        cboDistrito.addItem("Surquillo");
        cboDistrito.addItem("Villa El Salvador");
        cboDistrito.addItem("Villa María del Triunfo");
    }

    public void horas() {
        cboHoras.addItem("Seleccione la hora");
        cboHoras.addItem("08:00-09:00");
        cboHoras.addItem("09:00-10:00");
        cboHoras.addItem("10:00-11:00");
        cboHoras.addItem("11:00-12:00");
    }

    public void fecha() {
        cbofecha.setMinSelectableDate(fecha);
    }

    public void buscarHospitalesPorDistrito() {
        String nombre_hospital;
        cbohospital.removeAllItems();
        hospitales = HospitalDAO.buscarHospitalesPorDistrito(cboDistrito.getSelectedIndex());
        for (int i = 0; i < hospitales.size(); i++) {
            nombre_hospital = hospitales.get(i).getNombre_hospital();
            cbohospital.addItem(nombre_hospital);
        }
    }

    public void buscarMedicosPorHorario_Hospital() {
        String nombre_medico;
        Hospital ho = HospitalDAO.buscarHospitalPorNombre(cbohospital.getSelectedItem().toString());
        cbomedico.removeAllItems();
        medicos = MedicoDAO.buscarMedicosPorHorario_Hospital(cboHoras.getSelectedIndex(), ho.getId_hospital());
        for (int i = 0; i < medicos.size(); i++) {
            nombre_medico = medicos.get(i).getNombreMedico();
            cbomedico.addItem(nombre_medico);
        }
    }

    public void reservarCita() {
        Date date = cbofecha.getDate();
        me = MedicoDAO.buscarMedicoPorNombre(cbomedico.getSelectedItem().toString());
        ho = HospitalDAO.buscarHospitalPorNombre(cbohospital.getSelectedItem().toString());
        int conteo = CitaMedicaDAO.comprobarNumeroDePacientes(cbomedico.getSelectedItem().toString(), cboHoras.getSelectedIndex(), formatoFecha.format(date));
        mensaje("" + conteo);
        if (conteo < 6) {
            CitaMedicaDAO.crearCitaMedica(pa, ho, me, cboHoras.getSelectedIndex(), formatoFecha.format(date), cbovacuna.getSelectedIndex());
            mensaje("Cita reservada");
        } else {
            mensaje("No hay cupos para este horario y medico, por favor intente con otras opciones");
        }

        reiniciarCampos();
    }

    public InterfazReservarCita() {
        initComponents();
        fecha();
        distritos();
        horas();
        vacunas();
        cbohospital.setEnabled(false);
        cbomedico.setEnabled(false);
        cbofecha.setMinSelectableDate(fecha);
        setLocationRelativeTo(null);
        setTitle("Sistema de Vacunas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new ImagenFondo();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboDistrito = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbohospital = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboHoras = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbomedico = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbovacuna = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbofecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RESERVAR CITA");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Distrito:");

        cboDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDistritoActionPerformed(evt);
            }
        });

        jLabel2.setText("Establecimiento:");

        jLabel4.setText("Hora:");

        cboHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHorasActionPerformed(evt);
            }
        });

        jLabel7.setText("Medico:");

        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Vacuna:");

        jLabel9.setText("Fecha:");

        cbofecha.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbofecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbohospital, 0, 200, Short.MAX_VALUE)
                                .addComponent(cboDistrito, 0, 200, Short.MAX_VALUE)
                                .addComponent(cboHoras, 0, 200, Short.MAX_VALUE)
                                .addComponent(cbomedico, 0, 200, Short.MAX_VALUE)
                                .addComponent(cbovacuna, 0, 200, Short.MAX_VALUE)))
                        .addGap(158, 158, 158))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(cbohospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(cboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(cbomedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(cbovacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbofecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHorasActionPerformed
        if (cboHoras.getSelectedIndex() != 0) {
            cbomedico.setEnabled(true);
            buscarMedicosPorHorario_Hospital();
        } else {
            cbomedico.removeAllItems();
            cbomedico.setEnabled(false);
        }
    }//GEN-LAST:event_cboHorasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InterfazPaciente ventana = new InterfazPaciente();
        ventana.setVisible(true);
        ventana.pasarPaciente(pa);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDistritoActionPerformed
        if (cboDistrito.getSelectedIndex() != 0) {
            cbohospital.setEnabled(true);
            buscarHospitalesPorDistrito();
        } else {
            cbohospital.removeAllItems();
            cbohospital.setEnabled(false);
        }

    }//GEN-LAST:event_cboDistritoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (cboDistrito.getSelectedIndex() != 0 && cboHoras.getSelectedIndex() != 0 && cbovacuna.getSelectedIndex() != 0 && cbofecha.getDate() != null) {
            reservarCita();
        } else {
            mensaje("Rellene todos los campos");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazReservarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDistrito;
    private javax.swing.JComboBox<String> cboHoras;
    private com.toedter.calendar.JDateChooser cbofecha;
    private javax.swing.JComboBox<String> cbohospital;
    private javax.swing.JComboBox<String> cbomedico;
    private javax.swing.JComboBox<String> cbovacuna;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class ImagenFondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("fondo1.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }
}
