/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_Demo;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Kavindu Hashan
 */

class hi implements Runnable
{
        @Override
    public void run() // this is not a custom method. This is an existing method inside the thread class.
    {
        for(int i=0; i<5;i++)
        {
                System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(hi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}

class hello
{
    for(int i=0; i<5;i++)
        {
                System.out.println("Hi");
                
                try
                {
                    Th
                }
        }
}

public class interface_Demo {
    
}
