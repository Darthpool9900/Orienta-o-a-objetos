public class LivroBiblioteca  extends Livro implements ItemBiblioteca{
    private boolean emprestado;
    private boolean verificar_estado;

    public LivroBiblioteca(String nome_autor, String nome_livro, int ano, int avaliacao,boolean verificar_estado, String verificar){
        super(nome_autor, nome_livro, ano,avaliacao,verificar);
        this.verificar_estado = verificar_estado;
    }

    public void Emprestar_item() throws MinhaExcecao{
        if (emprestado == true){
            throw new MinhaExcecao("Livro emprestado");
        }else{
            emprestado = true;
        }
    }

    public void Devolver_item() throws MinhaExcecao{
        if(emprestado==false){
            throw new MinhaExcecao("Livro não está emprestado");
        }else{
        System.out.println("Devolvido");
        emprestado = false;
        }
    }

    public void Verificar_item(){
        if (emprestado == true){
            System.out.println("Emprestado");
        }else{
            System.out.println("Não está emprestado");
        }
    }

    public boolean getVerificar(){
        if(verificar_estado==true){
            return verificar_estado;
        }else{
            return verificar_estado;
        }
    }

    public String toString(){
        if(verificar_estado==true){
            String temp = super.toString() +"\nEmprestado";
            return temp;
        }else{
            String temp = super.toString() +"\nNão éEmprestado";
            return temp;
        }
    }
}