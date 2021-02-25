/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Main.Compañia;
import Main.Control;

/**
 *
 * @author this_serra
 */
public class Interfaz extends javax.swing.JFrame {
    
    private Control app;
    private Compañia company;
   
    /**
     * Creates new form Interfaz
     */
    public Interfaz(Control app) {
        this.app = app;
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numeroB = new javax.swing.JLabel();
        numeroP = new javax.swing.JLabel();
        numeroJ = new javax.swing.JLabel();
        numeroT = new javax.swing.JLabel();
        numeroE = new javax.swing.JLabel();
        menosProductoresB = new javax.swing.JButton();
        masProductoresB = new javax.swing.JButton();
        menosProductoresP = new javax.swing.JButton();
        masProductoresP = new javax.swing.JButton();
        menosProductoresJ = new javax.swing.JButton();
        masProductoresJ = new javax.swing.JButton();
        menosProductoresT = new javax.swing.JButton();
        masProductoresT = new javax.swing.JButton();
        menosProductoresT1 = new javax.swing.JButton();
        masProductoresT1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        labelBackg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numeroB.setText("0");
        jPanel1.add(numeroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        numeroP.setText("0");
        jPanel1.add(numeroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 10, -1));

        numeroJ.setText("0");
        jPanel1.add(numeroJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        numeroT.setText("0");
        jPanel1.add(numeroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        numeroE.setText("0");
        jPanel1.add(numeroE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        menosProductoresB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresB.setText("-");
        menosProductoresB.setAlignmentX(0.5F);
        menosProductoresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresBActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, -1, -1));

        masProductoresB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresB.setText("+");
        masProductoresB.setAlignmentX(0.5F);
        masProductoresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresBActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        menosProductoresP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresP.setText("-");
        menosProductoresP.setAlignmentX(0.5F);
        menosProductoresP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresPActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, -1, -1));

        masProductoresP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresP.setText("+");
        masProductoresP.setAlignmentX(0.5F);
        masProductoresP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresPActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, -1));

        menosProductoresJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresJ.setText("-");
        menosProductoresJ.setAlignmentX(0.5F);
        menosProductoresJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresJActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, -1, -1));

        masProductoresJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresJ.setText("+");
        masProductoresJ.setAlignmentX(0.5F);
        masProductoresJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresJActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        menosProductoresT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresT.setText("-");
        menosProductoresT.setAlignmentX(0.5F);
        menosProductoresT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresTActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));

        masProductoresT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresT.setText("+");
        masProductoresT.setAlignmentX(0.5F);
        masProductoresT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresTActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresT, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, -1));

        menosProductoresT1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresT1.setText("-");
        menosProductoresT1.setAlignmentX(0.5F);
        jPanel1.add(menosProductoresT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));

        masProductoresT1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresT1.setText("+");
        masProductoresT1.setAlignmentX(0.5F);
        jPanel1.add(masProductoresT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        labelBackg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Proyecto1-Sistemas-Operativos.png"))); // NOI18N
        jPanel1.add(labelBackg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 620));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    * Boton para finalizar el programa
    */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void masProductoresPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProductoresPActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroP.getText();
        numero = Integer.parseInt(texto);
        if(numero < 5 ){
            numero += 1;
            texto = String.valueOf(numero);
            numeroP.setText(texto);
        }
    }//GEN-LAST:event_masProductoresPActionPerformed

    private void menosProductoresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresBActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroB.getText();
        numero = Integer.parseInt(texto);
        if(numero  >0 ){
            numero -= 1;
            texto = String.valueOf(numero);
            numeroB.setText(texto);
        }
    }//GEN-LAST:event_menosProductoresBActionPerformed

    private void masProductoresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProductoresBActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroB.getText();
        numero = Integer.parseInt(texto);
        if(numero < 3 ){
            numero += 1;
            texto = String.valueOf(numero);
            numeroB.setText(texto);
        }
    }//GEN-LAST:event_masProductoresBActionPerformed

    private void menosProductoresPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresPActionPerformed
        // TODO add your handling code here:String texto;
        int numero;
        String texto;
        texto = numeroP.getText();
        numero = Integer.parseInt(texto);
        if(numero  >0 ){
            numero -= 1;
            texto = String.valueOf(numero);
            numeroP.setText(texto);
        }
    }//GEN-LAST:event_menosProductoresPActionPerformed

    private void masProductoresJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProductoresJActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroJ.getText();
        numero = Integer.parseInt(texto);
        if(numero < 4 ){
            numero += 1;
            texto = String.valueOf(numero);
            numeroJ.setText(texto);
        }
    }//GEN-LAST:event_masProductoresJActionPerformed

    private void menosProductoresJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresJActionPerformed
        // TODO add your handling code here:
        int numero;
        String texto;
        texto = numeroJ.getText();
        numero = Integer.parseInt(texto);
        if(numero  >0 ){
            numero -= 1;
            texto = String.valueOf(numero);
            numeroJ.setText(texto);
        }
    }//GEN-LAST:event_menosProductoresJActionPerformed

    private void masProductoresTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProductoresTActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroT.getText();
        numero = Integer.parseInt(texto);
        if(numero < 4 ){
            numero += 1;
            texto = String.valueOf(numero);
            numeroT.setText(texto);
        }
    }//GEN-LAST:event_masProductoresTActionPerformed

    private void menosProductoresTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresTActionPerformed
        // TODO add your handling code here:
        int numero;
        String texto;
        texto = numeroT.getText();
        numero = Integer.parseInt(texto);
        if(numero  >0 ){
            numero -= 1;
            texto = String.valueOf(numero);
            numeroT.setText(texto);
        }
    }//GEN-LAST:event_menosProductoresTActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBackg;
    private javax.swing.JButton masProductoresB;
    private javax.swing.JButton masProductoresJ;
    private javax.swing.JButton masProductoresP;
    private javax.swing.JButton masProductoresT;
    private javax.swing.JButton masProductoresT1;
    private javax.swing.JButton menosProductoresB;
    private javax.swing.JButton menosProductoresJ;
    private javax.swing.JButton menosProductoresP;
    private javax.swing.JButton menosProductoresT;
    private javax.swing.JButton menosProductoresT1;
    private javax.swing.JLabel numeroB;
    private javax.swing.JLabel numeroE;
    private javax.swing.JLabel numeroJ;
    private javax.swing.JLabel numeroP;
    private javax.swing.JLabel numeroT;
    // End of variables declaration//GEN-END:variables
}
