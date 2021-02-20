/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    private String nombre, tipo;
    private Random r = new Random();
    
    private int cantidad_buffer;
    private Buffer buffer;
    private int size;
    public boolean e;
    
   
    
    public Productor (String nombre, Buffer buffer, int size, boolean e) {
        this.nombre = nombre;
        this.buffer = buffer;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getCantidad_buffer() {
        return cantidad_buffer;
    }

    public void setCantidad_buffer(int cantidad_buffer) {
        this.cantidad_buffer = cantidad_buffer;
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

    public boolean isE() {
        return e;
    }

    public void setE(boolean e) {
        this.e = e;
    }
    
    
    
    
}
