/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

/**
 *
 * @author Aitor
 */
public class Prueba1 {

    /**
     * Método principal del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    /**
     * Método para hacer una multiplicación.
     * @param a Primer valor para la multiplicación
     * @param b Segundo valor para la multiplicación
     * @return Devuelve el resultado de la multiplicación.
     */
    
    public static int mutiplica(int a, int b){
        return a * b;
    }
    
    /**
     * Metodo para hacer el factorial de un número.
     * @param a El número al cual se le calcula el factorial
     * @return Devuelve el resultado del factorial
     */
    
    public static int factorial(int a){
        int factorial = a;
        for (int i = (a - 1); i < 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
    
}
