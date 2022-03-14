/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding_abstractClass_interfaceClass;

/**
 *
 * @author Kavindu Hashan
 */
public class manager extends employee implements tax       
{    
    String qualification = "MBA";
    static int experience = 15;
    
    manager()
    {
       experience++;
       System.out.println(experience);
    }
    
    public static void main (String args[])
    {
        manager m1 = new manager();
        m1.name = "nimal";
        System.out.println(m1.name);
                      
        m1.abstractdisplay();//using inheritance, that abstract class method can access.
        
        m1.interfaceShowmethod();//calling the method of interface class
        System.out.println(tax.taxprecentage);
        
        System.out.println(m1.experience);
        manager m2 = new manager();
        manager m3 = new manager();
        
    }
    
    
    public void interfaceShowmethod()//interface eke method ek methana danna
    {
        System.out.println("that method define inside the interface class");
    }
}

abstract class employee // abstract class define.. that cant call inside the main program without inheritance
{
    String name = "sam";
    String address = "colombo";
    
    public void abstractdisplay()
    {
        System.out.println("Inside an abstract class");
    }
}

interface tax
{
    double taxprecentage = 0.15;
    public void interfaceShowmethod();
    // inside an interface, only you can define the method without body
}
