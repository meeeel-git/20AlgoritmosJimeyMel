/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Algoritmos20;

import javax.swing.JOptionPane;

/**
 *
 * @author Melany Amador
 */

public class MenuAlgoritmos20 {
    Nivel1 n1 = new Nivel1();
    Nivel2 n2 = new Nivel2();
    Nivel3 n3 = new Nivel3();
    Nivel4 n4 = new Nivel4();
    Nivel5 n5 = new Nivel5();

    public void mostrarMenu() {
        int opcion = -1;
        String respuesta = "";
        do {
            respuesta = JOptionPane.showInputDialog(null, "°°°Bienvenid@ a la clase Menú de nuestros algoritmos"
                    + "\n ¿Qué algoritmo te gustaria utilizar?"
                    + "\n 3. Leer 8 números enteros"
                    + "\n 4. Convertir palabra conocida"
                    + "\n 7. Contar cuantas vocales tiene"
                    + "\n 8. Mostrar la suma de elementos pares e impares"
                    + "\n 11. Leer 12 números y solicitar un valor"
                    + "\n 12. Contar vocales, consonantes y otros símbolos"
                    + "\n 15. Rotar un arreglo hacia la derecha"
                    + "\n 16. Intercambiar valores"
                    + "\n 19. Determinar si está ordenado"
                    + "\n 20. Determinar si es Capicúa"
                    + "\n 0. Salir");
            
            opcion = Integer.parseInt(respuesta);
            
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 3...");
                    n1.PedirNumeros();
                    n1.MostrarNumeros();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 4...");
                    n1.MostrarCaracter();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 7...");
                    n2.ContarCaracteres();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 8...");
                    n2.SumaElementos();
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 11...");
                    n3.frecuenciaValor();
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 12...");
                    n3.clasificarChar();
                    break;
                case 15:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 15...");
                    n4.rotarDerecha();
                    break;
                case 16:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 16...");
                    n4.ValidacionIndices();
                    break;
                case 19:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 19...");
                    n5.esOrdenado();
                    break;
                case 20:
                    JOptionPane.showMessageDialog(null, "Ejecutando ejercicio 20...");
                    n5.esCapicua();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digitaste un numero incorrecto :( ");
                    break;
            }
        } while (opcion != 0);
    }
}