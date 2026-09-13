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
public class Nivel2 {

    //Ejercicios hechos por: Jimena Rodríguez
    // EJERCICIO 7: Contar vocales en un arreglo de caracteres
    public void ContarCaracteres() {
        System.out.println("--- Contar vocales ---");
        char[] letras = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'c', 'i', 'o', 'n'};
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};
        int contador = 0;

        for (int i = 0; i < letras.length; i++) {
            char actual = Character.toLowerCase(letras[i]);
            // CORRECCIÓN: Se usó un for normal con índice 'j' para evitar el for-each avanzado
            for (int j = 0; j < vocales.length; j++) {
                if (actual == vocales[j]) {
                    contador++;
                }
            }
        }
        System.out.println("Total vocales: " + contador);
    }

    //Ejercicio 8
    public void SumaElementos() {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[15];
        int sumaPares = 0;
        int sumaImpares = 0;

        System.out.println("Ingrese 15 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Posición [" + i + "]: ");
            numeros[i] = teclado.nextInt();
            if (i % 2 == 0) {
                sumaPares = sumaPares + numeros[i];
            } else {
                sumaImpares = sumaImpares + numeros[i];
            }
        }
        System.out.println("\nSuma de índices PARES: " + sumaPares);
        System.out.println("Suma de índices IMPARES: " + sumaImpares);
    }
}
