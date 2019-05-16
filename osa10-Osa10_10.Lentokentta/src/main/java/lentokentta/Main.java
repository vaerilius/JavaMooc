package lentokentta;

import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;
import lentokentta.ui.Tekstikayttoliittyma;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Scanner lukija = new Scanner(System.in);
        Lentohallinta lentohallinta = new Lentohallinta();
        Tekstikayttoliittyma tkl = new Tekstikayttoliittyma(lentohallinta, lukija);
        tkl.kaynnista();
    }
}
