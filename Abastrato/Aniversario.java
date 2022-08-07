public class Aniversario extends Cartao{
    private String mensagem  = "Feliz natal";

    public Aniversario(String Remetente,String Destinatario, Data Reg, String mensagem){
        super(Remetente, Destinatario,Reg);
        this.mensagem = mensagem;
    }

    public String getmensagem(){
        Mensagem();
        return mensagem;
        
    }

    public void setmensagem(String mensagem){
        this.mensagem =mensagem;
    }

    public void Mensagem(){
        System.out.println("Remetente:"+getRemetente());
        System.out.println("Destinatario:"+getDestinatario());
        System.out.println("Data:"+getReg());
        System.out.println("Mensagem:"+mensagem);
    }

    
}
