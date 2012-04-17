/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

/**
 *
 * @author Jason
 */
public class ArrayTest {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Array Test Go!"); // Display the string.
         
         int[] arrayNumberOne;
         arrayNumberOne = new int[100];
         for(int i=0; i <100; i++)
         {
             arrayNumberOne[i]=i*5;
             System.out.println("arrayNumberOne element " + i + " = " + arrayNumberOne[i]);
             try{
                //do what you want to do before sleeping
                Thread.currentThread().sleep(1000);//sleep for 1000 ms
                //do what you want to do after sleeptig
                   }
                catch(InterruptedException ie){
                //If this thread was intrrupted by nother thread 
                }
         }
      }
         
}
