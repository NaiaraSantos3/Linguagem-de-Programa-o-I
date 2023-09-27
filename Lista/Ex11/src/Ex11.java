// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais  uma  comissão  também  fixa  para  cada  carro  vendido  
//e  mais  5% do  valor  das  vendas  por  ele efetuadas. Escrever um algoritmo que leia o número de  carros por  ele vendidos, o valor total de suas vendas, 
//o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor. 


import java.util.Scanner;


public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de carros vendidos:");
        int carro = sc.nextInt();

        System.out.println("Informe o valor do salário:");
        int salario = sc.nextInt();
        
        System.out.println("Informe o valor da comissão:");
        int comissao = sc.nextInt();

        int venda = carro * comissao;
        int i = (5/100);
        int venda_total = (venda * (i)) + venda;

        int novo_salario = venda_total + salario;
        
        System.out.println("O valor de venda é:");
        System.out.println(venda);
        System.out.println("/nO valor de venda total é:");
        System.out.println(venda_total);
        System.out.println("O valor do novo salário é:");
        System.out.println(novo_salario);

        sc.close();
    }
}
