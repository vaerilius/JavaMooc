package sovellus;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kayttoliittyma {
    
    private Scanner lukija;
    private TodoDao tietokanta;
    
    public Kayttoliittyma(Scanner lukija, TodoDao tietokanta) {
        this.lukija = lukija;
        this.tietokanta = tietokanta;
    }
    
    public void kaynnista() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Syötä komento:");
            System.out.println("1) listaa");
            System.out.println("2) lisää");
            System.out.println("3) aseta tehdyksi");
            System.out.println("4) poista");
            System.out.println("x) lopeta");
            
            System.out.print("> ");
            String komento = this.lukija.nextLine();
            if (komento.equals("x")) {
                break;
            }
            if (komento.equals("1")) {
                listaa();
            } else if (komento.equals("2")) {
                lisaa();
            } else if (komento.equals("3")) {
                asetaTehdyksi();
            } else if (komento.equals("4")) {
                poista();
            }

            // toteuta toiminnallisuus tänne
        }
        
        System.out.println("Kiitos!");
    }
    
    private void listaa() throws SQLException {
        System.out.println("Listataan tietokannan tiedot");
        List<Todo> todos = tietokanta.listaa();
        for (Todo todo : todos) {
            System.out.println(todo);
        }
        
    }
    
    private void lisaa() throws SQLException {
        System.out.println("Lisätään tehtävää");
        System.out.println("Syötä nimi");
        String nimi = lukija.nextLine();
        System.out.println("Syötä kuvaus");
        String kuvaus = lukija.nextLine();
        
        tietokanta.lisaa(new Todo(nimi, kuvaus, Boolean.FALSE));
        
    }
    
    private void asetaTehdyksi() throws SQLException {
        System.out.println("Mikä asetetaan tehdyksi (syötä id)?");
        int id = Integer.valueOf(lukija.nextLine());
        tietokanta.asetaTehdyksi(id);
    }
    
    private void poista() throws SQLException {
        System.out.println("Mikä poistetaan (syötä id)?");
        int id = Integer.valueOf(lukija.nextLine());
        tietokanta.poista(id);
        
    }
    
}
