 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Visual.Interfaz;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Ensamblador extends Thread {

    Almacen AB;
    AlmacenP AP;
    Almacen AJ;
    Almacen AT;
    int produccion;
    int time;
    int id;
    boolean e;
    Buffer buffer;
    Compañia company;
    public int CP;

    public Ensamblador(int i, Almacen AB, AlmacenP AP, Almacen AJ, Almacen AT, int time, boolean e, Buffer b, Compañia c) {
        this.id = id;
        this.AB = AB;
        this.AP = AP;
        this.AJ = AJ;
        this.AT = AT;
        this.time = time;
        this.e = e;
        this.buffer = b;
        this.company = c;
    }

    public void run() {
        //ejecución ensamblador
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            if (e) {
                
                try {
                    int ID = this.id;
                    buffer.poner(ID);
                    if (buffer.getIntb()[0] == ID) {
                        if (AB.getCapacidad() >= 5 && AJ.getCapacidad() >= 2 && AT.getCapacidad() >= 1 && AP.getCapacidadN() >= 1 && AP.getCapacidadT() >= 1 && e) {
                            CP = this.company.getConsolas();
                            this.company.setConsolas( CP += 1);//Pendiente con esta variable. Tiene que ser variable globar para todos los productores.
                            AB.setCapacidad(AB.getCapacidad() - 5);
                            AJ.setCapacidad(AJ.getCapacidad() - 2);
                            AT.setCapacidad(AT.getCapacidad() - 1);
                            AP.setCapacidadN(AP.getCapacidadN() - 1);
                            AP.setCapacidadN(AP.getCapacidadN() - 1);
                            Interfaz.numConsolas.setText(String.valueOf(this.company.getConsolas()));

                        }

                    }
                    try {
                        buffer.extraer();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Nada");
                    }
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    public void setActive(boolean e) {
        this.e = e;
    }

    public boolean getActive() {
        return e;
    }

    public int getid() {
        return id;
    }
}
