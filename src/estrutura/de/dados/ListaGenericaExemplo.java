package estrutura.de.dados;

import java.util.ArrayList;

public class ListaGenericaExemplo<T> {
    private int cardinalidade;
    private ArrayList<T> list;

    public ListaGenericaExemplo(int max) {
        this.cardinalidade = 0;
        this.list = new ArrayList<T>(max);
    }

    public int getCardinalidade() {
        return cardinalidade;
    }

    public void insertEnd(T element){
        list.add(element);
        cardinalidade++;
    }


    @Override
    public String toString() {
        return "ListaGenericaExemplo{" +
                "cardinalidade=" + cardinalidade +
                ", list=" + list +
                '}';
    }
}
