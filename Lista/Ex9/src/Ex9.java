//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário. 

import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        int salario_atual;
        float reajuste;
        float novo_salario;

        Scanner sc = new Scanner(System.in);
                
        System.out.println("Digite o valor do sálario atual:");
        salario_atual = sc.nextInt();

        System.out.println("\nDigite o percentual do reajuste, sem o símbolo de %:");
        reajuste = sc.nextFloat();

        novo_salario = salario_atual + (salario_atual * (reajuste/100));

        System.out.println("\nO valor atualizado do salário será de R$:");
        System.out.println(novo_salario);


    }
}

