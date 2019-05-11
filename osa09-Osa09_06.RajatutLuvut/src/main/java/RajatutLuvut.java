
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Collection<Integer> lista = new ArrayList<>();
        while (true) {
            int luku = lukija.nextInt();
            if (luku < 0) {
                break;
            }
            lista.add(luku);
        }

        lista.stream()
                .filter(value -> value < 6 && value > 0)
                .forEach((t) -> {
                    System.out.println(t);
                });
    }
}
