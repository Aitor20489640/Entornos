/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;
//Todo bien y yo que me alegro
/**
 *
 * @author aitor
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        float mayor = 0, menor = 0;
        int max, i = 0;
        float temperatura[];
        
        System.out.println("Bienvenida");
        System.out.println("Dame el número de municipios para introducir su temperatura.");
        max=entry.nextInt();
        temperatura = new float[max];
        
        for (i = 0; i < temperatura.length; i++) {
            System.out.println("Dame una temperatura");
            temperatura[i] = entry.nextFloat(); 
            }
        
        for (i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > 0) {
                System.out.println(temperatura[i] + "ºC es una temperatura positiva.");
            } else if (temperatura[i] < 0) {
                System.out.println(temperatura[i] + "ºC es una temperatura negativa.");
            } else {
                System.out.println(temperatura[i] + "ºC es temperatura neutra.");
            }
            if (i == 1){
                mayor = temperatura[i];
                menor = temperatura[i];
            }
            else{
                if (temperatura[i] > mayor){
                    mayor = temperatura[i];
                } 
                if (temperatura[i] < menor) {
                    menor = temperatura[i];
            }
        }
            
            
        } 
        System.out.print("Las temperaturas almacenadas son: ");
        
        for (i = 0; i < temperatura.length; i++) {
            System.out.print(temperatura[i]+" ");
        }
        System.out.println("");
        
        System.out.println(mayor+"ºC es la mayor temperatura introducida y "+menor+"ºC es la menor temperatura introducida.");

    }

}
