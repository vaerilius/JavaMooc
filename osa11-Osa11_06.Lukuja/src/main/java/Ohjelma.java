
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
<<<<<<< HEAD
        Random arpoja = new Random(); // luodaan apuväline arpoja
        System.out.println("Montako satunnaislukua tulostetaan?");
        int montako = lukija.nextInt();
        for (int i = 0; i < montako; i++) {
            // Arvotaan ja tulostetaan satunnainen luku
            int luku = arpoja.nextInt(11);
            System.out.println(luku);

        }
=======
        System.out.println("Pull request");
>>>>>>> 91383cbb9562a38e306a56fbbb14c707d13330ab
    }

}
