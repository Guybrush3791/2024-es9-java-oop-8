import java.util.ArrayList;
import java.util.Arrays;
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
     * un booleano se l'eliminazione ha prodotto modifiche
     * - rimuovere l'ultimo elemento e ritornare
     * un boolean se l'eliminazione ha prodotto modifiche
     * - ottenere la potenza massima di tutto il parco auto
     * - ottenere l'auto con la potenza massima di tutto il
     * parco auto
     * - definire un toString sensato
     */

    private List<Auto> autos;

    public AutoManagerList() {

        autos = new ArrayList<>();
    }

    public void add(Auto auto) {

        autos.add(auto);
    }

    public void add(List<Auto> autoList) {

        autos.addAll(autoList);
    }

    public void add(Auto[] autoArray) {

        // autos.addAll(Arrays.asList(autoArray));

        for (Auto auto : autoArray) {

            autos.add(auto);
        }
    }

    public void clear() {

        autos.clear();
    }

    public boolean isEmpty() {

        return autos.size() < 1;
    }

    public boolean remove(int index) {

        if (index < 0 || index >= autos.size())
            return false;

        autos.remove(index);

        return true;
    }

    public boolean remove() {

        if (autos.isEmpty())
            return false;

        autos.remove(autos.size() - 1);

        return true;
    }

    public int getMaxPower() {

        return getMaxAuto().getPotenza();
    }

    public Auto getMaxAuto() {

        Auto maxAuto = null;
        int maxPower = 0;

        for (Auto auto : autos) {

            if (auto.getPotenza() > maxPower) {

                maxPower = auto.getPotenza();
                maxAuto = auto;
            }
        }

        return maxAuto;
    }

    @Override
    public String toString() {

        int index = 1;
        String autoListStr = "";
        for (Auto auto : autos) {

            autoListStr += "[" + (index++) + "] " + auto + "\n";
        }

        return "Auto Manager List: " + autos.size() + " \n" + autoListStr;
    }
}
