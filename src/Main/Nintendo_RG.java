/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Visual.Interfaz;



/**
 *
 * @author this_serra
 */
public class Nintendo_RG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
        Control program = new Control(); 
        new Interfaz(program).setVisible(true); 
        
        program.iniciar();
    }
}
