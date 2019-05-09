package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private Scanner scanner;
  
    private HashMap<String, ArrayList<Information>> contacts;
    private String name;
    private String adress;
    private int number;

    public App(Scanner scanner) {
        this.scanner = scanner;

        
        this.contacts = new HashMap<String, ArrayList<Information>>();
    }

    void startApp() {

        System.out.println("Contact information");

        while (true) {
            System.out.print("Komento: ");
            String komento = scanner.nextLine();

            if (komento.isEmpty()) {
                break;
            } else if (komento.equals("get")) {
                getName();
            } else if (komento.equals("num")) {
                setNumbner();
            } else if (komento.equals("ad")) {
                setAdress();
            }
        }
    }

    public void setNumbner() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Number: ");
        String number = scanner.nextLine();
        String name1 = name.toLowerCase();

     //   contacts.put(name1, new );

    }

    public void getName() {
        System.out.print("name: ");

        String name = scanner.nextLine();

        /*        Information getname = contacts.get(name);
        
        if (getname == null) {
        System.out.println("test");
        } else {
        getname.getNumber();
        }*/
        
        if (!contacts.containsKey(name)) {
            System.out.println("ei ole");
        } else {
            for (Information yht : contacts.get(name)) {
                yht.getNumber();
                
            }
        }
    }

    private void setAdress() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Adress: ");
        String adress = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        String name1 = name.toLowerCase();
        ArrayList list = new ArrayList();
        list.add(new Adress(city, adress));

        contacts.put(name1, list);

      

    }

}
