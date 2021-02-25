/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Jefe extends Thread {

    private int diasRestantesDespliegue;
    private boolean loop = false;
    Compañia company;
    Control app;
    Almacen almacen;

    public Jefe(int diasRestantesDespliegue) {
        this.diasRestantesDespliegue = diasRestantesDespliegue;
    }

    public Jefe() {
        this.diasRestantesDespliegue = 10;
    }

    public void run() {
        //ejecucion del jefe
        try {

            while (loop) {

                try {
                    Thread.sleep((company.tiempo / 4) * 1000);

                    // For de Productor de botones
                    for (int i = 0; i < 3 ; i++) {

                        if ((!app.ProductoresBotones.get(i).isDespedido()) && (almacen.getAlmacenBotones() < 45)) {

                            almacen.setAlmacenBotones(almacen.getAlmacenBotones() + 1);

                            if (almacen.getAlmacenBotones() < 45) {
                                almacen.setAlmacenBotones(almacen.getAlmacenBotones() + 1);
                            }

                        }
                    }

                } catch (InterruptedException e) {

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InterruptedException jefe",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void disminuirDias() {
        diasRestantesDespliegue--;

    }

    //Getter y Setter
    public int getDiasRestantesDespliegue() {
        return diasRestantesDespliegue;
    }

    public void setDiasRestantesDespliegue(int diasRestantesDespliegue) {
        this.diasRestantesDespliegue = diasRestantesDespliegue;
    }

}
