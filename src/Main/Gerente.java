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
public class Gerente extends Thread{
    
    private Jefe jefe;
    private boolean loop = false;
    
    public Gerente (Jefe jefe){
        this.jefe = jefe;
    }
    
    public void run() {
        try {
            
            while(loop){
                
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "InterruptedException gerente", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
