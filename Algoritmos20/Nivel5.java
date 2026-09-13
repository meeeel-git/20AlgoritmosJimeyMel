/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Algoritmos20;

/**
 *
 * @author Melany Amador
 */
public class Nivel5 {

    // Ejercicio 19
    public void esOrdenado() {
        System.out.println("--- Verificar orden ---");
        int[] arreglo = {5, 12, 18, 25, 30};
        boolean ordenado = true;
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                ordenado = false;
            }
        }
        System.out.println("¿Esta ordenado?: " + ordenado);
    }

    //Ejercicio 20
    public void esCapicua() {
        System.out.println("\n--- Verificar capicua ---");
        int[] arreglo = {1, 4, 6, 4, 1};
        boolean capicua = true;
        for (int i = 0; i < arreglo.length / 2; i++) {
            int posicionSimetrica = arreglo.length - 1 - i;
            if (arreglo[i] != arreglo[posicionSimetrica]) {
                capicua = false;
            }
        }
        System.out.println("¿Es capicua?: " + capicua);
    }
}
