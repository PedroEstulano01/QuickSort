
package com.mycompany.quicksort;

public class QuickSort {

    public static void quickSort(int[] numeros, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particionar(numeros, inicio, fim);
            quickSort(numeros, inicio, posicaoPivo - 1);
            quickSort(numeros, posicaoPivo + 1, fim);
        }
    }

    private static int particionar(int[] numeros, int inicio, int fim) {
        int pivo = numeros[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (numeros[j] <= pivo) {
                i++;
                trocar(numeros, i, j);
            }
        }

        trocar(numeros, i + 1, fim);
        return i + 1;
    }

     private static void trocar(int[] numeros, int i, int j) {
    int temp = numeros[i];
    numeros[i] = numeros[j];
    numeros[j] = temp;
    }

    public static void main(String[] args) {
        int[] numeros = {20, 16, 15, 10, 9, 8, 7, 5, 1, 0};
        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("Array desordenado: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nArray ordenado: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}