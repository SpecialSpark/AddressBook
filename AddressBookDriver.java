//package addressBook;

import java.util.List;
import java.util.Scanner;
//import model.AddressBook;
//import model.Contact;


public class AddressBookDriver {
    private static AddressBook addressBook;
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        boolean runProgram = true;

        addressBook  = AddressBook.getInstance();
        List<Contact> contactList = addressBook.getContactList();

        System.out.println("end - close the program");
        System.out.println("create - construct a contact");
        System.out.println("view - look at the contact");
        System.out.println("remove - delete a contact");

        do {

            contactList = addressBook.getContactList();

            String userInput = user.nextLine();

            if(userInput.equals("end")){
                runProgram = false;
            }

            switch(userInput){
                case "create": /* Create Contact */;
                break;

                case "view": /* View List of Contacts */;
                break;

                case "remove": /* Remove Contact */;
                break;

                default : System.out.println("end - close the program");
                    System.out.println("create - construct a contact");
                    System.out.println("view - look at the contact");
                    System.out.println("remove - delete a contact");;
                break;
            }

        } while (runProgram);

        user.close();
    }

    public static void createContact(){

        System.out.println("give a name");
    }

    public String viewContact(List<Contact> contactList){
        String listOContacts = "";
        for(int i = 0; contactList.size() < 0; i += 1){
            listOContacts += contactList.get(i).getName().getFirstName();
            listOContacts += contactList.get(i).getName().getLastName();
        }
        return listOContacts;
    }
}
