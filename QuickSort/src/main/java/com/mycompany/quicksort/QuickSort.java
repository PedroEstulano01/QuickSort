
package com.mycompany.quicksort;

public class QuickSort {

    public static void quickSort(int[] vet, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particionar(vet, inicio, fim);
            quickSort(vet, inicio, posicaoPivo - 1);
            quickSort(vet, posicaoPivo + 1, fim);
        }
    }

    private static int particionar(int[] vet, int inicio, int fim) {
        int pivo = vet[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vet[j] <= pivo) {
                i++;
                trocar(vet, i, j);
            }
        }

        trocar(vet, i + 1, fim);
        return i + 1;
    }

     private static void trocar(int[] vet, int i, int j) {
    int temp = vet[i];
    vet[i] = vet[j];
    vet[j] = temp;
    }

    public static void main(String[] args) {
        int[] vet = {20, 16, 15, 10, 9, 8, 7, 5, 1, 0};
        quickSort(vet, 0, vet.length - 1);

        System.out.println("Vetor desordenado: ");
        for (int i : vet) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n Vetor ordenado: ");
        for (int i : vet) {
            System.out.print(i + " ");
        }
    }
}
