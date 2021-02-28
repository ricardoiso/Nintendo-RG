/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class productorPantallas extends Thread{
    public int id;
    public Buffer b1;
    public Buffer b2;
    private Random r = new Random();
    private Random r2 = new Random();
    public boolean active;
    
    public productorPantallas(int id, Buffer b1, Buffer b2, boolean e){
    this.id = id;
    this.b1 = b1;
    this.b2 = b2;
    this.active = e;
    }
    
    public void run() {

        while (true) {

            //System.out.println("hola, soy el hilo "+nombre);
            try {
                int aux = r.nextInt(10);
                int aux2 = r2.nextInt(10);
                b1.poner(aux);
                b2.poner(aux2);
                //System.out.println("El productor de pantallas" + this.id + " colocó el boton: " + aux + " en el almacen");

            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    public int getid() {
        return id;
    }
    
    public Buffer getBuffer1() {
        return b1;
    }
    public Buffer getBuffer2() {
        return b2;
    }
    
    public boolean getActive() {
        return active;
    }
    
    public void setActive(boolean e) {
        this.active = e;
    }
}
