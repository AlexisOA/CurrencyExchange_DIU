package com.mycompany.practica_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class CurrencyExchange extends javax.swing.JFrame {

    public CurrencyExchange() {
        initComponents();
        grupo_botones.add(dolaraeuro);
        grupo_botones.add(euroadolar);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etiqueta_cantidad = new javax.swing.JLabel();
        texto_cantidad = new javax.swing.JTextField();
        etiqueta_moneda = new javax.swing.JLabel();
        euroadolar = new javax.swing.JRadioButton();
        dolaraeuro = new javax.swing.JRadioButton();
        etiqueta_cambio = new javax.swing.JLabel();
        texto_cambio = new javax.swing.JTextField();
        botonaceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("CURRENCY EXCHANGE");

        etiqueta_cantidad.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        etiqueta_cantidad.setForeground(new java.awt.Color(0, 255, 255));
        etiqueta_cantidad.setText("Amount:");

        etiqueta_moneda.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        etiqueta_moneda.setForeground(new java.awt.Color(0, 255, 255));
        etiqueta_moneda.setText("Currency:");

        euroadolar.setForeground(new java.awt.Color(0, 255, 255));
        euroadolar.setText("€ to $");
        euroadolar.setActionCommand("");

        dolaraeuro.setForeground(new java.awt.Color(0, 255, 255));
        dolaraeuro.setText("$ to €");

        etiqueta_cambio.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        etiqueta_cambio.setForeground(new java.awt.Color(0, 255, 255));
        etiqueta_cambio.setText("Change:");

        botonaceptar.setBackground(new java.awt.Color(0, 255, 255));
        botonaceptar.setText("Send");
        botonaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonaceptarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Example: 1.18");

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Example: 20.5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiqueta_moneda)
                            .addComponent(etiqueta_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(texto_cantidad)
                                .addComponent(texto_cambio)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(euroadolar)
                                .addGap(18, 18, 18)
                                .addComponent(dolaraeuro)))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euroadolar)
                    .addComponent(dolaraeuro)
                    .addComponent(etiqueta_moneda))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta_cambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(botonaceptar)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonaceptarActionPerformed
        exchange();
    }//GEN-LAST:event_botonaceptarActionPerformed

    public void exchange(){
        float resultado = 0;
        if(texto_cantidad.getText().equals("") || texto_cambio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter an amount or change");
            
        }else if(!dolaraeuro.isSelected() && !euroadolar.isSelected()){
            JOptionPane.showMessageDialog(null, "Select a currency exchange");
        }else{
            float cantidad = Float.parseFloat(texto_cantidad.getText());
            float cambio = Float.parseFloat(texto_cambio.getText());

            if(grupo_botones.getSelection().equals(dolaraeuro.getModel())) {
                resultado = cantidad * cambio;
                JOptionPane.showMessageDialog(null, "The exchange rate is: " + String.format("%.2f", resultado) + " €");
            }else{
                resultado = cantidad * cambio;
                JOptionPane.showMessageDialog(null, "The exchange rate is: " + String.format("%.2f", resultado) + " $");
            }  
        }
        texto_cantidad.setText("");
        texto_cambio.setText("");
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyExchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyExchange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonaceptar;
    private javax.swing.JRadioButton dolaraeuro;
    private javax.swing.JLabel etiqueta_cambio;
    private javax.swing.JLabel etiqueta_cantidad;
    private javax.swing.JLabel etiqueta_moneda;
    private javax.swing.JRadioButton euroadolar;
    private javax.swing.ButtonGroup grupo_botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField texto_cambio;
    private javax.swing.JTextField texto_cantidad;
    // End of variables declaration//GEN-END:variables
}
