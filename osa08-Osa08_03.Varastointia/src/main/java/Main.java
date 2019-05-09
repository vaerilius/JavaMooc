
public class Main {

    public static void main(String[] args) {
// tuttuun tapaan:
        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 1000.0);
        mehu.otaVarastosta(11.3);
        mehu.lisaaVarastoon(1.0);
//System.out.println(mehu.historia()); // [1000.0, 988.7, 989.7]

        mehu.tulostaAnalyysi();
    }

}
