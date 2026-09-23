package abstractfactory.app;

public class FabricaSerie implements IFabricaAbstrata {
    @Override
    public IObra criarObra() {
        return new ObraSerie();
    }

    @Override
    public IEncontro criarEncontro() {
        return new EncontroSerie();
    }

}