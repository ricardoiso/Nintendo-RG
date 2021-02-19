/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Nintendo_RG;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class productoresB extends Thread {

    String nombre;
    private Random r = new Random();
    private Buffer b;
    private int size;
    public boolean e;

    public productoresB(String nombre, Buffer b, int size, boolean e) {
        this.nombre = nombre;
        this.b = b;
        this.size = size;
        this.e = e;
    }

    /*public void run() {
        while (true) {

            Calendar rightNow1 = Calendar.getInstance();
            Date hour1 = rightNow1.getTime();
            if ((hour1.getSeconds() % 5) == 0) {
                Nintendo_RG.cantidadB += 1;
                System.out.println("Hola, soy " + this.nombre + " y acabo de terminar un botón. Ahora hay: " + Nintendo_RG.cantidadB);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }*/
    public void run() {
        Calendar rightNow1 = Calendar.getInstance();
        Date hour1 = rightNow1.getTime();
        //if ((hour1.getSeconds() % 5) == 0) {
        if (this.e == true) {
            for (int i = 0; i < size; i++) {
                try {
                    int aux = r.nextInt(10);
                    b.poner(aux);
                    System.out.println("El productor de botones " + this.nombre + "colocó el boton: " + aux + " en el almacen");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(productoresB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
