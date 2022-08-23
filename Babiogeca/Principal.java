public class Principal {
    public static void main(String[] args) throws MinhaExcecao{
        Livro information[] = new Livro[2];
        
        information[0] = new LivroBiblioteca("Eu","PokemonVol1",2017,0,false,"Biblioteca");
        information[0].avaliar();
        ((LivroBiblioteca) information[0]).Emprestar_item();
        System.out.println("---------------------");
        System.out.println(information[0]);
        System.out.println("---------------------");
        information[1] = new LivroDeLivraria("Eu","PokemonVol-2",2027,0,2000,"Livraria",true);
        ((Livro)information[1]).avaliar();
        ((LivroDeLivraria) information[1]).imprimir();
        System.out.println("---------------------");
        System.out.println(information[1]);
        
        
    }
}
