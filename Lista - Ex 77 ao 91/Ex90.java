//Ex 90:Faça um algoritmo para ler um vetor de 30 números. Após isto, ler mais um número qualquer, 
//calcular e escrever quantas vezes esse número aparece no vetor. 

import java.util.Scanner;


public class Ex90 {
    public static void main(String[] args) {
        // Sequência de 30 números
        int[] n = new int[30];

        //Inserindo os números
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            n[i] = sc.nextInt();
        }

        // Qual número você deseja contabilizar?
        System.out.println("\nDigite o número a ser contado: ");
        int numero = sc.nextInt();

        // quantas vezes o número apareceu no vetor?
        int quantidade = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == numero) {
                quantidade++;
            }
        }

        // Resultado após contagem dos números repetidos 
        System.out.println("O número " + numero + " aparece " + quantidade + " vezes no vetor.");
    }
}

