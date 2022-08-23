public interface ItemBiblioteca {
    void Emprestar_item() throws MinhaExcecao;
    void Devolver_item() throws MinhaExcecao;
    void Verificar_item();
}
