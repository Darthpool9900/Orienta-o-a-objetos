package Atividade_4;
import java.util.Arrays;

public class Calculo {

    public static void soma(int num[]){
        int soma = num[0];
        for(int i=1; i<num.length;i++){
            soma = soma + num[i];
            System.out.println("Soma é: "+soma);
        }
    }

    public static void media(int num[]){
        int media;
        for(int i=1; i<num.length;i++){
            media = num[0];
            media  = (media + num[i])/num.length;
        }
        
    }
    

    public static void imprimar(int num[]){
        for(int i=1; i<num.length;i++){
            System.out.println("vetor["+i+"]="+num[i]);
        }
    }

    public static void sort(int[] num){
        Arrays.sort(num);
    }

    public static void bynary(int num[]){
        int key;
        key = num.length;
        Arrays.binarySearch(num,key);
        System.out.println("Valor:"+num[key]);
    }
}
