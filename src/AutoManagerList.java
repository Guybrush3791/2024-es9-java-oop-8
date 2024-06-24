import java.util.ArrayList;
import java.util.List;

public class AutoManagerList {

    /**
     * TODO:
     * 
     * Completare la classe facendo in modo che la logica
     * della classe ruoti attorno ad un ArrayList di Auto
     * invece che un array come nell'esercizio precedente.
     * 
     * Dare la possibilita' all'utilizzatore di effettuare
     * le seguenti operazioni:
     * - aggiungere un elemento che puo' essere di tipo
     * Auto o Camion
     * - aggiungere una lista di elementi
     * - aggiungere un'array di elementi
     * - svuotare la lista
     * - determinare se la lista e' vuota
     * - rimuovere un elemento a partire dall'indice e ritornare
     * un boolean se l'eleiminazione ha prodotto modifiche
     * - rimuovere l'ultimo elemento e ritornare
     * un boolean se l'eleiminazione ha prodotto modifiche
     * - ottenere la potenza massima di tutto il parco auto
     * - ottenere l'auto con la potenza massima di tutto il
     * parco auto
     * - definire un toString sensato
     */

    private List<Auto> autos;

    public AutoManagerList() {

        autos = new ArrayList<>();
    }
}
