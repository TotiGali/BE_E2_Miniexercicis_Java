/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7_clases_y_objetos;

/**
 *
 * @author jordi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //1.Crea una clase `Persona` con propiedades como nombre y edad, e incluye m�todos para cambiar y obtener estos valores, 
    //usando modificadores `private` para las variables y `public` para los m�todos.
        Persona persona1 = new Persona("Pep", 28);
        
        System.out.println("La persona 1 es diu: " + persona1.getNom() + " i t� " + persona1.getEdat() + " anys");
        
        //modifico el nom i l'edat
        persona1.setNom("Pepi");
        persona1.setEdat(16);
        
        System.out.println("La persona ara es diu: " + persona1.getNom() + " i t� " + persona1.getEdat() + " anys");

     //2.Implementa un m�todo que imprima todos los datos de un objeto `Persona`.
       persona1.imprimirDades();

     //3.A�ade un constructor que inicialice todos los atributos de `Persona`.
     // Fet a la clase Persona
     
     //4.Escribe un m�todo dentro de la clase que describa si la persona es mayor de edad.
        persona1.majorEdat();
        
     //5.Dise�a un m�todo en `Persona` que compare la edad de dos personas y determine cu�l es mayor.
        Persona persona2 = new Persona("Lola", 8);
        System.out.println("La persona 2 es diu: " + persona2.getNom() + " i t� " + persona2.getEdat() + " anys");
        persona2.compararedat(persona1);
    }  
}

