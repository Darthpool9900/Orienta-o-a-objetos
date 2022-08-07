package Atividade_2;

public class ContaCorrente {
    private String nome;
    private int numero;
    private short agencia;
    private double saldo;
    private double limite;
    
    public  ContaCorrente(String nome,int numero,short agencia,double saldo,double limite){
        this.nome=nome;
        this.numero=numero;
        this.agencia=agencia;
        this.saldo=saldo;
        this.limite=limite;
    }

    public ContaCorrente(String nome,int numero,short agencia,double saldo){
        this.nome=nome;
        this.numero=numero;
        this.agencia=agencia;
        this.saldo=saldo;
    }

    public ContaCorrente(String nome,int numero,short agencia){
        this.nome=nome;
        this.numero=numero;
        this.agencia=agencia;
    }

    public void setAgencia(short agencia){
        if(agencia<0){
            System.out.println("Valor inválido");
        }else{
            this.agencia=agencia;
        }
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public short getAgencia(){
        return agencia;
    }

    public void setsaldo(double val){
        if(saldo<0){
            System.out.println("Valor inválido");
        }else{
            saldo=val;
        }
    }

    public void setLimite(double val_lim){
        if(limite<0){
            System.out.println("Valor inválido");
        }else{
            limite=val_lim;
        }
    }

    public void setNumero(double val_Num){
        if(saldo<0){
            System.out.println("Valor inválido");
        }else{
            limite=val_Num;
        }
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void Atualizar(double saldo,double limite){
        if(saldo>0&&limite>0){
            this.saldo=saldo;
            this.limite=limite;
        }else{
            System.out.println("Inválido");
        }
    }

    public void Atualizar(String nome,int numero,short agencia){
        if(saldo>0&&limite>0){
            this.nome=nome;
            this.numero=numero;
            this.agencia=agencia;
        }else{
            System.out.println("Inválido");
        }
    }

    public void depositar(double conta){
        saldo = saldo+conta;

    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Nuemro: "+numero);
        System.out.println("Agência: "+agencia);
        System.out.println("Saldo: "+saldo);


    }
}
