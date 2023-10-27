package Resolvido;
//Ex 79:  Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos. 
//Calcular a média da turma e contar quantos alunos obtiveram nota acima desta média calculada. 
//Escrever a média da turma e o resultado da contagem

import java.util.Scanner;


public class Ex79 {
// Declarando o meu vetor: notas
// quantidade = 20 alunos
public static void main(String[] args) {
    int [] notas = new int [20];
    int alunosAcimaMéida = 0;
    int somaNotas = 0;

    //inserir as notas dos alunos
    for (int i=0; i<notas.length; i++){
        System.out.println("Por favor, informe a "+ (i+1) + "° nota: ");
        Scanner scanner = new Scanner (System.in);
        notas [i] = scanner.nextInt();
        
    }
    //Encontrando a média dos 20 alunos
    for (int nota: notas){
        somaNotas += nota;
    }
    int media = somaNotas / notas.length;

    //contar quantos alunos tiveram notas acima da média
    for (int nota: notas){
        if (nota>media){
            alunosAcimaMéida++;
        }
    }

    //Mostrar a média e quantos alunos acima dessa média
    System.out.println("A méida dos 20 alunos é: " + media);
    System.out.println("O total de alunos acima da média é:" + alunosAcimaMéida);
    }
    
}
