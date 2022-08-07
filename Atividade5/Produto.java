package Atividade5;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private Data validade;

    public Produto(String nome, double preco, int quantidade){
        nome = this.nome;
        preco = this.preco;
        quantidade = this.quantidade;
        validade = this.validade;
    }
    /*public Produto(String nome,int preco){
        Produto produto;
        produto  = new Produto("Pokebola",300);
    }*/

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if(preco > 0 ){
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade){
        
        if(quantidade>0){
            this.quantidade = quantidade;
        }
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
      
        return quantidade;
    }

    public String toString(){
        String temp;
        temp = "Nome:"+nome+"\nPreco:"+preco+"\nQuantidade:"+quantidade+"data:"+validade;
        return temp;
    }

    public void Compra(double valor){
        valor = valor - (preco*quantidade);
        System.out.println("Valor total = "+valor);
    }

    public void Venda(double valor){
        valor = valor+ (preco*quantidade);
        if(quantidade==this.quantidade){
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Venda concluida");
        }else{
            System.out.println("Venda mal feita");
        }
    }

    public void setValidade(int dia,int mes,int ano){
        validade.setDia(dia);
        validade.setMes(mes);
        validade.setAno(dia);
    }

    public void setValidade(Data data){
        validade = data;
    }
}


