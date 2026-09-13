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
public class Nivel1 {

    //Ejercicios hechos por: Jimena Rodríguez
    //Ejercicio número 3
    int[] numeros = new int[8];
    char[] caracteres = {'H', 'o', 'l', 'a'};

    public void PedirNumeros() {
        System.out.println("ingrese los 8 números enteros");
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número:" + (i + 1));
            numeros[i] = teclado.nextInt();
        }
    }

    public void MostrarNumeros() {
        System.out.println("Los numeros ingresados son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    //Ejercicio numero 4
    public void MostrarCaracter() {
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }
    }
}
