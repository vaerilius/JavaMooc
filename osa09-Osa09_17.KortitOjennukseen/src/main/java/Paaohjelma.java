
import java.util.ArrayList;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
Kasi kasi = new Kasi();
kasi.lisaa( new Kortti(14,Maa.PATA) ); 
kasi.lisaa( new Kortti(12,Maa.HERTTA) ); 
kasi.lisaa( new Kortti(14,Maa.RUUTU) ); 
kasi.lisaa( new Kortti(2,Maa.PATA) ); 
kasi.lisaa( new Kortti(7,Maa.RUUTU) ); 
kasi.jarjestaMaittain();
kasi.tulosta();
    }
}
