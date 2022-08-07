public class LivroDeLivraria extends Livro {
    private double preco;
    private boolean verificar_estado;

    public LivroDeLivraria(String nome_autor, String nome_livro, int ano, int avaliacao,boolean verificar, double preco){
        super(nome_autor, nome_livro, ano, avaliacao, verificar);
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String toString(){
        String temp;
        temp = super.toString()+"\nPreço:"+preco;
        return temp;
    }

    public boolean getVerificar(){
        if(verificar_estado==true){
            return verificar_estado;
        }else{
            return verificar_estado;
        }
    }
    
}
