/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9_interfaces_y_polimorfismo;

/**
 *
 * @author jordi
 */
public class DemoPolimorfismo {
    // Método que acepta un objeto de tipo Vehículo y ejecuta los métodos acelerar y frenar
    public static void manejarVehiculo(Vehiculo vehiculo) {
        vehiculo.acelerar();
        vehiculo.frenar();
    }

}
