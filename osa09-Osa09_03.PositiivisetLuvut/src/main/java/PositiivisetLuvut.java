
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        /*
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(-2);
        list.add(3);
        list.add(-3);
        positiiviset(list);
        System.out.println(positiiviset(list));*/

    }

    public static List<Integer> positiiviset(List<Integer> luvut) {
        List<Integer> list = luvut.stream()
                .filter(luku -> luku > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return list;
    }

}
