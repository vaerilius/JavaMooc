
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();

        henkilot.add(new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));

        tulostaHenkilot(henkilot);
    }

    public static void tulostaHenkilot(ArrayList<Henkilo> henkilot) {
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);
        }
    }

}
