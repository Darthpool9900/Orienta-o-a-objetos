import java.util.Scanner;


public abstract class Livro {
    private String nome_autor;
    private  String nome_livro;
    private int ano;
    private int avaliacao;
    private String verificar;
    
    

    public Livro(String nome_autor, String nome_livro, int ano, int avaliacao,String verificar) {
        this.nome_autor = nome_autor;
        this.nome_livro = nome_livro;
        this.ano = ano;
        this.avaliacao = avaliacao;
        this.verificar = verificar;
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

    public String getVer(){
        return informar(verificar);
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

    public void setVerficar(String verificar){
        this.verificar = verificar;
    }

    public void avaliar(){
        Scanner resposta = new Scanner(System.in);
        boolean port = true;
        while(true){
        System.out.println("Digite sua avaliação:");
        String ler =resposta.next();
        try{
            avaliacao = Integer.parseInt(ler);
            if(avaliacao<10 && avaliacao>0){
                port = false;
                return;
            }else{
                System.out.println("Inválido");
            }
            
        }catch(NumberFormatException e){
            System.out.println("Digite um número");
        }
        
        }
    }

    public String informar(String ver){
        if(verificar == "Biblioteca"){
            System.out.println("Livro de biblioteca");
            ver = "Biblioteca";
            return ver;
        }else if(verificar=="Livraria"){
            System.out.println("Livro de livraria");
            return ver = "Livraria";
        }else{
            return ver = "Erro";
        }
    }

    public String toString(){
        String temp = "Nome do autor:"+nome_autor+"\nNome do livro:"+nome_livro+"\nAno de publicação:"+ano+"\nAvaliação:"+avaliacao+"\nOrigem:"+verificar;
        return temp;
    }

}
