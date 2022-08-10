public class Aluno{
    private String nome;
    private double nota;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public String toString(){
        String temp;
        temp = "\nNome: " + nome+"\nNota: " + nota;
        return temp;
    }
}