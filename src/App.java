import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        testListAutoManager();
    }

    public static void testListAutoManager() {

        /**
         * TODO
         * 
         * Testare adeguatamente la classe AutoManagerList
         */

        AutoManagerList autoManager = new AutoManagerList();

        Auto auto1 = new Auto(1000, "Fiat", "Panda", 900, 60);
        Auto auto2 = new Auto(1500, "Fiat", "Punto", 1200, 80);
        Auto auto3 = new Auto(2000, "Fiat", "Bravo", 1400, 100);

        Camion camion1 = new Camion(3000, "Iveco", "Eurocargo", 3000, 200, 10000, true);
        Camion camion2 = new Camion(5000, "Iveco", "Stralis", 5000, 300, 20000, false);
        Camion camion3 = new Camion(7000, "Iveco", "Trakker", 7000, 400, 30000, true);

        autoManager.add(auto1);
        autoManager.add(auto2);
        autoManager.add(auto3);

        autoManager.add(camion1);
        autoManager.add(camion2);
        autoManager.add(camion3);

        System.out.println(autoManager);

        System.out.println("------------------------------------------------------------------------");

        List<Auto> autoList = new ArrayList<>();
        autoList.add(auto1);
        autoList.add(camion1);
        autoList.add(camion2);

        autoManager.add(autoList);

        System.out.println(autoManager);

        System.out.println("------------------------------------------------------------------------");

        // autoManager.clear();
        System.out.println(autoManager);
        System.out.println("Is empty: " + autoManager.isEmpty());

        System.out.println("------------------------------------------------------------------------");

        autoManager.remove();
        System.out.println(autoManager);

        System.out.println("------------------------------------------------------------------------");

        autoManager.remove(2);
        System.out.println(autoManager);

        System.out.println("------------------------------------------------------------------------");

        Auto maxAuto = autoManager.getMaxAuto();
        int maxPower = autoManager.getMaxPower();

        System.out.println("Max auto: " + maxAuto);
        System.out.println("Max power: " + maxPower);

        System.out.println("------------------------------------------------------------------------");
    }

}
