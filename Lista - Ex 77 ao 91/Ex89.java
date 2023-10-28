// Ex 89:  Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. 
//Calcular e escrever a quantidade de vezes que V1 e V2 possuem os mesmos números 
//e nas mesmas posições.

import java.util.Scanner;

public class Ex89 {
    public static void main(String[] args) {
        //Determinando meu V1 e V2 + a quantidade de números em cada um (15 números)
        int[] V1 = new int[15];
        int[] V2 = new int[15];

        // Leitura dos V's
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < V1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número de V1: ");
            V1[i] = sc.nextInt();
        }
        for (int i = 0; i < V2.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número do V2: ");
            V2[i] = sc.nextInt();
        }

        // Comparando os dois V's
        int qtd = 0;
        for (int i = 0; i < V1.length; i++) {
            if (V1[i] == V2[i]) {
                qtd++;
            }
        }

        // Resultado após a comparação dos V's
        System.out.println("A quantidade de vezes que os vetores possuem os mesmos números e nas mesmas posições é: " + qtd);
    }
}
