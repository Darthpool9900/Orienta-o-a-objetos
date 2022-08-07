import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Deseja calcular o dobro de um número?");
        
        if(option!=0){
            return;
        }
        String Valor  = JOptionPane.showInputDialog(null,"Digite um número");
        if(Valor==null){
            return;
        }
        int num = Integer.parseInt(Valor);
        JOptionPane.showMessageDialog(null,"O dobro é:"+num*2);
        }
    }
