/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_y_clases_abstractas;

/**
 *
 * @author jordi
 */
public class Herencia_y_clases_abstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Extiende la clase `Persona` para crear una nueva clase `Estudiante` que tenga grado y especializaci�n como atributos adicionales. FET
        // Crear una instancia de Persona
        Persona persona = new Persona(1, "Juan", "Garc�a");

        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante(2, "Mar�a", "L�pez", "Bachillerato", "Ciencias");

        // Imprimir los detalles de la persona
        System.out.println("Detalles de la Persona:");
        System.out.println("ID: " + persona.getId());
        System.out.println("Nombre: " + persona.getNom());
        System.out.println("Apellido: " + persona.getCognom());

        // Imprimir los detalles del estudiante
        System.out.println("\nDetalles del Estudiante:");
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Nombre: " + estudiante.getNom());
        System.out.println("Apellido: " + estudiante.getCognom());
        System.out.println("Grado: " + estudiante.getGrado());
        System.out.println("Especializaci�n: " + estudiante.getEspecializacion());
        
        System.out.println("-------------------------------------------------------");
        
    //Sobrescribe un m�todo de la clase padre en la clase hijo y demuestra su uso.
        
        persona.hablar(); // Output: la persona habla mucho.
        estudiante.hablar(); // Output: El estudiante no habla pero estudia.
        System.out.println("-------------------------------------------------------");

        
    //A�ade un m�todo espec�fico para `Estudiante` que muestre su informaci�n acad�mica.
        estudiante.mostrarInformacionAcademica();
        System.out.println("-------------------------------------------------------");
    
    //Crea una clase abstracta `Animal` con un m�todo abstracto `hacerSonido`.  FET
    
    //Implementa clases `Perro` y `Gato` que hereden de `Animal` y definan el m�todo `hacerSonido`. FET
    
    }
    
}
