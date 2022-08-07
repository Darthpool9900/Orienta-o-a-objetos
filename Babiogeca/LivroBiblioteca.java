public class LivroBiblioteca  extends Livro implements ItemBiblioteca{
    private boolean emprestado;
    private boolean verificar_estado;

    public LivroBiblioteca(String nome_autor, String nome_livro, int ano, int avaliacao,boolean emprestado,boolean verificar){
        super(nome_autor, nome_livro, ano,avaliacao,verificar);
        this.emprestado = emprestado;
    }

    public void Emprestar_item(){
        if (emprestado == false){
            System.out.println("Emprestado");
        }else{
            System.out.println("Não está emprestado");
        }
    }

    public void Devolver_item(){
        System.out.println("Devolvido");
        emprestado = false;
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
}