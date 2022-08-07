package Atividade5;
public class Principal {
    
    public static void main(String[] args){
        Produto vetor[];
        Data validade;
        validade = new Data(21,04,2013);
        vetor = new Produto[5];////////////////
         vetor[0] = new Produto("Pokebola",200,2);
         vetor[1] = new Produto("Ultrabola",300,3);
         vetor[2] = new Produto("MasterBall",500,1);
         vetor[0].Compra(3);
         vetor[0].Venda(3);

         System.out.println(validade);
    }
}
