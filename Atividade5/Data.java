package Atividade5;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia,int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia,int mes){
        this.dia = dia;
        this.mes = mes;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }


    public int getdia(){
            return dia;
    }

    public int getmes(){
            return mes;
    }
    public int getano(){
            return dia;
    }

    public String toString(){
        String temp = dia+"/ "+mes+"/"+ano;
        return temp;
    }
}

