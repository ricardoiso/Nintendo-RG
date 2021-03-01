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
    public int time;

    /*public Jefe(int diasRestantesDespliegue) {
        this.diasRestantesDespliegue = diasRestantesDespliegue;
    }*/

    public Jefe(int time) {
        this.diasRestantesDespliegue = 10;
        this.time = time;
    }

    public void run() {
        //ejecucion del jefe

        try {

            while (true) {
                try {
                    if(diasRestantesDespliegue != 0){
                    System.out.println("\nQuedan " + this.getDiasRestantesDespliegue() + " días para el despliegue global ");
//                    Interfaz.horas.setText(Integer.toString(this.horas));
                    Interfaz.diasRestantes.setText(Integer.toString(this.getDiasRestantesDespliegue()));
                    
                    
                    System.out.println("El jefe está despierto");
                    Interfaz.jefeEstado.setText("Está despierto");
                    

                    
                    
                    System.out.println("El jefe bajó el contador de días");
                    Interfaz.jefeEstado.setText("El jefe está bajando el contador de días");
                    
                    Thread.sleep(time/4);
                        
                    this.setDiasRestantesDespliegue(this.getDiasRestantesDespliegue() - 1);
                    Interfaz.diasRestantes.setText(Integer.toString(this.getDiasRestantesDespliegue()));
                    


                    System.out.println("Quedan " + this.getDiasRestantesDespliegue() + " días para el despliegue global");
                    System.out.println("El jefe se acostó a dormir");
                    Interfaz.jefeEstado.setText("El jefe se acostó a dormir");
                    }
                    Thread.sleep((long) ((time/2)));
                    
                    
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
