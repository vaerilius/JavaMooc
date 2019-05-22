

import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
Lista<String> lista = new Lista<>();
System.out.println(lista.contains("hei"));
lista.add("hei");
System.out.println(lista.contains("hei"));
int indeksi = lista.indexOfValue("hei");
        System.out.println(indeksi);
        System.out.println(lista.value(indeksi));
lista.remove("hei");
System.out.println(lista.contains("hei"));
    }

}
