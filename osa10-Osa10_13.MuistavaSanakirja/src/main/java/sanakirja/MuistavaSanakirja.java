package sanakirja;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MuistavaSanakirja {

    private HashMap<String, String> sanakirja;
    private String tiedostonNimi;
    private PrintWriter kirjoittaja;

    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this.sanakirja = new HashMap<>();
        this.tiedostonNimi = tiedosto;

    }

    public boolean lataa() {

        try (Scanner tiedostonLukija = new Scanner(new File(this.tiedostonNimi))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");   // pilkotaan rivi :-merkkien kohdalta
                lisaa(osat[0], osat[1]);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;

        }
        return true;
    }

    public boolean tallenna() {
        try {
            ArrayList<String> kaannokset = new ArrayList<>();
           
            for (Map.Entry<String, String> entry : sanakirja.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                kaannokset.add(key + ":" + value + "\n");
            }
            Iterator<String> ite = kaannokset.iterator();
             this.kirjoittaja = new PrintWriter(tiedostonNimi);
            for (Iterator<String> iterator = kaannokset.iterator(); iterator.hasNext();) {
                String next = iterator.next();
                    kirjoittaja.write(next);
            }
            

            kirjoittaja.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public void lisaa(String sana, String kaannos) {
        this.sanakirja.putIfAbsent(sana, kaannos);
    }

    public String kaanna(String sana) {

        for (Map.Entry<String, String> entry : sanakirja.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(sana)) {
                return value;
            } else if (value.equals(sana)) {
                return key;
            }
        }

        return null;
    }

    public void poista(String sana) {

        this.sanakirja.remove(sana, kaanna(sana));
        this.sanakirja.remove(kaanna(sana), sana);
    }

}
