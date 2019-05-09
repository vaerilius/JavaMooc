package person;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    //fix this
    private ArrayList<Person> contacts;

    private Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
        this.contacts = new ArrayList<>();
    }

    public void startApp() {
        System.out.println("Welcome");
        System.out.println("This program manage at contact information");
        System.out.println("You can use those commands: add, get, all");
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.isEmpty()) {
                break;
            } else if (command.equals("add")) {
                addPerson();
            } else if (command.equals("get")) {
                getPerson();
            } else if (command.equals("all")) {
                getAllObject();
            }
        }

        System.out.println("Thank you for nothing");

    }

    public void addPerson() {

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.println("Birthday? \n "
                + "pleace enter day");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Mouth: ");
        int mouth = Integer.parseInt(scanner.nextLine());
        System.out.println("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        LocalDateTime now = LocalDateTime.now();

        if (day > 0 && day < 32 && mouth > 0 && mouth < 13 && year > 0 && year < now.getYear()) {
            Person person = new Person(name, city, new Birthday(day, mouth, year));
            contacts.add(person);
            return;
        }
        System.out.println("Not valid values");

    }

    public void getPerson() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        if (contacts.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        for (Person contact : contacts) {
            if (!contact.getName().equals(name)) {
                System.out.println("who?");
            }

            contact.getPerson();
        }

    }

    public void getAllObject() {

        if (contacts.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("List");
        for (Person contact : contacts) {
            System.out.print("");
            contact.getPerson();
        }

    }

}
