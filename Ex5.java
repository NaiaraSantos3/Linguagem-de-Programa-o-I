import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) throws Exception {
       String a = "";
       int num = 0;
       int antecessor = 0;
       int sucessor = 0;
       String saida = "";
       a = JOptionPane.showInputDialog("Entre com o número");
       num = Integer.parseInt(a);

       antecessor = num - 1;
       sucessor = num + 1;
       saida += "O antecessor de" + num + " é "+ antecessor;
       saida += "\n O sucessor de" + num +" é " + sucessor;
       JOptionPane.showMessageDialog(null,saida);
      
    }
}
