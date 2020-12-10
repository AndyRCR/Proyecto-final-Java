package vista;

public class AgendaVacunas extends javax.swing.JInternalFrame {

    public AgendaVacunas() {
        initComponents();
        distritos();
        horas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cboDistrito = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        cboHoras = new javax.swing.JComboBox<>();

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CREACIÓN DE CUENTA");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Escoger distrito");

        jLabel2.setText("Escoger hospital o posta medica");

        jLabel4.setText("Hora");

        jLabel7.setText("Doctores disponibles");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agenda de Vacunas");

        jButton1.setText("Reservar");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboHoras, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addComponent(cboDistrito, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cboDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
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

    void distritos() {
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

    void horas() {
        cboHoras.addItem("08:00-09:00");
        cboHoras.addItem("09:00-10:00");
        cboHoras.addItem("10:00-11:00");
        cboHoras.addItem("11:00-12:00");
        cboHoras.addItem("12:00-13:00");
        cboHoras.addItem("13:00-14:00");
        cboHoras.addItem("14:00-15:00");
        cboHoras.addItem("15:00-16:00");
    }

    private void cboHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHorasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboDistrito;
    private javax.swing.JComboBox<String> cboHoras;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
