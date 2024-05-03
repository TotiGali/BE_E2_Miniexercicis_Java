/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_variables_y_tipos_de_datos;

/*@author jordi*/
import java.util.Scanner; /*Cal introduir aquesta linea per que agafi l'eina Scanner de Java*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declara e inicializa variables de diferentes tipos (int, double, String). Imprime estas variables.

        Variables variable1 = new Variables("groc", 28, 28.5);
        
        System.out.println("Color: " + variable1.getColor());
        System.out.println("Edat: " + variable1.getEdat());
        System.out.println("Avi: " + variable1.getAvi());
        
        //Realiza y muestra conversiones entre tipos de datos (casting).

        System.out.println("S'ha convertit la variable edat a String: " + variable1.getEdatString());
        System.out.println("S'ha arrodonit la variable Avi \n al passar-la de double a int: " + variable1.arrodonir());
        
        // Escribe un programa que calcule y muestre el área de un rectángulo usando variables para los lados.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Si us plau, introdueix el costat a: ");  
        double a = Double.parseDouble(scanner.nextLine());  
        System.out.print("Si us plau, introdueix el costat b: ");  
        double b = Double.parseDouble(scanner.nextLine());  

        double area = a * b;
        System.out.println("La superfície del rectangle " + a + " x " + b + " és: " + area + " m2");  

        //Crea un programa que convierta grados Fahrenheit a Celsius y viceversa.

        System.out.print("Si us plau, introdueix la temperatura en graus Fahreinheti: ");  
        int tempFahreinheit =(scanner.nextInt()); 
        
        int tempCelsius = (int)(tempFahreinheit - 32) * 5 / 9;
        
        System.out.println("La temperatura introduida " + tempFahreinheit + "graus Fahreinheit, equival a: " + tempCelsius + "graus Celsius"); 
        
        scanner.close();  // Cerrar el scanner

    }
    
}
