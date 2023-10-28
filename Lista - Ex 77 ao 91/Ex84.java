//REFAZER!!!!
//Ex84: Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). 
//Após, ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um 
//terceiro vetor Soma a soma dos elementos do vetor A com os do vetor B 
//(respeitando as mesmas posições) e escrever o vetor Soma. 

import java.util.Scanner;

public class Ex84 {
    public static void main(String[] args) {
        // Declaração dos vetores A e B
        int n;
        int[] vetorA;
        int[] vetorB;
        int[] vetorSoma;

        // Qual o tamanho desejado para os vetores
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seria o tamanho desejado para o vetor? Por favor, digite: ");
        n = sc.nextInt();

        // Declaração dos vetores
        vetorA = new int[n];
        vetorB = new int[n];
        vetorSoma = new int[n];

        // Determinando os meus vetores A e B
        System.out.println("\nVetor A:");
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            vetorA[i] = sc.nextInt();
        }
        System.out.println("\nVetor B:");
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            vetorB[i] = sc.nextInt();
        }

        // Vetor A + Vetor B
        for (int i = 0; i < n; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        // Resultado da somma entre os vetores A e B
        System.out.println("\nA soma entre os Vetores A e B é de:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetorSoma[i] + " ");
        }
    }
}

