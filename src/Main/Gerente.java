/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Visual.Interfaz;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Gerente extends Thread{
    
    private Jefe jefe;
    private boolean loop = false;
    public int time;
    public int despliegue;
    
    public Gerente (Jefe jefe, int time, int despliegue){
        this.jefe = jefe;
        this.time= time;
        this.despliegue = despliegue;
    }
    
    public void run() {
        try {
            try {
                Thread.sleep(1000);
//                        System.out.println("Soy el gerente");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
//                    System.out.println("HolaaaaaaAAAAAA");
                    Interfaz.gerenteDurmiendo.setText("El gerente está despierto");
                    Thread.sleep(time / 12);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (Interfaz.jefeEstado.getText() == "El jefe está bajando el contador de días") {
                    try {
                        Interfaz.gerenteDurmiendo.setText("El gerente está despierto");
                        Thread.sleep(time / 12);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Interfaz.gerenteDurmiendo.setText("El gerente está dormido");
                        Thread.sleep(time / 12);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(time / 12);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (jefe.getDiasRestantesDespliegue() == 0) {
                    Interfaz.despliegue.setText("El despliegue de consolas ha comenzado");
                    jefe.setDiasRestantesDespliegue(this.despliegue);
                } else {
                    Interfaz.gerenteDurmiendo.setText("El gerente está dormido");
                    try {
                        Thread.sleep(time / 12);
                        Interfaz.despliegue.setText("Aún no se inicializa el despliegue");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InterruptedException gerente",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
