/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_funciones_y_metodos;

/*@author jordi*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //1-Escribe un m�todo que tome dos par�metros, los sume y devuelva el resultado.
        int resultat = sumar(230, 89);
        System.out.println("El resultat de la suma �s: " + resultat);

    //2-Crea un m�todo que reciba un array y devuelva el elemento m�s grande.
        int major = creararray(60, 200, 50);
        System.out.println("l'element m�s gran de la matriu �s: " + major);
        
    //3-Desarrolla un m�todo que verifique si un n�mero es par o impar.
        int numero = 20;
        if (esparell(numero)) {
            System.out.println(numero + " �s parell.");
        } else {
            System.out.println(numero + " �s senar.");
        }
        
    //4-Implementa un m�todo que invierta una cadena de texto y la retorne.
        String cadenatext = "'a la catalana banal atacala'";
        String textinvertit = invertirText(cadenatext);
        System.out.println(cadenatext + " si ho invertim �s: " + textinvertit + ", �s un PALINDROM !");
        
    //5-A�ade un m�todo que reciba un string y devuelva el mismo string sin vocales.
        String textambvocals = "'a la catalana banal atacala'";
        String textsensevocals = treureVocals(textambvocals);
        System.out.println(textambvocals + " si treaiem les vocals surt: " + textsensevocals + ". Que tamb� ho �s.");
    
    //6-Escribe un m�todo `static` que calcule el factorial de un n�mero.
        int N = 3;
        int factorialdeN = factorial(N);
        System.out.println("el factorial de " + N + " �s: " + factorialdeN);

    }

    
    
    
    
    //1-Metode
        public static int sumar(int a, int b) {
            return a + b;
        }
        
    //2-Metode
        public static int creararray(int A, int B, int C){
            int[] matriu = new int[3];
            
            matriu[0] = A;
            matriu[1] = B;
            matriu[2] = C;
            
            int major = matriu[0];
            for (int u = 0; u < matriu.length; u++){
                 if (matriu[u] > major){
                     major = matriu[u];
                 }
            }
            return major;
        }
        
    //3-Metode
        public static boolean esparell(int numero){
            return numero % 2 == 0;
        }
        
    //4-Metode
        public static String invertirText(String cadenatext){
            StringBuilder stringBuilder = new StringBuilder(cadenatext);
            stringBuilder.reverse();
            return stringBuilder.toString();
        }
        
    //5-Metode
        public static String treureVocals(String textambvocals){
            return textambvocals.replaceAll("[aeiouAEIOU]", "");
        }
        
    //6-Metode
        public static int factorial(int N) {
            if (N <= 1){
                return 1;
            }
            int factorial = 1;
            for (int i = 1; i <= N; i++){
                factorial *= i;
            }
            return factorial;
        }
}

