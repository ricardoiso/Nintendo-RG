package Main;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri, this_serra
 */
public class Productor extends Thread {

    private int id;
    private Random r = new Random();

    private Buffer buffer;
    private int size;
    public boolean active;

    private int tiempoProduccion;

    public Productor(int id, Buffer buffer, int size, boolean e) {
        this.id = id;
        this.buffer = buffer;
        this.size = size;
        this.active = e;
    }

    public void run() {
        while (active) {
            {
                if (active) {
                    //System.out.println("hola, soy el hilo "+nombre);
                    try {try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        
                        int aux = r.nextInt(10);
                        buffer.poner(aux);
                        System.out.println("El productor de botones " + this.id + "colocó el boton: " + aux + " en el almacen");
                       

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }
    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public Buffer getBuffer() {
        return buffer;
    }

    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean e) {
        this.active = e;
    }

}
