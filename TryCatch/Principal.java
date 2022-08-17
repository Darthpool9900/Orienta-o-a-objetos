import javax.swing.JOptionPane;
import java.util.InputMismatchException;


public class Principal {
    public static void main(String[] args) {
        String nome;
        String nota,n_provas,ind;
        int nota_aux,num_provas,indice;
        
        while(true){
        ind = JOptionPane.showInputDialog(null,"Digite o indice que quer consultar:");
        try{
            indice=Integer.parseInt(ind);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Erro");
        }
        nome = JOptionPane.showInputDialog(null,"Digite o nome:");
        try{
           
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Erro");
            return;
        }
            nota = JOptionPane.showInputDialog(null,"Nota:");
            try{
                nota_aux= Integer.parseInt(nota);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Erro");
                return;
            }
            n_provas = JOptionPane.showInputDialog(null,"Número de provas feitas:");
            try{
                num_provas = Integer.parseInt(n_provas);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Erro");
                return;
            }
            try{
                Aluno aluno[] = new Aluno[2];
                aluno[indice]= new Aluno(nome,nota);
            }
        
    }
    }
}
