public abstract class Cartao{
    private String Remetente, Destinatario;
    private Data Reg;

    public Cartao(String Remetente, String Destinatario,Data Reg) {
        this.Reg=Reg;
        this.Remetente = Remetente;
        this.Destinatario = Destinatario;
    }

    public String getRemetente() {
        return Remetente;
    }

    public void setRemetente(String Remetente) {
        this.Remetente = Remetente;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public Data getReg() {
        return Reg;
    }

    public void setReg(Data Reg) {
        this.Reg=Reg;
    }
}