/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.concurrent.Semaphore;

/**
 *
 * @author gabri
 */
public class Buffer {

    private int[] b; // almacen ???
    private int i = 0, j = 0;
    private Semaphore mutex = new Semaphore(1, true);
    private Semaphore hayDatos = new Semaphore(0, true);
    private Semaphore hayEspacio;

    public Buffer(int tam) {
        this.b = new int[tam];
        this.hayEspacio = new Semaphore(tam, true);
    }

    public void poner(int dato) throws InterruptedException {
        hayEspacio.acquire();
        mutex.acquire();
        b[i] = dato;

        i = (i + 1) % b.length;
        mutex.release();
        hayDatos.release();
    }

    public int extraer() throws InterruptedException {
        hayDatos.acquire();
        int actual = j;
        j = (j + 1) % b.length;
        mutex.release();
        hayEspacio.release();
        return b[actual];
    }
    
    public int[] getIntb(){
        return b;
    }

}
