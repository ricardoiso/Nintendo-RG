/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author this_serra
 */
public class ProductorBotones extends Thread {

    int id;
    Buffer bufferBtn;
    boolean despedido = false;
    int tiempoProduccion;
    
    Semaphore semProBtn; // Semaforo de productor de botones
    ArrayList<Semaphore> mutexProBtn;

    public ProductorBotones(int id, Buffer bufferBtn, Semaphore semProBtn, ArrayList<Semaphore> mutexProBtn) {
        this.id = id;
        this.bufferBtn = bufferBtn;
        this.semProBtn = semProBtn;
        this.mutexProBtn = mutexProBtn;
    }

    //Otras variables
//    int total;
//    Control control;
//    int tiempoPagando; // tiempo en caja
//    int contE = 0; // cajero actual en el que se ubica el cliente
//    int numCajeros; // numero total de cajeros
//    Semaphore semCl; // semaforo de clientes
//    Semaphore semC; // semafoto de carritos
//    Semaphore semP; // semaforo de cajeros
//    Semaphore semG; // semaforo de Ganancias
//    ArrayList<Semaphore> mutexCajeros;
//    ArrayList<Semaphore> productosCajeros;
//    int numProductos;
//    int aComprar;
//    boolean despedir = true;
//    boolean finCompra = false;
//    Interfaz interfaz;
    
    public void despedir() {
        this.despedido = true;
    }

    public void producirBtn() {
        try {

            int aux = (new Random()).nextInt(10);
            bufferBtn.poner(aux);
            System.out.println("El productor de botones agrego un nuevo boton al almacen");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {

        semProBtn.release(); 
        mutexProBtn.get(id).release();

        while (!despedido) {
            //Mientras el productor de botones no es despedido seguirá produciendo botones
//                producirBtn();
            try {

                bufferBtn.poner(2);
                System.out.println("El productor de botones agrego un nuevo boton al almacen");

            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

//    
//    public int getId() {
//        return id;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public Buffer getBufferBtn() {
        return bufferBtn;
    }

    public void setBufferBtn(Buffer bufferBtn) {
        this.bufferBtn = bufferBtn;
    }

    public boolean isDespedido() {
        return despedido;
    }

    public void setDespedido(boolean despedido) {
        this.despedido = despedido;
    }

    public int getTiempoProduccion() {
        return tiempoProduccion;
    }

    public void setTiempoProduccion(int tiempoProduccion) {
        this.tiempoProduccion = tiempoProduccion;
    }

    public Semaphore getSemProBtn() {
        return semProBtn;
    }

    public void setSemProBtn(Semaphore semProBtn) {
        this.semProBtn = semProBtn;
    }

    public ArrayList<Semaphore> getMutexProBtn() {
        return mutexProBtn;
    }

    public void setMutexProBtn(ArrayList<Semaphore> mutexProBtn) {
        this.mutexProBtn = mutexProBtn;
    }
    
    
    
}
