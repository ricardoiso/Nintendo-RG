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
 * @author gabri
 */
public class Time extends Thread {

    private int tiempo = 1;

    public void run() {
        while (true) {
//            Calendar rightNow = Calendar.getInstance();
//            Date hour = rightNow.getTime();
//            System.out.println(hour.getSeconds());

            // De esta forma el tiempo siempre inicia en 1
            System.out.println(tiempo);
            tiempo++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
