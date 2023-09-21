//Escreva um algoritmo para ler o número total de eleitores de um município, 
//o número de votosbrancos, nulos e válidos. Calcular e escrever o percentual 
//que cada um representa em relação ao total de eleitores. 

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int eleitores;
        int votos_brancos;
        int votos_nulos;
        int votos_validos;
        float pvotos_brancos;
        float pvotos_nulos;
        float pvotos_validos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores");
        eleitores = sc.nextInt();

        System.out.println("\nDigite o número de votos em branco:");
        votos_brancos = sc.nextInt();
        System.out.println("\nDigite o número de votos nulos:");
        votos_nulos = sc.nextInt();
        System.out.println("\nDigite o número de votos válidos:");
        votos_validos = sc.nextInt();

        pvotos_brancos = (((votos_brancos) / (eleitores)) * 100);

        pvotos_nulos = (((votos_nulos) / (eleitores)) * 100);

        pvotos_validos = (((votos_validos) / (eleitores)) * 100);

        System.out.println("Temos votos em branco:");
        System.out.println(pvotos_brancos);

        System.out.println("\nTemos votos nulos:");
        System.out.println(pvotos_nulos);
        System.out.println("\nTemos votos válidos:");
        System.out.println(pvotos_validos);

        sc.close();

    }
}
