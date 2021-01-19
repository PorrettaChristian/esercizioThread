/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author porretta.christian
 */
public class NewClass implements Runnable {
    boolean terminato = true;
    String a;
    int i=1;
    int q = 100;
    public NewClass(String a) {
        this.a=a;
    }

    @Override
    public void run() {    
        if(a=="a"){
            while(terminato){
                System.out.println(i);
                i++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(i>10){
                    this.ferma();
                }
            }
        }else{
            while(terminato){
                System.out.println("            "+q);
                q--;
                try { 
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(i>50){
                    this.ferma();
                }
            }
        }
    }
    public void ferma(){
        terminato = false;
    }
}
