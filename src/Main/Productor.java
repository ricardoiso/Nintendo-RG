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

    private String nombre;
    private Random r = new Random();

    private Buffer buffer;
    private int size;
    public boolean active;

    private int tiempoProduccion;

    public Productor(String nombre, Buffer buffer, int size, boolean e) {
        this.nombre = nombre;
        this.buffer = buffer;
        this.size = size;
        this.active = e;
    }

    public void run() {
        while (true) {

            System.out.println("hola");
            for (int i = 0; i < size; i++) {

                try {

                    int aux = r.nextInt(10);
                    buffer.poner(aux);
                    System.out.println("El productor de botones " + this.nombre + "colocó el boton: " + aux + " en el almacen");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
