//Ex 88:  Faça um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais 
//um número qualquer e verificar se esse número existe no vetor ou não. Se existir, 
//o algoritmo deve gerar um novo vetor sem esse número. (Considere que não haverão números 
//repetidos no vetor). 

import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
       // Iniciando e mostrando que a sequência contém 20 números 
        int[] vetor = new int[20];

        // Leitura dos números
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            vetor[i] = sc.nextInt();
        }

        // Escolhendo qual o número será excluído da lista
        System.out.println("\nQual número você deseja remover? ");
        int numeroRemovido = sc.nextInt();

        // verificar se o número escolhido existe na lista
        boolean existe = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroRemovido) {
                existe = true;
                break;
            }
        }

        // Gerando o novo vetor, com a exclusão do número
        if (existe) {
            int[] novoVetor = new int[vetor.length - 1];
            int j = 0;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != numeroRemovido) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            }

            // Mostar nova sequência
            System.out.println("\nNovo vetor:");
            for (int i = 0; i < novoVetor.length; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("O número não existe no vetor.");
        }
    }
}

