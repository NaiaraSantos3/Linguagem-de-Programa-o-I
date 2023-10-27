package Resolvido;
//Ex 81:  O mesmo exercício anterior, mas agora deve escrever o menor elemento do vetor e 
//a respectiva posição dele nesse vetor. 

import java.util.Scanner;

public class Ex81 {
        public static void main(String[] args) {
        //declarando o vetor Q e as 20 posições:
        int [] elementoQ = new int[20];
        int menorQ = Integer.MAX_VALUE;
        int posiçãoQ = 0;

        //escrevendo os Qs:
        for(int i=0; i<elementoQ.length; i++){
            System.out.println("Digite o " + (i+1) + " ° Q: ");
            Scanner scanner = new Scanner (System.in);
            int elemento = scanner.nextInt();
            //Procurando o menor valor de Q atribuido:
            if (elemento < menorQ) {
                menorQ = elemento;
                posiçãoQ = (i + 1);
            }
        }

        System.out.println("O menor elemento é " + menorQ + " e está na posição " + posiçãoQ);
    } 
}

