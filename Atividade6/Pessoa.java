package Atividade6;

public class Pessoa{
    private String nome, telefone;
    private Data nascimento;

    public Pessoa(String nome, String telefone, Data nascimento){
        nome = this.nome;
        telefone = this.telefone;
        nascimento = this.nascimento;
    }

    public Pessoa(String nome, Data nascimento){
        nome = this.nome;
        nascimento = this.nascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setData(Data nascimento){
        this.nascimento = nascimento;
    }
    
    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public Data getData(){
        return nascimento;
    }

    public String toString(){
        String temp;
        temp = "Nome:"+nome+"\nTelefone:"+"\nNascimento"+nascimento;
        return temp;
    }
    
}
