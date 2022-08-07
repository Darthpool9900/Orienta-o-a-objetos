
import javax.swing.JOptionPane;

public class Vetor {
    private Pessoa vetor[] = new Pessoa[2];
    private int posicao= 0;

    public void inlcuir(){
        String nome,valor;
        double salario;
        int codigo;

        JOptionPane.showMessageDialog(null,"Digite as informações:");
        nome  = JOptionPane.showInputDialog(null,"Nome:");
        if(nome==null){
            return;
        }
        valor = JOptionPane.showInputDialog(null,"Salario:");
        if(valor==null){
            return;
        }

        valor = JOptionPane.showInputDialog(null,"Codigo:");
        if(valor==null){
            return;
        }
        salario = Double.parseDouble(valor);
        vetor[posicao] = new Pessoa(codigo,nome);
        vetor[posicao].salario = salario;
        posicao++;
    }
}
