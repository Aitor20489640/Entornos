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
        float temperatura, mayor = 0, menor = 0;
        int max;
        
        System.out.println("Bienvenida");
        System.out.println("Dame el numero de municipios a poner la temperatura.");
        max=entry.nextInt();
        
        for (int i = 1; i <= max; i++) {
            System.out.println("Dame una temperatura");
            temperatura = entry.nextInt();
            if (temperatura > 0) {
                System.out.println(temperatura + "ºC es una temperatura positiva.");
            } else if (temperatura < 0) {
                System.out.println(temperatura + "ºC es una temperatura negativa.");
            } else {
                System.out.println(temperatura + "ºC es temperatura neutra.");
            }
            if (i == 1){
                mayor = temperatura;
                menor = temperatura;
            }
            else{
                if (temperatura > mayor){
                    mayor = temperatura;
                } else {
                    menor = temperatura;
            }
                
            }
            
            
        } System.out.println(mayor+"ºC es la mayor temperatura introducida y "+menor+"ºC es la menor temperatura introducida.");

    }

}
