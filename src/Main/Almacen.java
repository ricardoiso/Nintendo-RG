/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
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
    
   
    private int size;
    private int capacidad;
    private ArrayList<Productor> listaProductores = new ArrayList<Productor>();

    public Almacen ( int size, ArrayList<Productor> lista) {
        this.capacidad = 0;
        this.size = size;
        this.listaProductores = lista;
    }

    @Override
    public void run() {
        System.out.println("Capacidad actual de botones " + capacidad);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            //System.out.println("Me detuve");
            
            try {
                //System.out.println(pb2.active);
                for (int i = 0; i < listaProductores.size(); i++) {
                    if (listaProductores.get(i).getActive() && capacidad < size) {
                        listaProductores.get(i).getBuffer().extraer();
                        capacidad +=1;
                    }
                }
                System.out.println("El almacen tiene ahora: " + capacidad);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Productor> getListaProductores() {
        return listaProductores;
    }

    public void setListaProductores(ArrayList<Productor> listaProductores) {
        this.listaProductores = listaProductores;
    }

}
