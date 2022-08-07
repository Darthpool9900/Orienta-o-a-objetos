public class Namorados extends Cartao {
    private String mensagem;

    public Namorados(String Remetente,String Destinatario, Data Reg, String mensagem){
        super(Remetente, Destinatario,Reg);
        this.mensagem = mensagem;
    }

    public String getmensagem(){
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
