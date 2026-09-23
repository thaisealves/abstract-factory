package abstractfactory.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClubeTest {
    @Test
    void deveEscolherObraLivro() {
        IFabricaAbstrata fabrica = new FabricaLivro();
        Clube clube = new Clube(fabrica);
        assertEquals("Escolhendo qual livro ler", clube.escolherObra());
    }

    @Test
    void deveEscolherObraFilme() {
        IFabricaAbstrata fabrica = new FabricaFilme();
        Clube clube = new Clube(fabrica);
        assertEquals("Escolhendo qual filme assistir", clube.escolherObra());
    }

    @Test
    void deveEscolherObraSerie() {
        IFabricaAbstrata fabrica = new FabricaSerie();
        Clube clube = new Clube(fabrica);
        assertEquals("Escolhendo qual série assistir", clube.escolherObra());
    }

    @Test
    void deveEscolherEncontroLivro() {
        IFabricaAbstrata fabrica = new FabricaLivro();
        Clube clube = new Clube(fabrica);
        assertEquals("Encontro de Livros: escolhendo dia", clube.escolherEncontro());
    }

    @Test
    void deveEscolherEncontroFilme() {
        IFabricaAbstrata fabrica = new FabricaFilme();
        Clube clube = new Clube(fabrica);
        assertEquals("Encontro de Filmes: escolhendo dia", clube.escolherEncontro());
    }

    @Test
    void deveEscolherEncontroSerie() {
        IFabricaAbstrata fabrica = new FabricaSerie();
        Clube clube = new Clube(fabrica);
        assertEquals("Encontro de Séries: escolhendo dia", clube.escolherEncontro());
    }

}
