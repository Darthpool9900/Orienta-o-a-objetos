public class Principal {
    public static void main(String[] args){
        Livro information[] = new Livro[3];
        information[0].avaliar();
        information[0] = new LivroBiblioteca("Eu","PokemonVol1",2017,7,true,true);
        information[1].avaliar();
        information[1] = new LivroDeLivraria("Eu","Pokemon",8,1919,true,2.99);
    }
}
