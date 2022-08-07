package Atividade_1;
import java.util.Scanner;

public class Principal{
    
    public static void main(String[] args){
        ContaCorrente conta;
        conta=new ContaCorrente("Rafael",10,(short)20,2000,500);

        conta.imprimir();
        

        conta.Atualizar(200,300);

        conta.imprimir();
    }

    
}
