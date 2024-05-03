d/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo2_jg;

import java.util.Scanner;

/* @author Jordi Gali*/
public class Hola_Mundo2_JG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    
        Scanner scanner = new Scanner(System.in);  // Crear una instancia de Scanner
        
        System.out.print("Sietpalu introdueix el teu nom: ");  // Pedir al usuario su nombre
        String name = scanner.nextLine();  // Leer el nombre del usuario
        
        System.out.println("Hola, " + name + "!");  // Saludar al usuario
        
        System.out.print("Com et trobes avui? ");  // pregunta com et robes i espera resposta
        String trobar = scanner.nextLine();  
        
        System.out.println("Doncs si et trobes " + trobar + ", res més a dir. Adéu !");  // dona resposta introduint el que has dit en l'anterior
        
        int count = 0; //inicia la variable count amb valor 0
        while (count < 3) {
            System.out.println("hola de nou, " + name + "!"); //imprimeix la salutaci? al name introduit
            count++; // suma 1 al valor de la variable count
        }
        
        scanner.close();  // Cerrar el scanner
    }
}
