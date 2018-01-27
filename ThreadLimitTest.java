/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlimittest;

/**
 *
 * @author plane
 */
public class ThreadLimitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        try{
            while( true ){
                new ChildThread().start();
                count+=1;
                System.out.println(count);
            }
        } catch ( OutOfMemoryError e ){
            e.printStackTrace();
            System.err.println("Thread Number :" + count);
            System.exit(1);
        }
    }
    
}
