package generics;

import java.util.List;

public class Caixa<T> {

    private List<T> itens;

    public Caixa(List<T> itens) {
        this.itens = itens;
    }

    public List<T> getItens() {
        return itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }

    public void exibirCoringas() {
        System.out.println();
    }
}

/*NOTA:
*
* Os tipos genéricos possuiem formas de limitação com extends(nível inferior) e super(nível superior)
*
* além disso, contamos com parametros: T, E, K, V, N...
*
* tornando os parametros genericos: ?
* */
