/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_y_clases_abstractas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jordi
 */
public class Estudiante extends Persona {
    private String grado;
    private String especializacion;

    
    // Constructor de Client
    public Estudiante(int id, String nom, String cognom, String grado, String especializacion) {
        super(id, nom, cognom);
        this.grado = grado;
        this.especializacion = especializacion;
    }
    
    // Getters y setters de Estudiante
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
    
    //Metodes de Estudiante que sobreescriu a Persona
    @Override
    public void hablar() {
        System.out.println("El estudiante no habla pero estudia.");
    }
    
    // Método para mostrar información académica del estudiante
    public void mostrarInformacionAcademica() {
        System.out.println("La información academica del estudiante es: ");
        System.out.println("Grado: " + grado);
        System.out.println("Especialización: " + especializacion);
    }
}
