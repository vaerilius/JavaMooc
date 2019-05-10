
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKeskiarvo {

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
        double average = list.stream()
                .mapToInt(luku -> Integer.valueOf(luku))
                .average()
                .getAsDouble();
        System.out.println("Lukujen keskiarvo: " + average);
    }
}
