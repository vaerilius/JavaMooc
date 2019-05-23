
public class Ohjelma {

    public static void main(String[] args) {
int[][] matriisi = {
    {3, 2, 7, 6},
    {2, 4, 1, 0},
    {3, 2, 1, 0}
};

System.out.println(taulukkoMerkkijonona(matriisi));
    }

    public static String taulukkoMerkkijonona(int[][] taulukko) {

        StringBuilder merkkijonoEsitys = new StringBuilder();
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {

                merkkijonoEsitys.append(taulukko[i][j]);
            }

            merkkijonoEsitys.append("\n");
        }

        return merkkijonoEsitys.toString();
    }

}
