/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlimittest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plane
 */
public class ChildThread extends Thread {
    
    private String x;
    public void run(){
        x = "aaaaaaaaaaaaaaaaaaaaaa";
        try{
            while( true ){
                sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ChildThread.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }
}
