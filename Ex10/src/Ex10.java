//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor. 

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        float carro_novo;
        float custo_fabrica;
        Float distribuidor;
        float porcentagem_distribuidor;
        float porcentagem_impostos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, informe o valor do Custo de Fábrica do veículo R$:");
        custo_fabrica = sc.nextFloat();
        distribuidor = (45/100);    
        porcentagem_distribuidor =  ((custo_fabrica) * (distribuidor));
        System.out.println(porcentagem_distribuidor);


        porcentagem_impostos = ((custo_fabrica) * (28/100));
        System.out.println(porcentagem_impostos);

        carro_novo = (custo_fabrica) + (porcentagem_distribuidor) + (porcentagem_impostos);

        System.out.println("\nO valor do carro novo será de R$:");
        System.out.println(carro_novo);

        sc.close();

    }
}
