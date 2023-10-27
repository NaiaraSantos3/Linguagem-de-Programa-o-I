package Resolvido;
// Ex 78:Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em 
//um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois 
//escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no 
//vetor), ou NÃO ACHEI caso contrário

// importando a classe scanner, para que eu possa inserir os nomes no terminal (eu vou atribuir/criar a lista)
import java.util.Scanner;

public class Ex78 {
      public static void main(String[] args) {
        // Nesta etapa, preciso declarar qual será meu vetor, sendo ele os nomes e a quantidade
        // que é 10 (conforme pede o exercício):
        String[] nomes = new String[10];

        // Ler os 10 nomes que vou inserir:
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Por favor, digite o nome:" );
            System.out.println( (i +1) + "°: ");
            Scanner scanner = new Scanner(System.in);
            nomes[i] = scanner.nextLine();
        }

        // Verificar se o nome que eu escolho está na lista digitada anteriormente
        System.out.println("Digite o nome a ser verificado: ");
        Scanner scanner = new Scanner(System.in);
        String nomeVerificado = scanner.nextLine();

        // Conferindo se o nome está ou não na minha lista
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equals(nomeVerificado)) {
                encontrado = true;
                break;
            }
        }

        // Informar se o nome está ou não na minha lista
        if (encontrado) {
            System.out.println("Achei");
        } else {
            System.out.println("Não Achei");
        }
    }
}

