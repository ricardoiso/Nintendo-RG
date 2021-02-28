/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Visual.Interfaz;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class AlmacenP extends Thread {
     private int size;
    public int capacidad;
    public int cantidadT;
    public int cantidadN;
    private ArrayList<productorPantallas> listaProductores = new ArrayList<productorPantallas>();
    private int time;

    public AlmacenP ( int size, ArrayList<productorPantallas> lista, int time) {
        this.capacidad = 0;
        this.size = size;
        this.listaProductores = lista;
        this.time = time;
    }

    public void run() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            System.out.println("Me detuve");
            int suma =  cantidadT+cantidadN;
            try {
                //System.out.println(pb2.active);
                for (int i = 0; i < listaProductores.size(); i++) {
                    if (listaProductores.get(i).getActive() && suma < 40) {
                        System.out.println(listaProductores.get(i).getActive());
                        listaProductores.get(i).getBuffer1().extraer();
                        cantidadN +=1;
                        suma=cantidadN+cantidadT;
                        Interfaz.numCPantN.setText(String.valueOf(cantidadN));
                        
                    }
                }
                
                System.out.println("El almacen de pantallas tiene ahora: " + suma);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < listaProductores.size(); i++) {
                    if (listaProductores.get(i).getActive() && suma < 40) {
                        System.out.println(listaProductores.get(i).getActive());
                        listaProductores.get(i).getBuffer1().extraer();
                        cantidadN +=1;
                        suma=cantidadN+cantidadT;
                        Interfaz.numCPantN.setText(String.valueOf(cantidadN));
                        
                    }
                }
                for (int i = 0; i < listaProductores.size(); i++) {
                    if (listaProductores.get(i).getActive() && suma < 40) {
                        System.out.println(listaProductores.get(i).getActive());
                        listaProductores.get(i).getBuffer2().extraer();
                        listaProductores.get(i).getBuffer2().extraer();
                        cantidadT +=1;
                        suma=cantidadN+cantidadT;
                        Interfaz.numCPantT.setText(String.valueOf(cantidadT));
                        
                    }
                }
                System.out.println("El almacen de pantallas tiene ahora: " + suma);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Algo salió mal");
            }
        }
        
        
    }
    
    public int getCapacidadT() {
        return cantidadT;
    }
    
    public int getCapacidadN() {
        return cantidadN;
    }
    
    public void setCapacidadN(int capacidad) {
        this.cantidadN = capacidad;
    }
    
    public void setCapacidadT(int capacidad) {
        this.cantidadT = capacidad;
    }
}
