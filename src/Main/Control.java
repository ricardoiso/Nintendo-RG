/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Calendar;
import java.util.Date;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Control {

    private Jefe jefe;
    private Gerente gerente;
    private Archivo archivo;

    ArrayList<Productor> Productores = new ArrayList<Productor>();
    ArrayList<Semaphore> mutexProductores = new ArrayList<Semaphore>();

    // Control Constructor:
    public Control() throws InterruptedException {
        this.archivo = new Archivo();
        this.jefe = new Jefe();
        this.gerente = new Gerente(this.jefe);

    }

    // Metodo principal que permite correr el programa
    public void iniciar() {

        // this.jefe.start();
        // this.gerente.start();
                
        
        
        
        // ------------------------
        Time tiempo = new Time();

        Buffer b1 = new Buffer(2);
        Buffer b2 = new Buffer(2);

        Productor primer_productor = new Productor("A ", b1, 1000, true);
        Productor segundo_productor = new Productor("B ", b2, 1000, true);
        Almacen AB = new Almacen(primer_productor.getBuffer(), segundo_productor.getBuffer(), 45, primer_productor, segundo_productor);

        primer_productor.start();
        segundo_productor.start();
        AB.start();

        tiempo.setTime();
    }

}
