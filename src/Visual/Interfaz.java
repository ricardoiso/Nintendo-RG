/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Main.Buffer;
import Main.Compañia;
import Main.Control;
import Main.Productor;
import javax.swing.JOptionPane;

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
        this.setResizable(true);

        //Seteados productores a valores iniciales de compañia
        this.numeroB.setText(String.valueOf(app.getCompany().getIniProBtn()));
        this.numeroP.setText(String.valueOf(app.getCompany().getIniProPant()));
        this.numeroJ.setText(String.valueOf(app.getCompany().getIniProJoy()));
        this.numeroT.setText(String.valueOf(app.getCompany().getIniProSD()));

        // Seteados ensambladores, dias restantes para despliegue global
        this.numeroE.setText(String.valueOf(app.getCompany().getIniEnsambladores()));
        this.diasRestantes.setText(String.valueOf(app.getCompany().getDiasDespacho()));

        /*
        while(true){
        int DR = app.getJefe().getDiasRestantesDespliegue();
        String text = String.valueOf(DR);
        diasRestantes.setText(text);
        }*/
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
        numCB = new javax.swing.JLabel();
        numCPantN = new javax.swing.JLabel();
        numCPantT = new javax.swing.JLabel();
        numCJoy = new javax.swing.JLabel();
        numCSD = new javax.swing.JLabel();
        numeroB = new javax.swing.JLabel();
        numeroP = new javax.swing.JLabel();
        numeroJ = new javax.swing.JLabel();
        numeroT = new javax.swing.JLabel();
        numeroE = new javax.swing.JLabel();
        numConsolas = new javax.swing.JLabel();
        diasRestantes = new javax.swing.JLabel();
        jefeEstado = new javax.swing.JLabel();
        gerenteEstado = new javax.swing.JLabel();
        menosProductoresB = new javax.swing.JButton();
        masProductoresB = new javax.swing.JButton();
        menosProductoresP = new javax.swing.JButton();
        masProductoresP = new javax.swing.JButton();
        menosProductoresJ = new javax.swing.JButton();
        masProductoresJ = new javax.swing.JButton();
        menosProductoresT = new javax.swing.JButton();
        masProductoresT = new javax.swing.JButton();
        menosEnsambladores = new javax.swing.JButton();
        masEnsambladores = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        labelBackg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numCB.setText("0");
        jPanel1.add(numCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 20, -1));

        numCPantN.setText("0");
        jPanel1.add(numCPantN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 30, -1));

        numCPantT.setText("0");
        jPanel1.add(numCPantT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 20, -1));

        numCJoy.setText("0");
        jPanel1.add(numCJoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 30, -1));

        numCSD.setText("0");
        jPanel1.add(numCSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 30, -1));

        numeroB.setText("0");
        jPanel1.add(numeroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 20, -1));

        numeroP.setText("0");
        jPanel1.add(numeroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 20, -1));

        numeroJ.setText("0");
        jPanel1.add(numeroJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 30, -1));

        numeroT.setText("0");
        jPanel1.add(numeroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 20, -1));

        numeroE.setText("0");
        jPanel1.add(numeroE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 20, -1));

        numConsolas.setText("0");
        jPanel1.add(numConsolas, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 30, -1));

        diasRestantes.setText("0");
        jPanel1.add(diasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 20, -1));

        jefeEstado.setText("  ");
        jPanel1.add(jefeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 260, -1));

        gerenteEstado.setText("  ");
        jPanel1.add(gerenteEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 250, -1));

        menosProductoresB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresB.setText("-");
        menosProductoresB.setAlignmentX(0.5F);
        menosProductoresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresBActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        masProductoresB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresB.setText("+");
        masProductoresB.setAlignmentX(0.5F);
        masProductoresB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresBActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        menosProductoresP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresP.setText("-");
        menosProductoresP.setAlignmentX(0.5F);
        menosProductoresP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresPActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        masProductoresP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresP.setText("+");
        masProductoresP.setAlignmentX(0.5F);
        masProductoresP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresPActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, -1, -1));

        menosProductoresJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresJ.setText("-");
        menosProductoresJ.setAlignmentX(0.5F);
        menosProductoresJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresJActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, -1, -1));

        masProductoresJ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresJ.setText("+");
        masProductoresJ.setAlignmentX(0.5F);
        masProductoresJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresJActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        menosProductoresT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosProductoresT.setText("-");
        menosProductoresT.setAlignmentX(0.5F);
        menosProductoresT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProductoresTActionPerformed(evt);
            }
        });
        jPanel1.add(menosProductoresT, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        masProductoresT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masProductoresT.setText("+");
        masProductoresT.setAlignmentX(0.5F);
        masProductoresT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProductoresTActionPerformed(evt);
            }
        });
        jPanel1.add(masProductoresT, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        menosEnsambladores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menosEnsambladores.setText("-");
        menosEnsambladores.setAlignmentX(0.5F);
        menosEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosEnsambladoresActionPerformed(evt);
            }
        });
        jPanel1.add(menosEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        masEnsambladores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        masEnsambladores.setText("+");
        masEnsambladores.setAlignmentX(0.5F);
        masEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masEnsambladoresActionPerformed(evt);
            }
        });
        jPanel1.add(masEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        labelBackg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Proyecto 1 Sistemas Operativos.png"))); // NOI18N
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
        if (numero < 5) {
            numero += 1;
            texto = String.valueOf(numero);
            numeroP.setText(texto);
        }
        switch (numero) {
                case 1:
                    app.getProductoresP().get(0).setActive(true);
                    System.out.println("El productor " + app.getProductoresP().get(0).getid() + " ahora esta " + app.getProductoresP().get(0).getActive());
                    break;
                case 2:
                    app.getProductoresP().get(1).setActive(true);
                    //app.getProductoresB().get(1).start();
                    System.out.println("El productor " + app.getProductoresP().get(1).getid() + " ahora esta " + app.getProductoresP().get(1).getActive());
                    break;
                case 3:
                    app.getProductoresP().get(2).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El productor " + app.getProductoresP().get(2).getid() + " ahora esta " + app.getProductoresP().get(2).getActive());
                    break;
                 case 4:
                    app.getProductoresP().get(3).setActive(true);
                    //app.getProductoresB().get(1).start();
                    System.out.println("El productor " + app.getProductoresP().get(3).getid() + " ahora esta " + app.getProductoresP().get(3).getActive());
                    break;
                case 5:
                    app.getProductoresP().get(4).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El productor " + app.getProductoresP().get(4).getid() + " ahora esta " + app.getProductoresP().get(4).getActive());
                    break;
            }
    }//GEN-LAST:event_masProductoresPActionPerformed

    private void menosProductoresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresBActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroB.getText();
        numero = Integer.parseInt(texto);

        if (numero > 0) {
            numero -= 1;
            texto = String.valueOf(numero);
            numeroB.setText(texto);

            //Casos posibles para  despedir productor de botones
            switch (numero) {
                case 0:
                    app.getProductoresB().get(0).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresB().get(0).getid() + " ahora esta " + app.getProductoresB().get(0).getActive());
                    break;
                case 1:
                    app.getProductoresB().get(1).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresB().get(1).getid() + " ahora esta " + app.getProductoresB().get(1).getActive());
                    break;
                case 2:
                    app.getProductoresB().get(2).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresB().get(2).getid() + " ahora esta " + app.getProductoresB().get(2).getActive());
                    break;
            }

        }
    }//GEN-LAST:event_menosProductoresBActionPerformed

    private void masProductoresBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProductoresBActionPerformed
        // TODO add your handling code here:
//        String namePro = app.getProductoresB().get(app.getProductoresB().size).getNombre();
        String texto;
        int numero;
        texto = numeroB.getText();
        numero = Integer.parseInt(texto);

        if (numero < 3) {
            numero += 1;
            texto = String.valueOf(numero);
            numeroB.setText(texto);

            //Casos posibles para agregar productor botones
            switch (numero) {
                case 1:
                    app.getProductoresB().get(0).setActive(true);
                    System.out.println("El productor " + app.getProductoresB().get(0).getid() + " ahora esta " + app.getProductoresB().get(0).getActive());
                    break;
                case 2:
                    app.getProductoresB().get(1).setActive(true);
                    //app.getProductoresB().get(1).start();
                    System.out.println("El productor " + app.getProductoresB().get(1).getid() + " ahora esta " + app.getProductoresB().get(1).getActive());
                    break;
                case 3:
                    app.getProductoresB().get(2).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El productor " + app.getProductoresB().get(2).getid() + " ahora esta " + app.getProductoresB().get(2).getActive());
                    break;
            }
        }
    }//GEN-LAST:event_masProductoresBActionPerformed

    private void menosProductoresPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresPActionPerformed
        // TODO add your handling code here:String texto;
        int numero;
        String texto;
        texto = numeroP.getText();
        numero = Integer.parseInt(texto);
        if (numero > 0) {
            numero -= 1;
            texto = String.valueOf(numero);
            numeroP.setText(texto);
        }
        switch (numero) {
                case 0:
                    app.getProductoresP().get(0).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresP().get(0).getid() + " ahora esta " + app.getProductoresP().get(0).getActive());
                    break;
                case 1:
                    app.getProductoresP().get(1).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresP().get(1).getid() + " ahora esta " + app.getProductoresP().get(1).getActive());
                    break;
                case 2:
                    app.getProductoresP().get(2).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresP().get(2).getid() + " ahora esta " + app.getProductoresP().get(2).getActive());
                    break;
                case 3:
                    app.getProductoresP().get(3).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresP().get(3).getid() + " ahora esta " + app.getProductoresP().get(3).getActive());
                    break;
                case 4:
                    app.getProductoresP().get(4).setActive(false);
                    System.out.println("El producotorB " + app.getProductoresP().get(4).getid() + " ahora esta " + app.getProductoresP().get(4).getActive());
                    break;    
            }
    }//GEN-LAST:event_menosProductoresPActionPerformed

    private void masProductoresJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProductoresJActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroJ.getText();
        numero = Integer.parseInt(texto);
        if (numero < 4) {
            numero += 1;
            texto = String.valueOf(numero);
            numeroJ.setText(texto);
            switch (numero) {//agregar productores de Joystick
                case 1:
                    app.getProductoresJ().get(0).setActive(true);
                    System.out.println("El productorJ " + app.getProductoresJ().get(0).getid() + " ahora esta " + app.getProductoresJ().get(0).getActive());
                    break;
                case 2:
                    app.getProductoresJ().get(1).setActive(true);
                    //app.getProductoresB().get(1).start();
                    System.out.println("El productor J " + app.getProductoresJ().get(1).getid() + " ahora esta " + app.getProductoresJ().get(1).getActive());
                    break;
                case 3:
                    app.getProductoresJ().get(2).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El productor J" + app.getProductoresJ().get(2).getid() + " ahora esta " + app.getProductoresJ().get(2).getActive());
                    break;
                case 4:
                    app.getProductoresJ().get(3).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El productorJ " + app.getProductoresJ().get(3).getid() + " ahora esta " + app.getProductoresJ().get(3).getActive());
                    break;
            }
        }
    }//GEN-LAST:event_masProductoresJActionPerformed

    private void menosProductoresJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresJActionPerformed
        // TODO add your handling code here:
        int numero;
        String texto;
        texto = numeroJ.getText();
        numero = Integer.parseInt(texto);
        if (numero > 0) {
            numero -= 1;
            texto = String.valueOf(numero);
            numeroJ.setText(texto);
            switch (numero) {//Despedir productor
                case 0:
                    app.getProductoresJ().get(0).setActive(false);
                    System.out.println("El producotorJ " + app.getProductoresJ().get(0).getid() + " ahora esta " + app.getProductoresJ().get(0).getActive());
                    break;
                case 1:
                    app.getProductoresJ().get(1).setActive(false);
                    System.out.println("El producotorJ " + app.getProductoresJ().get(1).getid() + " ahora esta " + app.getProductoresJ().get(1).getActive());
                    break;
                case 2:
                    app.getProductoresJ().get(2).setActive(false);
                    System.out.println("El producotorJ " + app.getProductoresJ().get(2).getid() + " ahora esta " + app.getProductoresJ().get(2).getActive());
                    break;
                case 3:
                    app.getProductoresJ().get(3).setActive(false);
                    System.out.println("El producotorJ " + app.getProductoresJ().get(3).getid() + " ahora esta " + app.getProductoresJ().get(3).getActive());
                    break;
            }
        }
    }//GEN-LAST:event_menosProductoresJActionPerformed

    private void masProductoresTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProductoresTActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroT.getText();
        numero = Integer.parseInt(texto);
        if (numero < 4) {
            numero += 1;
            texto = String.valueOf(numero);
            numeroT.setText(texto);
            System.out.println(numero);
            switch (numero) {//agregar productores de lectores de tarjetas
                case 1:
                    app.getProductoresT().get(0).setActive(true);
                    System.out.println("El productor T" + app.getProductoresT().get(0).getid() + " ahora esta " + app.getProductoresT().get(0).getActive());
                    break;
                case 2:
                    app.getProductoresT().get(1).setActive(true);
                    //app.getProductoresB().get(1).start();
                    System.out.println("El productor T" + app.getProductoresT().get(1).getid() + " ahora esta " + app.getProductoresT().get(1).getActive());
                    break;
                case 3:
                    app.getProductoresT().get(2).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El productor T" + app.getProductoresT().get(2).getid() + " ahora esta " + app.getProductoresT().get(2).getActive());
                    break;
                case 4:
                    app.getProductoresT().get(3).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El productor T" + app.getProductoresT().get(3).getid() + " ahora esta " + app.getProductoresT().get(3).getActive());
                    break;
            }
        }
    }//GEN-LAST:event_masProductoresTActionPerformed

    private void menosProductoresTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProductoresTActionPerformed
        // TODO add your handling code here:
        int numero;
        String texto;
        texto = numeroT.getText();
        numero = Integer.parseInt(texto);
        if (numero > 0) {
            numero -= 1;
            texto = String.valueOf(numero);
            numeroT.setText(texto);
            switch (numero) {//Despedir productor
                case 0:
                    app.getProductoresT().get(0).setActive(false);
                    System.out.println("El producotorT " + app.getProductoresT().get(0).getid() + " ahora esta " + app.getProductoresT().get(0).getActive());
                    break;
                case 1:
                    app.getProductoresT().get(1).setActive(false);
                    System.out.println("El producotorT " + app.getProductoresT().get(1).getid() + " ahora esta " + app.getProductoresT().get(1).getActive());
                    break;
                case 2:
                    app.getProductoresT().get(2).setActive(false);
                    System.out.println("El producotorT " + app.getProductoresT().get(2).getid() + " ahora esta " + app.getProductoresT().get(2).getActive());
                    break;
                case 3:
                    app.getProductoresT().get(3).setActive(false);
                    System.out.println("El producotorT " + app.getProductoresT().get(3).getid() + " ahora esta " + app.getProductoresT().get(3).getActive());
                    break;

            }
        }
    }//GEN-LAST:event_menosProductoresTActionPerformed

    private void masEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masEnsambladoresActionPerformed
        // TODO add your handling code here:
        String texto;
        int numero;
        texto = numeroE.getText();
        numero = Integer.parseInt(texto);
        if (numero < 5) {
            numero += 1;
            texto = String.valueOf(numero);
            numeroE.setText(texto);
            System.out.println(numero);
            
            switch (numero) {//agregar productores de lectores de tarjetas
                case 1:
                    app.getEnsambladores().get(0).setActive(true);
                    System.out.println("El Ensamblador" + app.getEnsambladores().get(0).getid() + " ahora esta " + app.getEnsambladores().get(0).getActive());
                    break;
                case 2:
                    app.getEnsambladores().get(1).setActive(true);
                    //app.getProductoresB().get(1).start();
                    System.out.println("El Ensamblador" + app.getEnsambladores().get(1).getid() + " ahora esta " + app.getEnsambladores().get(1).getActive());
                    break;
                case 3:
                    app.getEnsambladores().get(2).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El Ensamblador" + app.getEnsambladores().get(2).getid() + " ahora esta " + app.getEnsambladores().get(2).getActive());
                    break;
                case 4:
                    app.getEnsambladores().get(3).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El Ensamblador" + app.getEnsambladores().get(3).getid() + " ahora esta " + app.getEnsambladores().get(3).getActive());
                    break;
                case 5:
                    app.getEnsambladores().get(4).setActive(true);
//                    app.getProductoresB().get(2).start();
                    System.out.println("El Ensamblador" + app.getEnsambladores().get(4).getid() + " ahora esta " + app.getEnsambladores().get(4).getActive());
                    break;
            }
        }
    }//GEN-LAST:event_masEnsambladoresActionPerformed

    private void menosEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosEnsambladoresActionPerformed
        // TODO add your handling code here:
        int numero;
        String texto;
        texto = numeroE.getText();
        numero = Integer.parseInt(texto);
        if (numero > 0) {
            numero -= 1;
            texto = String.valueOf(numero);
            numeroE.setText(texto);
            switch (numero) {//Despedir productor
                case 0:
                    app.getEnsambladores().get(0).setActive(false);
                    System.out.println("El ensamblador " + app.getEnsambladores().get(0).getid() + " ahora esta " + app.getEnsambladores().get(0).getActive());
                    break;
                case 1:
                    app.getEnsambladores().get(1).setActive(false);
                    System.out.println("El ensamblador " + app.getEnsambladores().get(1).getid() + " ahora esta " + app.getEnsambladores().get(1).getActive());
                    break;
                case 2:
                    app.getEnsambladores().get(2).setActive(false);
                    System.out.println("El ensamblador " + app.getEnsambladores().get(2).getid() + " ahora esta " + app.getEnsambladores().get(2).getActive());
                    break;
                case 3:
                    app.getEnsambladores().get(3).setActive(false);
                    System.out.println("El ensamblador " + app.getEnsambladores().get(3).getid() + " ahora esta " + app.getEnsambladores().get(3).getActive());
                    break;
                case 4:
                    app.getEnsambladores().get(4).setActive(false);
                    System.out.println("El ensamblador " + app.getEnsambladores().get(4).getid() + " ahora esta " + app.getEnsambladores().get(4).getActive());
                    break;

            }
        }
    }//GEN-LAST:event_menosEnsambladoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    public static javax.swing.JLabel diasRestantes;
    private javax.swing.JLabel gerenteEstado;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jefeEstado;
    private javax.swing.JLabel labelBackg;
    private javax.swing.JButton masEnsambladores;
    private javax.swing.JButton masProductoresB;
    private javax.swing.JButton masProductoresJ;
    private javax.swing.JButton masProductoresP;
    private javax.swing.JButton masProductoresT;
    private javax.swing.JButton menosEnsambladores;
    private javax.swing.JButton menosProductoresB;
    private javax.swing.JButton menosProductoresJ;
    private javax.swing.JButton menosProductoresP;
    private javax.swing.JButton menosProductoresT;
    public static javax.swing.JLabel numCB;
    public static javax.swing.JLabel numCJoy;
    public static javax.swing.JLabel numCPantN;
    public static javax.swing.JLabel numCPantT;
    public static javax.swing.JLabel numCSD;
    public static javax.swing.JLabel numConsolas;
    private javax.swing.JLabel numeroB;
    private javax.swing.JLabel numeroE;
    private javax.swing.JLabel numeroJ;
    private javax.swing.JLabel numeroP;
    private javax.swing.JLabel numeroT;
    // End of variables declaration//GEN-END:variables
}
