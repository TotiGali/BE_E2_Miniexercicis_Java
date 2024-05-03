/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2_variables_y_tipos_de_datos;

/**
 *
 * @author jordi
 */
public class Variables {
    private String color;
    private int edat;
    private double avi;
    
    public Variables(String color, int edat, double avi){
        this.color = color;
        this.edat = edat;
        this.avi = avi;
    }    
    public String getColor() {
        return color;
    }
    public int getEdat() {
        return edat;
    }
    public double getAvi() {
        return avi;
    }
    
    public String getEdatString() {
        String edatString = Integer.toString(edat);
        return edatString;
    }
    
    public int arrodonir() {
        int arrodonir = (int)Math.round(avi);
        return arrodonir;
    }
}
