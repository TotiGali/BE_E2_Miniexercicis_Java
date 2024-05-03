/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_estructuras_de_control;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear una instancia de Scanner

        // Escribe un programa que use `if` para comparar dos números e imprimir cuál es mayor o si son iguales.
        System.out.print("Si us plau, introdueix el valor de A: ");  
        int A = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Si us plau, introdueix el valor de B: ");  
        int B = Integer.parseInt(scanner.nextLine());
        
         if (A <= B) {
            System.out.println("El nombre major és, " + B); 
        }
         else {
            System.out.println("El nombre major és, " + A); 
         }
        
        // Implementa un bucle `for` que imprima números del 1 al 10.
        int bucleFor = 1;
        for (int i = 0; i < 10; i++) {
                System.out.println("Imprimeix els nombres de l'1 al 10: " + bucleFor); 
                bucleFor ++;
        }
        
        // Usa un bucle `while` para realizar una cuenta regresiva desde 10 hasta 1.
        int bucleWhile = 10;
        while (bucleWhile > 0) {
                System.out.println("Compte regressiu del 10 a l'1: " + bucleWhile); 
                bucleWhile --;
        }
        
        // Desarrolla un programa que pida al usuario un número y utilice un bucle `do-while` para sumar todos los números hasta ese número.
        System.out.print("Si us plau, introdueix un nombre més: ");  
        int nombre = Integer.parseInt(scanner.nextLine());
        int resultat = 0;
        
        for (int i = 0; i <= nombre; i++){ 
                resultat = resultat + i;
        }
        
         System.out.println("El resultat de la suma dels nombres des de 0 és: " + resultat);
         
        // Agrega un ejemplo que use `switch` para realizar diferentes operaciones matemáticas basadas en la entrada del usuario.
        
        System.out.print("Introdueix el primer nombre: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Introdueix el segon nombre: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Quina operació vols realitzar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicació");
        System.out.println("4. Divisió");
        System.out.print("Introdueix el número de l'operació: ");
        int operacio = Integer.parseInt(scanner.nextLine());

        double resultateleccio = 0.0;

        switch (operacio) {
            case 1:
                resultateleccio = num1 + num2;
                System.out.println("La suma de " + num1 + " + " + num2 + " és: " + resultateleccio);
                break;
            case 2:
                resultateleccio = num1 - num2;
                System.out.println("La resta de " + num1 + " - " + num2 + " és: " + resultateleccio);
                break;
            case 3:
                resultateleccio = num1 * num2;
                System.out.println("La multiplicació de " + num1 + " x " + num2 + " és: " + resultateleccio);
                break;
            case 4:
                if (num2 != 0) {
                    resultateleccio = num1 / num2;
                    System.out.println("La divisió de " + num1 + " entre " + num2 + " és: " + resultateleccio);
                } else {
                    System.out.println("Error: No es pot dividir per zero!");
                }
                break;
            default:
                System.out.println("Operació no vàlida!");
        }        
        //El mateix cas amb el tipus d'operació introduint text     
        System.out.println("Quina operació vols realitzar?");
        String operaciotext = scanner.nextLine();

        double resultatelecciotext = 0.0;

        switch (operaciotext) {
            case "suma":
                resultatelecciotext = num1 + num2;
                System.out.println("La suma de " + num1 + " + " + num2 + " és: " + resultatelecciotext);
                break;
            case "resta":
                resultatelecciotext = num1 - num2;
                System.out.println("La resta de " + num1 + " - " + num2 + " és: " + resultatelecciotext);
                break;
            case "multiplicacio":
                resultatelecciotext = num1 * num2;
                System.out.println("La multiplicació de " + num1 + " x " + num2 + " és: " + resultatelecciotext);
                break;
            case "divisio":
                if (num2 != 0) {
                    resultatelecciotext = num1 / num2;
                    System.out.println("La divisió de " + num1 + " entre " + num2 + " és: " + resultatelecciotext);
                } else {
                    System.out.println("Error: No es pot dividir per zero!");
                }
                break;
            default:
                System.out.println("Operació no vàlida!");
        }

        
        scanner.close();  // Cerrar el scanner
    }
    
   
    
}
