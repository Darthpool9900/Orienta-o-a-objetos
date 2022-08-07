public class Principal {
    
    
    public static void main(String[] args){
        Cartao carta[];
        Data data = new Data(01,12,21);
        carta = new Cartao[3];
        carta[0] = new Natal("Rafael","Mim mesmo",data,"Feliz natal");
        System.out.println(carta[0]);
        carta[1] = new Aniversario("Rafael","Mim mesmo",data,"Feliz aniversário");
        carta[2] = new Namorados("Rafael","Mim mesmo",data,"Feliz Dia dos namorados");
    }
}
