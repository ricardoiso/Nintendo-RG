/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Visual.Interfaz;
import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Jefe extends Thread {

    private int diasRestantesDespliegue;
    private boolean loop = false;
    private boolean estado;

    public Jefe(int diasRestantesDespliegue) {
        this.diasRestantesDespliegue = diasRestantesDespliegue;
    }

    public Jefe() {
        this.diasRestantesDespliegue = 10;
    }

    public void run() {
        //ejecucion del jefe

        this.estado = true;
        try {

            while (true) {
                try {
                    System.out.println("\nQuedan " + this.getDiasRestantesDespliegue() + " días para el despliegue global ");
//                    Interfaz.horas.setText(Integer.toString(this.horas));
                    Interfaz.diasRestantes.setText(Integer.toString(this.getDiasRestantesDespliegue()));
                    
                    
                    System.out.println("El jefe está despierto");
                    Interfaz.jefeEstado.setText("Está despierto");
                    Thread.sleep(3000);

                    this.setDiasRestantesDespliegue(this.getDiasRestantesDespliegue() - 1);
                    Interfaz.diasRestantes.setText(Integer.toString(this.getDiasRestantesDespliegue()));
                    System.out.println("El jefe bajo el contador de días");
                    Interfaz.jefeEstado.setText("El jefe bajo el contador de días");
                    


                    System.out.println("Quedan " + this.getDiasRestantesDespliegue() + " días para el despliegue global");
                    System.out.println("El jefe se acostó a dormir");
                    Interfaz.jefeEstado.setText("El jefe se acostó a dormir");
                    Thread.sleep(7000);
                    
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "InterruptedException jefe",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Getter y Setter
    public int getDiasRestantesDespliegue() {
        return diasRestantesDespliegue;
    }

    public void setDiasRestantesDespliegue(int diasRestantesDespliegue) {
        this.diasRestantesDespliegue = diasRestantesDespliegue;
    }

}
