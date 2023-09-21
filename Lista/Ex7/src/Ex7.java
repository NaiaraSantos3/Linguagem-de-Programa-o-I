// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int idade;
        int m;
        int d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");

        idade = sc.nextInt();

        m = idade * 12; // idade em meses
        d = m * 30; // idade em dias

        System.out.println(m); // falta colocar a frase de complemento
        System.out.println((d)); // falta colocar a frase de complemento

        sc.close();

    }
}
