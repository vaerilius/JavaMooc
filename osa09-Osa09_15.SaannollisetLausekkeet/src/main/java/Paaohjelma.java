
import java.util.Scanner;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja  
        Tarkistin tarkistin = new Tarkistin();
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna merkkijono: ");
       // tarkistin.onViikonpaiva(lukija.nextLine());
     //   tarkistin.kaikkiVokaaleja(lukija.nextLine());
     tarkistin.kellonaika(lukija.nextLine());
    }
}
