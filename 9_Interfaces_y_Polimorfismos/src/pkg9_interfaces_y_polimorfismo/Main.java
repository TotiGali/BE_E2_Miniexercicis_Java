/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_interfaces_y_polimorfismo;

/**
 *
 * @author jordi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Define una interface `Veh�culo` con m�todos como `acelerar` y `frenar`. FET
        
    //Crea clases `Coche` y `Bicicleta` que implementen `Veh�culo`. FET
    
    //Demuestra el uso de polimorfismo con una funci�n que acepte `Veh�culo` y ejecute los m�todos `acelerar` y `frenar`.
    
        // Crear instancias de Coche y Bicicleta
            // Crear instancias de CocheConcreto y BicicletaConcreta
            CocheConcreto coche = new CocheConcreto();
            BicicletaConcreta bicicleta = new BicicletaConcreta();

            // Llamar al m�todo manejarVehiculo con un objeto CocheConcreto
            manejarVehiculo(coche);

            // Llamar al m�todo manejarVehiculo con un objeto BicicletaConcreta
            manejarVehiculo(bicicleta);
        //Utiliza interfaces para implementar m�ltiples herencias en Java.
    
    }
}
