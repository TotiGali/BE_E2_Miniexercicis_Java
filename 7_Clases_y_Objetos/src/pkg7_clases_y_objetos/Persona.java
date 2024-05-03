/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7_clases_y_objetos;

/**
 *
 * @author jordi
 */

//1.Crea una clase `Persona` con propiedades como nombre y edad, e incluye m�todos para cambiar y obtener estos valores, 
    //usando modificadores `private` para las variables y `public` para los m�todos.
    
public class Persona {
    private String nom;
    private int edat;

//3.A�ade un constructor que inicialice todos los atributos de `Persona`.

    public Persona(String nom, int edat){
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom(){
        return nom;
    }
    public int getEdat(){
        return edat;
    }
    
    //Setter per modificar el nom i l'edat
    public void setNom(String nouNom){
        this.nom = nouNom;
    }
    public void setEdat(int novaEdat){
        this.edat = novaEdat;
    }
    
//2.Implementa un m�todo que imprima todos los datos de un objeto `Persona`.
    public void imprimirDades() {
        System.out.println("Nom: " + nom);
        System.out.println("Edat: " + edat);
    }
    
//4.Escribe un m�todo dentro de la clase que describa si la persona es mayor de edad.
    public void majorEdat() {
        if (this.edat > 18){
            System.out.println("La persona " + this.nom + " �s major d'edat");
        } else {
            System.out.println("La persona " + this.nom + " no �s major d'edat");
        }
    }
    
//5.Dise�a un m�todo en `Persona` que compare la edad de dos personas y determine cu�l es mayor.
    public void compararedat(Persona persona1){
        if (this.edat > persona1.getEdat()){
            System.out.println("La persona " + this.nom + " �s major que " + persona1.getNom());
        } else {
            System.out.println("La persona " + persona1.getNom() + " �s major que " + this.nom);
        }
    }
    
}

    
  
    
