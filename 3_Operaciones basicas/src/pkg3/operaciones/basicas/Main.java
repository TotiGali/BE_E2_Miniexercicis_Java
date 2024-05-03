/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.operaciones.basicas;

/*@author jordi*/
import java.util.Scanner; /*Cal introduir aquesta linea per que agafi l'eina Scanner de Java*/

public class Main {
    
     public static void main(String[] args) {
        //Crea un calculador simple que acepte entradas del usuario y realice estas operaciones.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Si us plau, introdueix el valor de a: ");  
        double a = Double.parseDouble(scanner.nextLine());  
        
        System.out.print("Si us plau, introdueix el valor de b: ");  
        double b = Double.parseDouble(scanner.nextLine());  
         
         //Realiza y muestra el resultado de operaciones básicas (suma, resta, multiplicación, división).
        
        System.out.println("El valor a = " + a + " i el valor b = " + b);

        double suma = a + b;
            System.out.println("La suma és = " + suma);
        double resta = a - b;
            System.out.println("La resta és = " + resta);
        double multiplicacio = a * b;
            System.out.println("La multiplicacio és = " + multiplicacio);
        double divisio = a / b;
            System.out.println("La divisio és = " + divisio);

        //Añade operaciones de módulo y elevación a potencia.
        // modulo
        double residu = a % b;
            System.out.println("El residu de la divisio és = " + residu);
       
        //potencia
        double resultatPotencia = potencia(a, b);   
            System.out.println("El resultat de la potencia és = " + resultatPotencia);

        //Implementa un sistema simple para calcular el promedio de cinco números ingresados por el usuario.
        System.out.print("Si us plau, introdueix el valor de A: ");  
        double A = Double.parseDouble(scanner.nextLine());
        System.out.print("Si us plau, introdueix el valor de B: ");  
        double B = Double.parseDouble(scanner.nextLine());
        System.out.print("Si us plau, introdueix el valor de C: ");  
        double C = Double.parseDouble(scanner.nextLine());
        System.out.print("Si us plau, introdueix el valor de D: ");  
        double D = Double.parseDouble(scanner.nextLine());
        System.out.print("Si us plau, introdueix el valor de E: ");  
        double E = Double.parseDouble(scanner.nextLine());
        
        double promig = ( A+B+C+D+E) / 5;
            System.out.println("El promig dels valors introduits és = " + promig);
        
        scanner.close();  // Cerrar el scanner
     }
        
    public static double potencia(double a, double b) {
            double resultatPotencia = 1.0;

            for (int i = 0; i < b; i++) {
                resultatPotencia *= a;
            }

            return resultatPotencia;
    }
}
        

