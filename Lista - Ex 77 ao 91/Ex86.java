package Resolvido;
//Ex86:Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, 
//o algoritmo deve ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado

import java.util.Scanner;

public class Ex86 {
    public static void main(String[] args) {
        // Declaração das variáveis
        int[] numeros = new int[10];
        int auxiliar;

        // Leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            numeros[i] = scanner.nextInt();
        }

        // Ordenação dos números
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca os elementos
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        // Impressão do vetor ordenado
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}