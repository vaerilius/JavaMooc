
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
                break;
            }
            list.add(syote);
        }

        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String vastaus = lukija.nextLine();

        if (vastaus.equals("n")) {
            double nega = list.stream()
                    .mapToInt(luku -> Integer.valueOf(luku))
                    .filter(filt -> filt < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Negatiivisten lukujen keskiarvo: " + nega);
        } else {
            double pos = list.stream()
                    .mapToInt(luku -> Integer.valueOf(luku))
                    .filter(filt -> filt > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Positiivisten lukujen keskiarvo: " + pos);
        }

    }
}
