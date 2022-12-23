/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.ArrayList;


public class Ejercicio2 {

   
    public static void main(String[] args) {
      
        ArrayList <String> abc = new ArrayList();
        
        abc.add("abc");
        
        try {
            for (int i = 0; i < 2; i++) {
            System.out.println(abc.get(i));
            
        }
            
        } catch (IndexOutOfBoundsException e) {
            
            System.out.println("pusiste mal los dedos boludo");
        }
        
        
        
        
        
        
        
    }
    
}
