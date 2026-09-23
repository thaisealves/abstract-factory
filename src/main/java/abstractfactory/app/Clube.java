package abstractfactory.app;

public class Clube {

    private IObra obra;
    private IEncontro encontro;

    public Clube(IFabricaAbstrata fabrica) {
        this.obra = fabrica.criarObra();
        this.encontro = fabrica.criarEncontro();
    }

    public String escolherObra() {
        return this.obra.escolherObra();
    }

    public String escolherEncontro() {
        return this.encontro.escolherEncontro();
    }
}
