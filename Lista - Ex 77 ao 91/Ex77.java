import java.util.Arrays;

public class Ex77 {
    public static void main(String[] args) {
        //aqui está a representação dos vetores e índices representados no ex 77
        int [] v ={5, 1, 4, 2, 7, 8, 3, 6};

        //o valor é de 8 por se tratar, na lista, de 8 vetores
        
        // neste caso, seguindo a linha do ex 77
        for (int i = 8; i >= 5; i--) {
            if (i< v.length){
                int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
            }
            
        }

        int aux = v[1];
        v[1] = v[v[3]];
        v[v[3]] = aux;

        // resultado do meu novo vetor:
        System.out.println(Arrays.toString(v));
    
         
    }
}
