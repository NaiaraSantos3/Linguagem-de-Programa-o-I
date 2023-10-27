//Ex87: O mesmo exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente, 
//deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja, 
//mantendo a ordem crescente do vetor

import java.util.Scanner;

public class Ex87 {

    public static void main(String[] args) {
        // Iniciando e mostrando que a sequência contém 10 números 
        int[] numero = new int[10];

        // Leitura dos 10 números
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            numero[i] = sc.nextInt();
        }

        // Mostrar todos os números, na sequência digitada, sem organizar em ordem crescente
        System.out.println("Sequência original:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }

        // Colocar em sequência
        for (int i = 0; i < numero.length - 1; i++) {
            for (int j = i + 1; j < numero.length; j++) {
                if (numero[i] > numero[j]) {
                    // Invertendo a sequência digitada, para organizar a sequência em ordem crescente
                    int aux = numero[i];
                    numero[i] = numero[j];
                    numero[j] = aux;
                }
            }
        }

        // Digitando o novo número, que entrará para a sequência
        System.out.println("\nDigite o novo número: ");
        int novoNumero = sc.nextInt();

        // Colocando o novo número em ordem crescente
        int i = 0;
        while (numero[i] < novoNumero) {
            i++;
        }

        for (int j = numero.length - 1; j > i; j--) {
            numero[j] = numero[j - 1];
        }

        numero[i] = novoNumero;

        // Exibir o vetor ordenado com o novo número
        System.out.println("\nSequência organizada, em ordem crescente, com o novo número:");
        for (i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}