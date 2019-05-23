
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
ArrayList<String> lista = new ArrayList<>();
Mappi<String, String> taulu = new Mappi<>();

for (int i = 0; i < 1000000; i++) {
    lista.add("" + i);
    taulu.add("" + i, "" + i);
}

ArrayList<String> haettavat = new ArrayList<>();
Random arpoja = new Random();
for (int i = 0; i < 1000; i++) {
    haettavat.add("" + arpoja.nextInt(2000000));
}

long listanHakuAloitus = System.nanoTime();
for (int i = 0; i < haettavat.size(); i++) {
    lista.contains(haettavat.get(i));
}
long listanHakuLopetus = System.nanoTime();

long hajautustaulunHakuAloitus = System.nanoTime();
for (int i = 0; i < haettavat.size(); i++) {
    taulu.find(haettavat.get(i));
}
long hajautustaulunHakuLopetus = System.nanoTime();


long listanHaku = listanHakuLopetus - listanHakuAloitus;
System.out.println("Lista: haku kesti noin " + listanHaku / 1000000 + " millisekuntia (" +
    listanHaku + " nanosekuntia.)");

long hajautustaulunHaku = hajautustaulunHakuLopetus - hajautustaulunHakuAloitus;
System.out.println("Hajautustaulu: haku kesti noin " + hajautustaulunHaku / 1000000 +
    " millisekuntia (" + hajautustaulunHaku + " nanosekuntia.)");
 
   
  
    }

}
