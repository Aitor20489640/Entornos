/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmetodos;
import java.util.Scanner;

/**
 *Funcio de puebra
 * @author aitgal
 * @version 1.0
 */
public class Testmetodos {

    /**
     * Esta es la función principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola "+inputNombre()+".");
    }
    
    /**
     * Metodo para introducir un nombre
     * @return Devuelve un nombre escrito por el usuario.
     */
    public static String inputNombre(){
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("Introduce tu nombre: ");
        n = sc.nextLine();
        
        return n;
    }
    
}
