import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        //Inserir valor do raio de un círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        
        // Tenta calcular a circunferência
        try {
            //Aplicando o if, para que quando o número for negativo, apareça a mensagem de erro do catch
            if (raio < 0) {
            throw new IllegalArgumentException ("num negativo");
        }
            
            double circunferência = 2 * Math.PI * raio;
                System.out.println("A circunferência do círculo é: " + circunferência);
                           
        }
        catch (Exception e) {
             
                //Para representar o erro, caso o valor do meu raio seja negativo
                System.out.println("O raio deve ser um número positivo.");
            }
                
        }    
     }  




