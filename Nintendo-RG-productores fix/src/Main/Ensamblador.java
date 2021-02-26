/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author this_serra
 */
public class Ensamblador  {
    Almacen AB;
    Almacen AP;
    Almacen AJ;
    Almacen AT;
    int produccion;

    public Ensamblador(Almacen AB, Almacen AP, Almacen AJ, Almacen AT) {
        this.AB = AB;
        this.AP = AP;
        this.AJ = AJ;
        this.AT = AT;

    }
    
    
    public void run() {
        //ejecución ensamblador
        if(AB.size >= 5 && AJ.size >= 2 && AT.size >= 1){
            produccion += 1;
        }

    }
}
