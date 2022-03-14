/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.lang.System.Logger;

/**
 *
 * @author Kavindu Hashan
 */

class hi extends Thread //thread = super class
{
    @Override
    public void run()//this is not a custom method. This is an existing metod inside the thread class
    {
       for (int i =0; i<5; i++)
       {
           System.out.println("Hi");
       }
    }
    
}

class hello extends Thread 
{
    @Override
    public void run()//this is not a custom method. This is an existing metod inside the thread class
    {
       for (int i =0; i<5; i++)
       {
            System.out.println("Hello");      
       
        try {
            Thread.sleep(5000);  
        } catch (Exception e) {
            Logger.getLogger(hello.class.getName()).log(level1.SEVERE.null.e);
        }
       }
       
    }  
}

public class myThread 
{
    public static void main(String[] args) 
    {
        hi h = new hi();      
        hello hel = new hello();
        h.start(); //start is the command
        
        hel.start();
        Thread.sleep(10);
        
        
        
    }
} 