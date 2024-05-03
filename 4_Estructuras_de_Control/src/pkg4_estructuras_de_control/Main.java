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

        // Escribe un programa que use `if` para comparar dos n�meros e imprimir cu�l es mayor o si son iguales.
        System.out.print("Si us plau, introdueix el valor de A: ");  
        int A = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Si us plau, introdueix el valor de B: ");  
        int B = Integer.parseInt(scanner.nextLine());
        
         if (A <= B) {
            System.out.println("El nombre major �s, " + B); 
        }
         else {
            System.out.println("El nombre major �s, " + A); 
         }
        
        // Implementa un bucle `for` que imprima n�meros del 1 al 10.
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
        
        // Desarrolla un programa que pida al usuario un n�mero y utilice un bucle `do-while` para sumar todos los n�meros hasta ese n�mero.
        System.out.print("Si us plau, introdueix un nombre m�s: ");  
        int nombre = Integer.parseInt(scanner.nextLine());
        int resultat = 0;
        
        for (int i = 0; i <= nombre; i++){ 
                resultat = resultat + i;
        }
        
         System.out.println("El resultat de la suma dels nombres des de 0 �s: " + resultat);
         
        // Agrega un ejemplo que use `switch` para realizar diferentes operaciones matem�ticas basadas en la entrada del usuario.
        
        System.out.print("Introdueix el primer nombre: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Introdueix el segon nombre: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Quina operaci� vols realitzar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicaci�");
        System.out.println("4. Divisi�");
        System.out.print("Introdueix el n�mero de l'operaci�: ");
        int operacio = Integer.parseInt(scanner.nextLine());

        double resultateleccio = 0.0;

        switch (operacio) {
            case 1:
                resultateleccio = num1 + num2;
                System.out.println("La suma de " + num1 + " + " + num2 + " �s: " + resultateleccio);
                break;
            case 2:
                resultateleccio = num1 - num2;
                System.out.println("La resta de " + num1 + " - " + num2 + " �s: " + resultateleccio);
                break;
            case 3:
                resultateleccio = num1 * num2;
                System.out.println("La multiplicaci� de " + num1 + " x " + num2 + " �s: " + resultateleccio);
                break;
            case 4:
                if (num2 != 0) {
                    resultateleccio = num1 / num2;
                    System.out.println("La divisi� de " + num1 + " entre " + num2 + " �s: " + resultateleccio);
                } else {
                    System.out.println("Error: No es pot dividir per zero!");
                }
                break;
            default:
                System.out.println("Operaci� no v�lida!");
        }        
        //El mateix cas amb el tipus d'operaci� introduint text     
        System.out.println("Quina operaci� vols realitzar?");
        String operaciotext = scanner.nextLine();

        double resultatelecciotext = 0.0;

        switch (operaciotext) {
            case "suma":
                resultatelecciotext = num1 + num2;
                System.out.println("La suma de " + num1 + " + " + num2 + " �s: " + resultatelecciotext);
                break;
            case "resta":
                resultatelecciotext = num1 - num2;
                System.out.println("La resta de " + num1 + " - " + num2 + " �s: " + resultatelecciotext);
                break;
            case "multiplicacio":
                resultatelecciotext = num1 * num2;
                System.out.println("La multiplicaci� de " + num1 + " x " + num2 + " �s: " + resultatelecciotext);
                break;
            case "divisio":
                if (num2 != 0) {
                    resultatelecciotext = num1 / num2;
                    System.out.println("La divisi� de " + num1 + " entre " + num2 + " �s: " + resultatelecciotext);
                } else {
                    System.out.println("Error: No es pot dividir per zero!");
                }
                break;
            default:
                System.out.println("Operaci� no v�lida!");
        }

        
        scanner.close();  // Cerrar el scanner
    }
    
   
    
}
