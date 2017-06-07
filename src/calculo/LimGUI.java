/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio Castillo
 */
public class LimGUI extends javax.swing.JFrame {

    /**
     * Creates new form LimGUI
     */
    InitGUI ventanaPrincipal;
    String funcionString;
    Double variableX = null;
    
    public LimGUI(InitGUI ventanaPrincipal, String funcionString) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.funcionString = funcionString;
        función.setText("Función = "+funcionString);
        this.setTitle(ventanaPrincipal.getTitle());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        función = new javax.swing.JLabel();
        valorX = new javax.swing.JTextField();
        labelPuntoX = new javax.swing.JLabel();
        calculoLimite = new javax.swing.JButton();
        graficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        titulo.setText("Cálculo del Límite");

        función.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        función.setText("Función ");

        valorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorXActionPerformed(evt);
            }
        });

        labelPuntoX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPuntoX.setText("Punto X ");

        calculoLimite.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        calculoLimite.setText("Calcular ");
        calculoLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoLimiteActionPerformed(evt);
            }
        });

        graficar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        graficar.setText("Graficar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(calculoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(graficar)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(función)
                            .addComponent(labelPuntoX)
                            .addComponent(valorX, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(28, 28, 28)
                .addComponent(función)
                .addGap(37, 37, 37)
                .addComponent(labelPuntoX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculoLimite)
                    .addComponent(graficar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorXActionPerformed

    private void calculoLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoLimiteActionPerformed
        // TODO add your handling code here:
        if (ventanaPrincipal.checkValue(valorX.getText())){
            variableX = Double.parseDouble(valorX.getText());    
        }else
        {
            JOptionPane.showMessageDialog(null,"El valor X no es un número o "
                    + "el campo está vacio",
                    "Variable Incompatible",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calculoLimiteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        ventanaPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculoLimite;
    private javax.swing.JLabel función;
    private javax.swing.JButton graficar;
    private javax.swing.JLabel labelPuntoX;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField valorX;
    // End of variables declaration//GEN-END:variables
}
