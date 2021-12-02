/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);  
        int temperatura;
        System.out.println("Bienvenida");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Dame una temperatura");
            temperatura = entry.nextInt();
        }
    }

}
