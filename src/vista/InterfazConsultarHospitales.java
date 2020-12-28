package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class InterfazConsultarHospitales extends javax.swing.JInternalFrame {

    void distritos() {
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
    
    public InterfazConsultarHospitales() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("NUESTROS HOSPITALES");

        jLabel2.setText("Distrito:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Atras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbodistrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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