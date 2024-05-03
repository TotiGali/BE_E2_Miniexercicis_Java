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
public class Persona {
    public int id;
    private String nom;
    private String cognom;
    
    //Constructor de Persona 
    public Persona(int id, String nom, String cognom){
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
    }
    
    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    
    //Metodes persona
    public void hablar() {
        System.out.println("La persona habla mucho.");
    
    }
}
