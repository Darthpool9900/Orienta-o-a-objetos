import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nome;
        String nota,n_provas;
        Scanner teste = new Scanner(System.in);
        int nota_aux,num_provas,indice;
        
        nome = JOptionPane.showInputDialog(null,"Digite o nome:");
        nota = JOptionPane.showInputDialog(null,"Nota:");
        teste.nextInt();
        n_provas = JOptionPane.showInputDialog(null,"Número de provas feitas:");
        nota_aux = Integer.parseInt(nota);
        num_provas = Integer.parseInt(n_provas);
        

    }
}
