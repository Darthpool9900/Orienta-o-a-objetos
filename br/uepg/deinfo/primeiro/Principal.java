import br.uepg.deinfo.primeiro.*;

public class Principal {
    public static void main(String[] args){
        Vetor about[] = new Vetor[3];
        for(int i=0; i<about.length; i++){
            about[i] = new Vetor();
            about[i].inlcuir();
            about[i].Imprimir();
        }
    }
}
    
