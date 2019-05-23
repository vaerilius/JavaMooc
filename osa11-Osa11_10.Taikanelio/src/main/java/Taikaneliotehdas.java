
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {
        Taikanelio nelio = new Taikanelio(koko);
   
        while (!nelio.onTaikanelio()) {
            // tee myöhemmin
 
            
        }

        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        return nelio;
    }

}
