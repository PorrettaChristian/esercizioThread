/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theread1;

/**
 *
 * @author porretta.christian
 */
public class Theread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass n = new NewClass("a");
        NewClass n1 = new NewClass("b");
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n1);
        t1.start();
        t2.start();
        
    }
    
}
