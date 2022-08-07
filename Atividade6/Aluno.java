package Atividade6;

public class Aluno extends Pessoa {
    String RA;

    public Aluno(String nome, String telefone, Data nascimento, String RA){
        super(nome, telefone, nascimento);
        this.RA = RA;
    }

    public String getRA(){
        return RA;
    }

    public void setRA(String RA){
        this.RA = RA;
    }

    public String toString() {
        String temp;
        temp = super.toString()+"\nRA:";
        return temp;
    }
}
