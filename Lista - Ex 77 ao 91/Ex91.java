//Ex 91:  Faça um algoritmo para ler 50 números e armazenar em um vetor VET, 
//verificar e escrever se existem números repetidos no vetor VET e em que posições se encontram. 

 import java.util.Scanner;

public class Ex91 {
       public static void main(String[] args) {
        // Teste com 5 números e depois alterar para 50
        int[] VET = new int[50];

        // Inserindo os números
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < VET.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            VET[i] = sc.nextInt();
        }

        // quantas vezes o número apareceu no vetor?
        boolean existeRepetido = false;
        for (int i = 0; i < VET.length; i++) {
            for (int j = i + 1; j < VET.length; j++) {
                if (VET[i] == VET[j]) {
                    System.out.println("O número " + VET[i] + " foi repetido nas posições " + i + " e " + j);
                    existeRepetido = true;
                }
            }
        }

        // Resultado após contagem dos números repetidos e as suas posições
        if (!existeRepetido) {
            System.out.println("Não existem números repetidos no vetor.");
        }
    }
}
