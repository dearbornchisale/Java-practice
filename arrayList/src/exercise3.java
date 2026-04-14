import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class exercise3 {
    public static ArrayList<Contact> addContacts() {
        Scanner input = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        System.out.println("Enter contact type 'stop' for name to finish");

        boolean option = true;

        while (option) {
            System.out.print("Enter name: ");
            String userName = input.nextLine();

            if (userName.equalsIgnoreCase("stop")) {
                option = false;
                break;
            }

            System.out.print("Enter your phone number: ");
            String userNumber = input.nextLine();

            System.out.print("Enter your email address: ");
            String userEmail = input.nextLine();

            Contact c = new Contact(userName, userNumber, userEmail);

            contacts.add(c);

        }

        return contacts;

    }

    public static void displayAllContacts(ArrayList<Contact> contacts) {
        System.out.println("All contacts");
        System.out.printf("%-20s %-15s %-20s\n", "Name", "Phone", "Email");
        System.out.println("------------------------------------------------------------------");

        for (Contact c : contacts) {
            System.out.printf("%-20s %-15s %-20s\n",
                    c.name,
                    c.email,
                    c.phoneNumber);
        }
    }

    public static Contact searchByName(ArrayList<Contact> contacts, String name) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public static ArrayList<Contact> searchByPhonePattern(ArrayList<Contact> contacts, String pattern) {
        ArrayList<Contact> phonePattern = new ArrayList<>();

        for (Contact c : contacts) {
            if (c.getPhoneNumber().contains(pattern)) {
                phonePattern.add(c);
            }
        }
        return phonePattern;
    }

    public static boolean updatedContact(ArrayList<Contact> contacts, String nameUpdate, String newPhone,
            String newEmail) {
        for (Contact c : contacts) {
            if (c.getName().contains(nameUpdate)) {
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                return true;
            }
        }

        if (true) {
            System.out.print("Contact updated!");
        }

        return false;
    }

    public static void deleteContact(ArrayList<Contact> contacts, String name) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.remove(i);
                System.out.print("Contact deleted successfully !!");
                return;
            }
        }

        System.out.print("Contact not found :(");
    }

    public static void sortContactsByName(ArrayList<Contact> contacts) {
        Collections.sort(contacts, Comparator.comparing(Contact::getName));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Contact> contacts = addContacts();
        displayAllContacts(contacts);

        System.out.print("Search name: ");
        String name = input.next();

        Contact search = searchByName(contacts, name);
        System.out.println("Found: " + search);

        System.out.print("Enter phoen pattern: ");
        String pattern = input.nextLine();

        ArrayList<Contact> searchPattern = searchByPhonePattern(contacts, pattern);
        displayAllContacts(searchPattern);

        System.out.print("Enter name to update: ");
        String nameUpdate = input.nextLine();

        System.out.print("New phone: ");
        String newPhone = input.nextLine();

        System.out.print("New email: ");
        String newEmail = input.nextLine();

        updatedContact(contacts, nameUpdate, newPhone, newEmail);

        System.out.print("Enter name to delete:  ");
        String nameDeleted = input.nextLine();

        deleteContact(contacts, nameDeleted);

        sortContactsByName(contacts);
        displayAllContacts(contacts);

    }
}
