/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;
//Todo bien,todo correcto y yo que me alegro.

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
        String nombres[];
        int placemayor = 0, placemenor = 0;

        System.out.println("Bienvenida");
        System.out.println("Dame el número de municipios para introducir su temperatura.");
        max = entry.nextInt();
        temperatura = new float[max];
        nombres = new String[max];

        for (i = 0; i < temperatura.length; i++) {
            System.out.print("Dame una temperatura: ");
            temperatura[i] = entry.nextFloat();
            System.out.print("Dime su nombre: ");
            entry.nextLine();
            nombres[i] = entry.nextLine();
        }

        System.out.print("Las temperaturas almacenadas son: ");

        for (i = 0; i < temperatura.length; i++) {
            System.out.print(temperatura[i] + " ");
        }
        System.out.println("");

        System.out.print("Los nombres de los municipios son: ");

        for (i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println("");

        for (i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > 0) {
                System.out.println("La temperatura de " + nombres[i] + " es: " + temperatura[i] + "ºC y es una temperatura positiva.");
            } else if (temperatura[i] < 0) {
                System.out.println("La temperatura de " + nombres[i] + " es: " + temperatura[i] + "ºC es una temperatura negativa.");
            } else {
                System.out.println("La temperatura de " + nombres[i] + " es: " + temperatura[i] + "ºC es temperatura neutra.");
            }
            if (i == 0) {
                mayor = temperatura[i];
                menor = temperatura[i];
            } else {
                if (temperatura[i] > mayor) {
                    mayor = temperatura[i];
                    placemayor = i;
                }
                if (temperatura[i] < menor) {
                    menor = temperatura[i];
                    placemenor = i;
                }
            }

        }

        System.out.println("La temperatura mayor es: " + mayor + "ºC y es de: " + nombres[placemayor] + ", la temperatura menor es: " + menor + "ºC y es de: " + nombres[placemenor] + ".");

    }

}
