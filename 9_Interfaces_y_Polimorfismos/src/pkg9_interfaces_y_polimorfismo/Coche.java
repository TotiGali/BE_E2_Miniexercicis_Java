/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9_interfaces_y_polimorfismo;

/**
 *
 * @author jordi
 */
public abstract class Coche implements Vehiculo {
    
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    public void frenar() {
        System.out.println("El coche está frenando.");
    }
}
