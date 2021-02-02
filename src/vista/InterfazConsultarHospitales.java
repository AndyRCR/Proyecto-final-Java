package vista;

import Usuarios.Hospital;
import Usuarios.Paciente;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.DAO.HospitalDAO;

public class InterfazConsultarHospitales extends javax.swing.JFrame {

    Paciente pa;

    public void pasarPaciente(Paciente pa) {
        this.pa = pa;
    }

    void distritos() {
        cbodistrito.addItem("Seleccione un distrito");
        cbodistrito.addItem("Ancón");
        cbodistrito.addItem("Ate Vitarte");
        cbodistrito.addItem("Barranco");
        cbodistrito.addItem("Breña");
        cbodistrito.addItem("Carabayllo");
        cbodistrito.addItem("Chaclacayo");
        cbodistrito.addItem("Chorrillos");
        cbodistrito.addItem("Cieneguilla");
        cbodistrito.addItem("Comas");
        cbodistrito.addItem("El Agustino");
        cbodistrito.addItem("Independencia");
        cbodistrito.addItem("Jesús María");
        cbodistrito.addItem("La Molina");
        cbodistrito.addItem("La Victoria");
        cbodistrito.addItem("Lima");
        cbodistrito.addItem("Lince");
        cbodistrito.addItem("Los Olivos");
        cbodistrito.addItem("Lurigancho");
        cbodistrito.addItem("Lurín");
        cbodistrito.addItem("Magdalena del Mar");
        cbodistrito.addItem("Miraflores");
        cbodistrito.addItem("Pachacamac");
        cbodistrito.addItem("Pucusana");
        cbodistrito.addItem("Pueblo Libre");
        cbodistrito.addItem("Puente Piedra");
        cbodistrito.addItem("Punta Hermosa");
        cbodistrito.addItem("Punta Negra");
        cbodistrito.addItem("Rímac");
        cbodistrito.addItem("San Bartolo");
        cbodistrito.addItem("San Borja");
        cbodistrito.addItem("San Isidro");
        cbodistrito.addItem("San Juan de Lurigancho");
        cbodistrito.addItem("San Juan de Miraflores");
        cbodistrito.addItem("San Luis");
        cbodistrito.addItem("San Martín de Porres");
        cbodistrito.addItem("San Miguel");
        cbodistrito.addItem("Santa Anita");
        cbodistrito.addItem("Santa María del Mar");
        cbodistrito.addItem("Santa Rosa");
        cbodistrito.addItem("Santiago de Surco");
        cbodistrito.addItem("Surquillo");
        cbodistrito.addItem("Villa El Salvador");
        cbodistrito.addItem("Villa María del Triunfo");
    }

    public void seleccionarHospital() {
        int index = tablaHospitales.getSelectedRow();

        lblhospital.setText(tablaHospitales.getValueAt(index, 0).toString());
        lbldireccion.setText(tablaHospitales.getValueAt(index, 1).toString());
    }

    public void listarHospitales() {
        lblhospital.setText("");
        lbldireccion.setText("");

        String c[] = {"Hospital", "Direccion"};
        DefaultTableModel mod = new DefaultTableModel(null, c) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tablaHospitales.setModel(mod);

        ArrayList<Hospital> hospitales = HospitalDAO.buscarHospitalesPorDistrito(cbodistrito.getSelectedIndex());

        for (Hospital x : hospitales) {
            mod.addRow(new Object[]{x.getNombre_hospital(), x.getDireccion_hospital()});
        }
    }

    public InterfazConsultarHospitales() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistema de Vacunas");
        distritos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new ImagenFondo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbodistrito = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHospitales = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lblhospital = new javax.swing.JLabel();
        lblaforo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("NUESTROS HOSPITALES");

        jLabel2.setText("Distrito:");

        cbodistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodistritoActionPerformed(evt);
            }
        });

        tablaHospitales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaHospitales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHospitalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHospitales);
        if (tablaHospitales.getColumnModel().getColumnCount() > 0) {
            tablaHospitales.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Hospitales en el distrito:");

        jLabel4.setText("Hospital:");

        jLabel5.setText("Direccion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblhospital, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                    .addComponent(lblaforo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblhospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblaforo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterfazPaciente ventana = new InterfazPaciente();
        ventana.setVisible(true);
        ventana.pasarPaciente(pa);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbodistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodistritoActionPerformed
        listarHospitales();
    }//GEN-LAST:event_cbodistritoActionPerformed

    private void tablaHospitalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHospitalesMouseClicked
        seleccionarHospital();
    }//GEN-LAST:event_tablaHospitalesMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazConsultarHospitales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbodistrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblaforo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblhospital;
    private javax.swing.JTable tablaHospitales;
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
