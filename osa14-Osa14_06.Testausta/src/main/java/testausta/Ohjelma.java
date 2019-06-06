package testausta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ohjelma {


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        //suorita(lukija);
       System.out.println(Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")));
    }

    public static String suorita(Scanner lukija) {
        int pulloja = 0;
        int oppilaita = 0;
        double ka = 0;

        while (true) {
            int maara = Integer.parseInt(lukija.nextLine());

            if (maara == -1) {
                break;
            }
            if (maara < 0) {
                continue;
            }
            pulloja += maara;
            oppilaita++;

        }

        ka = (double) pulloja / oppilaita;
        String output = "Pulloja: " + pulloja + "\n"
                + "Oppilaita: " + oppilaita + "\n"
                + "Keskiarvo: " + ka;

        if (pulloja == 0) {
                    output = "Pulloja: " + pulloja + "\n"
                + "Oppilaita: " + oppilaita + "\n"
                + "Keskiarvoa ei voida laskea";
        }

        return output;
    }
}
