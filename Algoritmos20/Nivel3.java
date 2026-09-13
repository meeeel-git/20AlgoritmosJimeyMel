/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Algoritmos20;

import java.util.Scanner;

/**
 *
 * @author Melany Amador
 */
public class Nivel3 {

    //Ejercicios hechos por: Jimena Rodríguez
    //EJERCICIO 11: Frecuencia de un número
    public void frecuenciaValor() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        System.out.println("--- Frecuencia de un valor ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero [" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Valor a buscar: ");
        int buscar = scanner.nextInt();
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                contador++;
            }
        }
        System.out.println("El numero aparece " + contador + " veces.");
    }

    //Ejercicio 12
    public void clasificarChar() {
        System.out.println("\n--- Clasificar caracteres ---");
        char[] texto = {'a', 'l', 'g', 'o', '1', '0', '!'};
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int cantVocales = 0;
        int cantConsonantes = 0;
        int cantOtros = 0;

        for (int i = 0; i < texto.length; i++) {
            char actual = Character.toLowerCase(texto[i]);
            if (Character.isLetter(actual)) {
                boolean esVocal = false;
                // CORRECCIÓN: For tradicional con índice para mantener consistencia básica
                for (int j = 0; j < vocales.length; j++) {
                    if (actual == vocales[j]) {
                        esVocal = true;
                    }
                }
                if (esVocal) {
                    cantVocales++;
                } else {
                    cantConsonantes++;
                }
            } else {
                cantOtros++;
            }
        }
        System.out.println("Vocales: " + cantVocales);
        System.out.println("Consonantes: " + cantConsonantes);
        System.out.println("Otros: " + cantOtros);
    }
}
