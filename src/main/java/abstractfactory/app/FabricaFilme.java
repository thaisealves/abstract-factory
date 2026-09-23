package abstractfactory.app;

public class FabricaFilme implements IFabricaAbstrata {
    @Override
    public IObra criarObra() {
        return new ObraFilme();
    }

    @Override
    public IEncontro criarEncontro() {
        return new EncontroFilme();
    }
}