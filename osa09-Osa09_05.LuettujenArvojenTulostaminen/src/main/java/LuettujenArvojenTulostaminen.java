
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList();
        
        while (true) { 
            String arvo = lukija.nextLine();
            if (arvo.equals("")) {
                break;
            }
            lista.add(arvo);
        }
        lista.stream()
                .forEach(arvo -> System.out.println(arvo));

    }

}
