package abstractfactory.app;

public class FabricaLivro implements IFabricaAbstrata {
    @Override
    public IObra criarObra() {
        return new ObraLivro();
    }

    @Override
    public IEncontro criarEncontro() {
        return new EncontroLivro();
    }
    
}
