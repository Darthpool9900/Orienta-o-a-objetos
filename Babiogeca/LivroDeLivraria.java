import java.util.Scanner;

public class LivroDeLivraria extends Livro {
    private double preco;
    private boolean verificar_estado;

    public LivroDeLivraria(String nome_autor, String nome_livro, int ano,int avaliacao, double preco, String verificar,boolean verificar_estado){
        super(nome_autor, nome_livro, ano,avaliacao,verificar);
        this.preco = preco;
        this.verificar_estado = verificar_estado;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("O preço é:R$"+preco);
    }

    public boolean Vender(boolean status){
        Scanner resposta = new Scanner(System.in);
        System.out.println("Deseja vender comprar o livro por R$"+preco+"?");
        String resp = resposta.next();
        resposta.nextInt();
        if(resp=="Sim"){
            resposta.close();
            return status=true;
        }else{
            resposta.close();
            return status = false;
        }
    }

    public String toString(){
        String temp;
        if(verificar_estado==true){
            temp = super.toString()+"\nPreço:"+preco+"\nVendido";
            return temp;
        }else{
            temp = super.toString()+"\nPreço:"+preco+"\nDisponível para compra";
            return temp;
        }
    }

    public boolean getVerificar(){
        return Vender(verificar_estado);
    }
    
}
