package br.uepg.deinfo.primeiro;

import javax.swing.JOptionPane;

public class Vetor {
    private Pessoa vetor[] = new Pessoa[3];
    private int posicao= 0;
    String nome,valor,code;
        double salario;
        int codigo;

    public void inlcuir(){
        

        JOptionPane.showMessageDialog(null,"Digite as informações:");
        nome  = JOptionPane.showInputDialog(null,"Nome:");
        if(nome==null){
            return;
        }
        valor = JOptionPane.showInputDialog(null,"Salario:");
        if(valor==null){
            return;
        }

        code = JOptionPane.showInputDialog(null,"Codigo:");
        if(code==null){
            return;
        }

        salario = Double.parseDouble(valor);
        codigo = Integer.parseInt(code);
        vetor[posicao] = new Pessoa(salario,codigo,nome);
        vetor[posicao].salario = salario;
        posicao++;
    }
    public void Imprimir(){
       System.out.println("Nome:"+nome+"\nCódigo:"+codigo+"\nSalario:"+salario);
    }
}
