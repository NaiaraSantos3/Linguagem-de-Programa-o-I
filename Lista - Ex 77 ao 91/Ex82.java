package Resolvido;
//Ex 82:  Ler um vetor A de 10 números. Após, ler mais um número e guardar em uma variável X. 
//Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo após, 
//imprimir o vetor M. 

import java.util.Scanner;

public class Ex82 { 
    public static void main(String[] args) {
        //declarando o meu vetor e quantidade de números que irá ler
        int [] A = new int[10]; 
        int [] M = new int[10];
        int X;

        // Atribuindo os 10 valores para o meu vetor A:
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o elemento A[" + (i+1) + "]: ");
            Scanner scanner = new Scanner(System.in);
            A[i] = scanner.nextInt();
        } 
            // Inserir o valor X
        System.out.println("Digite o valor de X: ");
        Scanner scanner = new Scanner(System.in);
        X = scanner.nextInt();

        // Multiplicando os valores de A e X
        for (int i = 0; i < M.length; i++) {
            M[i] = A[i] * X;
        }

        // Gerando o valor de M
        for (int i = 0; i < M.length; i++) {
            System.out.println("M[" + i + "]: " + M[i]);
        } 
    }
}

