
package maatila;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;


public class Maatila implements Eleleva{
    private String omistaja;
    private Navetta navetta;
    private Collection<Lehma> lehmat;
    

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList();
    }
    public void lisaaLehma(Lehma lehma) {
        lehmat.add(lehma);
    }

    @Override
    public void eleleTunti() {

        lehmat.stream().forEach(lehma -> lehma.eleleTunti());
    }

    @Override
    public String toString() {
        String output = "Maatilan omistaja: " + omistaja + "\n" + navetta.toString() + "\n";
        if (lehmat.isEmpty()) {
            output += "Ei lehmiä.\n";
        } else {
            output += "lehmät:\n" ;
            for (Lehma lehma : lehmat) {
                output += "\t" + lehma.toString() + "\n" ;
            }
        }
        
        
        
        return output ;
    }

    public String getOmistaja() {
        return omistaja;
    }

   public void asennaNavettaanLypsyrobotti(Lypsyrobotti robo) {
       this.navetta.asennaLypsyrobotti(robo);
    }

    public void hoidaLehmat() {
        for (Lehma lehma : lehmat) {
            this.navetta.hoida(lehma);
        }
        
    }
    
    
}
