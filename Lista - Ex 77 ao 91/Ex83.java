package Resolvido;
//Ex 83:Faça um algoritmo para ler 20 números e armazenar em um vetor. Após a leitura total dos 
//20 números, o algoritmo deve escrever esses 20 números lidos na ordem inversa. 


import java.util.Scanner;

public class Ex83 {
    public static void main(String[] args) {
        // Declaração das variáveis
        int[] numeros = new int[20];

        // Inserir os 20 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            numeros[i] = scanner.nextInt();
        }

        // Colcocando os números na ordem contrária, conforme o exercício solicita:
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(" ");
            System.out.println(numeros[i]);
        }
    }
}
