package Resolvido;
//Ex 80: Ler um vetor Q de 20 posições (aceitar somente números positivos). 
//Escrever a seguir o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor. 

import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        //declarando o vetor Q e as 20 posições:
        int [] elementoQ = new int[20];
        int maiorQ = Integer.MIN_VALUE;
        int posiçãoQ = 0;

        //escrevendo os Qs:
        for(int i=0; i<elementoQ.length; i++){
            System.out.println("Digite o " + (i+1) + " ° Q: ");
            Scanner scanner = new Scanner (System.in);
            int elemento = scanner.nextInt();
            //Procurando o maior valor de Q atribuido:
            if (elemento > maiorQ) {
                maiorQ = elemento;
                posiçãoQ = (i + 1);
            }
        }

        System.out.println("O maior elemento é " + maiorQ + " e está na posição " + posiçãoQ);
    } 
}

