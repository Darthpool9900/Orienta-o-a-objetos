
public class Funcionario {
    private String registro;
    private double salario;

    public Funcionario(String nome,String telefone, Data nascimento, String registro, double salario) {
        super(nome,telefone,nascimento);
        registro = this.registro;
        salario = this.salario;
    }

    public Funcionario(String nome, Data nascimento, String registro, double salario){
        super(nome,nascimento);
        this.registro = registro;
        this.salario = salario;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getRegistro() {
        return registro;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        String temp;
        temp = super.toString() + "\nRegistro"+registro+"\nSalario"+salario;
        return temp;
    }
}
