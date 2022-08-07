import java.util.Scanner;


public abstract class Livro {
    private String nome_autor;
    private  String nome_livro;
    private int ano;
    private int avaliacao;
    

    public Livro(String nome_autor, String nome_livro, int ano, int avaliacao) {
        this.nome_autor = nome_autor;
        this.nome_livro = nome_livro;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public abstract boolean getVerificar();

    public String getNome_Autor(){
        return nome_autor;
    }

    public String getNome_livro(){
        return nome_livro;
    }

    public int getAno(){
        return ano;
    }

    public int getAvaliacao(){
        return avaliacao;
    }

 

    public void setNome_Autor(String nome_autor){
        this.nome_autor = nome_autor;
    }

    public void setNome_Livro(String nome_livro){
        this.nome_livro= nome_livro;
    }

    public void setAno(int ano){
        this.ano= ano;
    }

    public void setAvaliacao(int avaliacao){

        this.avaliacao= avaliacao;
    }

    public void avaliar(int avaliar){
        Scanner resposta = new Scanner(System.in);
        System.out.println("Digite sua avaliação:");
        resposta.nextInt(avaliar);
        resposta.close();
    }

    public String toString(){
        String temp = "Nome do autor:"+nome_autor+"\nNome do livro:"+nome_livro+"\nAno de publicação:"+ano+"\nAvaliação:"+avaliacao;
        return temp;
    }

}
