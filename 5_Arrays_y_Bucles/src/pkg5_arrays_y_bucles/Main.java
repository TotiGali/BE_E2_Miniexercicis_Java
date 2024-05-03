/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_arrays_y_bucles;

/**
 *
 * @author jordi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Crea un array de enteros y usa un bucle para sumar todos los valores del array.

        int[] matriuNombres = new int[6];
         
        matriuNombres[0] = 70;
        matriuNombres[1] = 60;
        matriuNombres[2] = 50;
        matriuNombres[3] = 40;
        matriuNombres[4] = 30;
        matriuNombres[5] = 80;
        
        int sumaMatriu = 0;
        for (int i = 0; i < matriuNombres.length; i++){
            sumaMatriu += matriuNombres[i];
        }
        System.out.println("La suma de tots els valors de la matrius és = " + sumaMatriu);

    //Modifica el array anterior para que imprima todos los valores al revés.
        for (int i = matriuNombres.length - 1; i >= 0; i--){
             System.out.println("La matriu en ordre invers és = " + matriuNombres[i]);
        }
       
    //Utiliza un bucle `for-each` para buscar el mayor número en el array.
        int major = matriuNombres[0];
        for (int u = 0; u < matriuNombres.length; u++){
             if (matriuNombres[u] > major){
                 major = matriuNombres[u];
             }
        }
        System.out.println("El numero més gran és = " + major);
        
    //Desarrolla un programa que compare dos arrays de enteros y determine si son idénticos.
    
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5, 7};

        // Variable per controlar si els dos arrays són idèntics
        boolean sonIdentics = true;

        // Comprovem si els dos arrays tenen la mateixa longitud
        if (array1.length != array2.length) {
            sonIdentics = false;
        } else {
            // Comprovem cada element dels dos arrays
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    sonIdentics = false;
                    break; // Si trobem un element diferent, ja no cal continuar la comparació
                }
            }
        }

        // Imprimeix el resultat
        if (sonIdentics) {
            System.out.println("Els dos arrays són idèntics.");
        } else {
            System.out.println("Els dos arrays no són idèntics.");
        }
    
    //Implementa un programa que encuentre el número más pequeño y el más grande en un array.
    
        int[] matriuMajorMenor = new int[4];

            matriuMajorMenor[0] = 720;
            matriuMajorMenor[1] = 60;
            matriuMajorMenor[2] = 5;
            matriuMajorMenor[3] = 40;
        
        int majorNumero = matriuMajorMenor[0];
        for (int i = 0; i < matriuMajorMenor.length; i++){
             if (matriuMajorMenor[i] > majorNumero){
                 majorNumero = matriuMajorMenor[i];
             }
        }
        System.out.println("El numero més gran és = " + majorNumero);
        
        int menorNumero = matriuMajorMenor[0];
        for (int u = 0; u < matriuMajorMenor.length; u++){
             if (matriuMajorMenor[u] < menorNumero){
                 menorNumero = matriuMajorMenor[u];
             }
        }
        System.out.println("El numero menor és = " + menorNumero);  
    }  
}
    


