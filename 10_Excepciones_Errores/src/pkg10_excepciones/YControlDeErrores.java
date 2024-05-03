/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10_excepciones.y.control.de.errores;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author jordi
 */


public class YControlDeErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Escribe un programa que maneje posibles errores de entrada/salida utilizando bloques `try-catch`.
            String filename = "archivo.txt";

            try {
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error de entrada/salida: " + e.getMessage());
            } finally {
                System.out.println("El programa ha finalizado.");
            }
    
    //Crea tu propia excepción y úsala en una situación controlada.
    
        
        try {
            // Lanzar la excepción personalizada
            throw new MiExcepcion("¡Esta es una excepción personalizada!");
        } catch (MiExcepcion e) {
            // Capturar y manejar la excepción personalizada
            System.out.println("Se ha producido una excepción personalizada: " + e.getMessage());
        
        }
    
    //Implementa manejo de excepciones en métodos que puedan lanzar un error de división por cero.
    
        try {
                dividir(10, 0);
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero.");
                e.printStackTrace();
            }
        }
        public static void dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero");
        }
        int resultado = numerador / denominador;
        System.out.println("Resultado de la división: " + resultado);
        
    //Desarrolla un método que lance una excepción personalizada si se intenta añadir un objeto `null` a una colección personalizada.
        ColeccionPersonalizada<String> coleccion = new ColeccionPersonalizada<>();

        try {
            // Intentar agregar un objeto null a la colección
            String objetoNull = null;
            coleccion.agregarElemento(objetoNull);
        } catch (ObjetoNullException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    
    //Escribe un programa que capture múltiples tipos de excepciones y las maneje de manera específica.
    }
    
}
