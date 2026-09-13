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
public class Nivel4 {
    //Ejercicios hechos por: Jimena Rodríguez

    // EJERCICIO 15
    public void rotarDerecha() {
        System.out.println("--- Rotar a la derecha ---");
        int[] arreglo = {10, 20, 30, 40, 50};
        if (arreglo.length > 0) {
            int ultimo = arreglo[arreglo.length - 1];
            for (int i = arreglo.length - 1; i > 0; i--) {
                arreglo[i] = arreglo[i - 1];
            }
            arreglo[0] = ultimo;
        }
        System.out.print("Arreglo rotado: ");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    //Ejercicio 16
    public void ValidacionIndices() {

        int[] numeros = {12, 24, 36, 48, 60};
        Scanner teclado = new Scanner(System.in);
        System.out.print("Arreglo actual: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + i + "]:" + numeros[i] + "  ");
        }
        System.out.println();
        System.out.print("Ingrese el primer índice a intercambiar: ");
        int indice1 = teclado.nextInt();
        System.out.print("Ingrese el segundo índice a intercambiar: ");
        int indice2 = teclado.nextInt();
        if (indice1 >= 0 && indice1 < numeros.length && indice2 >= 0 && indice2 < numeros.length) {
            int cajaAuxiliar = numeros[indice1];
            numeros[indice1] = numeros[indice2];
            numeros[indice2] = cajaAuxiliar;
            System.out.println("¡Intercambio realizado con éxito!");
            System.out.print("Arreglo modificado: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Error: Uno o ambos índices no existen en el arreglo.");
        }
    }
}
