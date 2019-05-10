
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
<<<<<<< HEAD
        List<String> list = new ArrayList<>();
=======
        // toteuta ohjelmasi tänne
        System.out.println("hei hou");
>>>>>>> 532a621f5e25903e0a14c6d455241a5f7b8176d4

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
