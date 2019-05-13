
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App implements Comparable<Tulostus>{
   

   public void start() {
    
        ArrayList<Tulostus> rivit = lueTiedot("lukutaito.csv");

        rivit.sort((o1, o2) -> {
            return 0; 
        });
              rivit.stream()
                .sorted()
                .forEach(rivi -> System.out.println(rivi));
       
             
    }
       public ArrayList<Tulostus> lueTiedot(String tiedosto) {
        ArrayList<Tulostus> rivit = new ArrayList<>();
        try {
            Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .filter(palat -> palat.length >= 5)
                    .map(palat -> new Tulostus(palat[3], Integer.valueOf(palat[4]), palat[2], Double.valueOf(palat[5])))
                    .forEach(rivi -> rivit.add(rivi));

        } catch (Exception e) {
            System.out.println("Virhe " + e.getMessage());
        }

        return rivit;
    }

    @Override
    public int compareTo(Tulostus o) {
         return compareTo(o);
    }







}
