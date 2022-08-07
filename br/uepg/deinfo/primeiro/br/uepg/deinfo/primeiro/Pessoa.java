package br.uepg.deinfo.primeiro;

public class Pessoa{
    protected double salario;
    private int codigo;
    private String nome;

    protected Pessoa(double salario, int codigo, String nome){
        this.salario = salario;
        this.codigo = codigo;
        this.nome = nome;
    }

    protected int getCodigo(){
        return codigo;
    }

    protected String getNome(){
        return nome;
    }
}