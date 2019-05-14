
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<Kirja>();

        while (true) {

            System.out.println("Syötä kirjan nimi, tyhjä lopettaa:");
            String kirjanNimi = lukija.nextLine();
            if (kirjanNimi.isEmpty()) {
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä:");
            int minIka = Integer.valueOf(lukija.nextLine());

            kirjat.add(new Kirja(kirjanNimi, minIka));
        }
        
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja::getMinIka)
                .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirjat, vertailija);
        
        System.out.println("Yhteensä " + kirjat.size() + " kirjaa.");
        System.out.println("Kirjat:");
        kirjat.stream()
                .forEach(kirja -> System.out.println(kirja));
    }

}
