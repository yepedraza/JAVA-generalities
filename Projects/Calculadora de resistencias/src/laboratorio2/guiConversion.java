
package laboratorio2;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class guiConversion extends javax.swing.JFrame {

    public guiConversion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoRadioCU = new javax.swing.ButtonGroup();
        TittleCU = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCU = new javax.swing.JTable();
        UnidadesPanel = new javax.swing.JPanel();
        RadioBtnLongitud = new javax.swing.JRadioButton();
        RadioBtnMasa = new javax.swing.JRadioButton();
        RadioBtnMoneda = new javax.swing.JRadioButton();
        RadioBtnTemperatura = new javax.swing.JRadioButton();
        BtnConv = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TittleCU.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        TittleCU.setText("Conversión de Unidades");

        TablaCU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaCU.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(TablaCU);
        TablaCU.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        UnidadesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GrupoRadioCU.add(RadioBtnLongitud);
        RadioBtnLongitud.setText("Longitud");
        RadioBtnLongitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioBtnLongitudMouseClicked(evt);
            }
        });
        RadioBtnLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnLongitudActionPerformed(evt);
            }
        });

        GrupoRadioCU.add(RadioBtnMasa);
        RadioBtnMasa.setText("Masa");
        RadioBtnMasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioBtnMasaMouseClicked(evt);
            }
        });

        GrupoRadioCU.add(RadioBtnMoneda);
        RadioBtnMoneda.setText("Moneda");
        RadioBtnMoneda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioBtnMonedaMouseClicked(evt);
            }
        });
        RadioBtnMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnMonedaActionPerformed(evt);
            }
        });

        GrupoRadioCU.add(RadioBtnTemperatura);
        RadioBtnTemperatura.setText("Temperatura");
        RadioBtnTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioBtnTemperaturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UnidadesPanelLayout = new javax.swing.GroupLayout(UnidadesPanel);
        UnidadesPanel.setLayout(UnidadesPanelLayout);
        UnidadesPanelLayout.setHorizontalGroup(
            UnidadesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnidadesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UnidadesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioBtnTemperatura)
                    .addComponent(RadioBtnMasa)
                    .addComponent(RadioBtnLongitud)
                    .addComponent(RadioBtnMoneda))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        UnidadesPanelLayout.setVerticalGroup(
            UnidadesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UnidadesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioBtnLongitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioBtnMasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioBtnMoneda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioBtnTemperatura)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        BtnConv.setText("Convertir a otras unidades");
        BtnConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConvActionPerformed(evt);
            }
        });

        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(UnidadesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnConv, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnVolver)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(TittleCU)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TittleCU)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnConv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(BtnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UnidadesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 int CategoriaSeleccinada = 0;
 int UnidadSeleccionada = 0;
    private void RadioBtnLongitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBtnLongitudMouseClicked
        CategoriaSeleccinada = 1;  // 1 significa que seleccionó longitud 
        TablaCU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
            },
            new String [] {
                "Centimetros", "Metros", "Pies", "Pulgadas", "Millas"
            }
        )); 
    }//GEN-LAST:event_RadioBtnLongitudMouseClicked

    private void RadioBtnMasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBtnMasaMouseClicked
        CategoriaSeleccinada = 2;  // 2 significa que seleccionó Masa          
        TablaCU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
            },
            new String [] {
                "Gramos", "Kilogramos", "Libras", "Onzas"
            }
                 ));
    }//GEN-LAST:event_RadioBtnMasaMouseClicked

    private void BtnConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConvActionPerformed
        if  (TablaCU.getSelectedRow() < 0 || TablaCU.getSelectedColumn() < 0)
        {
          JOptionPane.showMessageDialog(null, "No ha seleccionado ningun campo. ");  
        }
        if ((TablaCU.getValueAt(TablaCU.getSelectedRow(), TablaCU.getSelectedColumn())) == null)
        {
        JOptionPane.showMessageDialog(null, "El campo seleccionado no tiene ningun valor,\nseleccione otro porfavor y de clic a convertir.");  
        }
        else
        {
        //DefaultTableModel model = (DefaultTableModel) TablaCU.getModel();
        //int columnas = model.getColumnCount();
        double x = Double.parseDouble(String.valueOf(TablaCU.getValueAt(TablaCU.getSelectedRow(), TablaCU.getSelectedColumn())));
        CUnidades FactorAConvertir = new CUnidades(x);
        UnidadSeleccionada = TablaCU.getSelectedColumn();
        if (CategoriaSeleccinada == 1)
       {
        double ResultadoLongitudes[] = FactorAConvertir.convertirLongitud(UnidadSeleccionada);
        TablaCU.setValueAt(String.valueOf(ResultadoLongitudes[0]), 0, 0);
         TablaCU.setValueAt(String.valueOf(ResultadoLongitudes[1]), 0, 1);
          TablaCU.setValueAt(String.valueOf(ResultadoLongitudes[2]), 0, 2);
           TablaCU.setValueAt(String.valueOf(ResultadoLongitudes[3]), 0, 3);
           TablaCU.setValueAt(String.valueOf(ResultadoLongitudes[4]), 0, 4);
       }
       else if (CategoriaSeleccinada == 2)
               {
        double ResultadoMasas[] = FactorAConvertir.convertirMasa(UnidadSeleccionada);
         TablaCU.setValueAt(String.valueOf(ResultadoMasas[0]), 0, 0);
         TablaCU.setValueAt(String.valueOf(ResultadoMasas[1]), 0, 1);
          TablaCU.setValueAt(String.valueOf(ResultadoMasas[2]), 0, 2);
          TablaCU.setValueAt(String.valueOf(ResultadoMasas[3]), 0, 3);
               }
        else if (CategoriaSeleccinada == 3)
               {
        double ResultadoMonedas[] = FactorAConvertir.convertirMoneda(UnidadSeleccionada);
         TablaCU.setValueAt(String.valueOf(ResultadoMonedas[0]), 0, 0);
         TablaCU.setValueAt(String.valueOf(ResultadoMonedas[1]), 0, 1);
          TablaCU.setValueAt(String.valueOf(ResultadoMonedas[2]), 0, 2);
          TablaCU.setValueAt(String.valueOf(ResultadoMonedas[3]), 0, 3);
               }
         else if (CategoriaSeleccinada == 4)
               {
        double ResultadoTemperaturas[] = FactorAConvertir.convertirTemperatura(UnidadSeleccionada);
         TablaCU.setValueAt(String.valueOf(ResultadoTemperaturas[0]), 0, 0);
         TablaCU.setValueAt(String.valueOf(ResultadoTemperaturas[1]), 0, 1);
          TablaCU.setValueAt(String.valueOf(ResultadoTemperaturas[2]), 0, 2);
               }
        
        }
    }//GEN-LAST:event_BtnConvActionPerformed

    private void RadioBtnMonedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBtnMonedaMouseClicked
        CategoriaSeleccinada = 3;  // 3 significa que seleccionó Moneda    
        TablaCU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
            },
            new String [] {
                "COP", "Dolares", "Euros", "Yen japonés"
            }
                 ));
    }//GEN-LAST:event_RadioBtnMonedaMouseClicked

    private void RadioBtnTemperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBtnTemperaturaMouseClicked
            CategoriaSeleccinada = 4;  // 4 significa que seleccionó Temperatura  
        TablaCU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
            },
            new String [] {
                "Celcius", "Kelvin", "Farenheit"
            }
                 ));
    }//GEN-LAST:event_RadioBtnTemperaturaMouseClicked

    private void RadioBtnMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtnMonedaActionPerformed

    private void RadioBtnLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtnLongitudActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed


        Ventana V = new Ventana();

V.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVolverActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new guiConversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConv;
    private javax.swing.JButton BtnVolver;
    public static javax.swing.ButtonGroup GrupoRadioCU;
    private javax.swing.JRadioButton RadioBtnLongitud;
    private javax.swing.JRadioButton RadioBtnMasa;
    private javax.swing.JRadioButton RadioBtnMoneda;
    private javax.swing.JRadioButton RadioBtnTemperatura;
    private javax.swing.JTable TablaCU;
    private javax.swing.JLabel TittleCU;
    private javax.swing.JPanel UnidadesPanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
