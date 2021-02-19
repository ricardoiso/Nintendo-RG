/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author this_serra
 */
public class Control {
    
    public static volatile int cantidadB = 1;
    public static volatile int cantidadP = 1;
    public static volatile int cantidadJ = 1;
    public static volatile int cantidadSD = 1;
    
    public void start() {
        
        Time tiempo = new Time();
        Buffer b1 = new Buffer(2);
        Buffer b2 = new Buffer(2);
        productoresB B1 = new productoresB("Empresa B1 ", b1, 1000, true);
        productoresB B2 = new productoresB("Empresa B2 ", b2, 1000, true);
        almacenB AB = new almacenB(b1,b2,45, B1, B2);
        B1.start();
        B2.start();
        AB.start();
        
        tiempo.setTime();
        
        
    }
    
}
