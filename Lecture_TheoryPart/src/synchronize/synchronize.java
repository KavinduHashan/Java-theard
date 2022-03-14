/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronize;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kavindu Hashan
 */

class Counter 
{
    int counter;
    
    public synchronized void increment() //both t1 and t2 treads attempt to use increment method.
    {
        counter++;
    }
    
}

public class synchronize 
{
    public static void main(String[] args) throws InterruptedException
    {
        try {
            Counter c = new Counter();
            Thread t1 = new Thread(
                    new Runnable()
                    {
                        public void run()
                        {
                            for(int i=1; i<10000; i++)
                            {
                                c.increment();
                            }
                        }
                    }
            );
            Thread t2 = new Thread(
                    new Runnable()
                    {
                        public void run()
                        {
                            for(int i=1; i<10000; i++)
                            {
                                c.increment();
                            }
                        }
                    }
            );
            
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            
            System.out.println("Counter :- " + c.counter);
        } catch (InterruptedException ex) {
            Logger.getLogger(synchronize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
    
}
