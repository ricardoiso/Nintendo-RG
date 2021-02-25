/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri, this_serra
 */
public class Almacen extends Thread {

    public static volatile int almacen_botones = 0;
    public static volatile int almacen_pantallas = 0;
    public static volatile int almacen_joystick = 0;
    public static volatile int almacen_SD = 0;
    
    private Buffer b;
    private Buffer b2;
    private int size;
    public int capacidad;
    private Productor pb1;
    private Productor pb2;

    public Almacen (Buffer b, Buffer b2, int size, Productor pb1, Productor pb2) {
        this.b = b;
        this.b2 = b2;
        this.size = size;
        this.pb1 = pb1;
        this.pb2 = pb2;
    }

    @Override
    public void run() {
        System.out.println(capacidad);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (this.capacidad < 45) {
            try {
                if (pb1.active == true && capacidad < 45) {
                    b.extraer();
                    capacidad += 1;
                }
                if (pb2.active == true && capacidad < 45) {
                    b2.extraer();
                    capacidad += 1;
                }
                System.out.println("El almacen tiene ahora: " + capacidad);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
