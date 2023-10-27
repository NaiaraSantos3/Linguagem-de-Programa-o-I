package Resolvido;
// Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano. 
//Calcular e escrever: 
//a) Menor temperatura do ano 
//b) Maior temperatura do ano 
//c) Temperatura média anual 
//d) O número de dias no ano em que a temperatura foi inferior a média anual

import java.util.Scanner;

public class Ex85 {
     public static void main(String[] args) {
        //Declarar a quantidade de dias a serem inseridas as temperaturas
        //para teste, está sendo declarada apenas 3. 
        //Depois será alterarada para avaliar um ano = 365 dias(será esse o valor final do vetor)
        int[] temperaturas = new int[365];
        int menorTemperatura = Integer.MAX_VALUE;
        int maiorTemperatura = Integer.MIN_VALUE;
        float somaTemperaturas = 0;
        int diasTemperaturaInferiorMedia = 0;

        // Leitura das temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Digite a temperatura média do dia " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            temperaturas[i] = scanner.nextInt();

            // Atualização da menor e maior temperatura
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }

            // Atualização da soma das temperaturas
            somaTemperaturas += temperaturas[i];
        }

        // Cálculo da temperatura média anual
        float temperaturaMediaAnual = somaTemperaturas / temperaturas.length;

        // Contabilização dos dias em que a temperatura foi inferior à média anual
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < temperaturaMediaAnual) {
                diasTemperaturaInferiorMedia++;
            }
        }

        // Impressão dos resultados
        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
        System.out.println("Número de dias em que a temperatura foi inferior à média anual: " + diasTemperaturaInferiorMedia);
    }
}

