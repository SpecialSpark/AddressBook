//package addressBook;

import java.util.List;
import java.util.Scanner;
//import model.AddressBook;
//import model.Contact;


public class AddressBookDriver {
    private static Scanner user = new Scanner(System.in);
    private static String userInput;

    private static AddressBook addressBook;
    public static void main(String[] args){
        boolean runProgram = true;

        addressBook  = AddressBook.getInstance();
        List<Contact> contactList = addressBook.getContactList();

        System.out.println("end - close the program");
        System.out.println("create - construct a contact");
        System.out.println("view - look at the contact");
        System.out.println("remove - delete a contact");

        do {

            contactList = addressBook.getContactList();

            userInput = user.nextLine();

            if(userInput.equals("end")){
                runProgram = false;
            }

            switch(userInput){
                case "create": contactList = createContact(contactList);
                break;

                case "view": /* View List of Contacts */;
                break;

                default : System.out.println("end - close the program");
                    System.out.println("create - construct a contact");
                    System.out.println("view - look at the contact");
                break;
            }

        } while (runProgram);

        user.close();
    }

    public static List<Contact> createContact(List<Contact> contactList){
        Contact contact = new Contact();
        
        System.out.println("give first name");
        userInput = user.nextLine();
        contact.getName().setFirstName(userInput);

        System.out.println("give last name");
        userInput = user.nextLine();
        contact.getName().setLastName(userInput);

        System.out.println("give phone number");
        userInput = user.nextLine();
        contact.setPhoneNumber(userInput);

        System.out.println("give email address");
        userInput = user.nextLine();
        contact.setEmail(userInput);

        contact.getAddresses().add(createMailingAddress());

        System.out.println("Mailing address created");

        contact.getAddresses().add(createHomeAddress());

        System.out.println("Home address created");

        contact.getAddresses().add(createWorkAddress());

        System.out.println("Work address created");

        System.out.println("Contact added");
        contactList.add(contact);

        return contactList;
    }

    public static Address createMailingAddress(){
        Address mailingAddress = new Address();

        System.out.println("give zip of mailing address");
        userInput = user.nextLine();
        mailingAddress.setZipAddress(userInput);

        System.out.println("give street of mailing address");
        userInput = user.nextLine();
        mailingAddress.setStreetAddress(userInput);

        System.out.println("give city of mailing address");
        userInput = user.nextLine();
        mailingAddress.setCityAddress(userInput);

        System.out.println("give state of mailing address");
        userInput = user.nextLine();
        mailingAddress.setStateAddress(userInput);

        return mailingAddress;
    }

    public static Address createHomeAddress(){
        Address homeAddress = new Address();

        System.out.println("give zip of home address");
        userInput = user.nextLine();
        homeAddress.setZipAddress(userInput);

        System.out.println("give street of home address");
        userInput = user.nextLine();
        homeAddress.setStreetAddress(userInput);

        System.out.println("give city of home address");
        userInput = user.nextLine();
        homeAddress.setCityAddress(userInput);

        System.out.println("give state of home address");
        userInput = user.nextLine();
        homeAddress.setStateAddress(userInput);

        return homeAddress;
    }

    public static Address createWorkAddress(){
        Address workAddress = new Address();

        System.out.println("give zip of work address");
        userInput = user.nextLine();
        workAddress.setZipAddress(userInput);

        System.out.println("give street of work address");
        userInput = user.nextLine();
        workAddress.setStreetAddress(userInput);

        System.out.println("give city of work address");
        userInput = user.nextLine();
        workAddress.setCityAddress(userInput);

        System.out.println("give state of work address");
        userInput = user.nextLine();
        workAddress.setStateAddress(userInput);

        return workAddress;
    }

    public String viewContact(List<Contact> contactList){
        String listOContacts = "";

        for(int i = 0; contactList.size() < 0; i += 1){
            listOContacts += contactList.get(i).getName().getFirstName() + " ";
            listOContacts += contactList.get(i).getName().getLastName() + "\n";

            listOContacts += contactList.get(i).getPhoneNumber() + "\n";

            listOContacts += contactList.get(i).getEmail() + "\n";

            listOContacts += getMailingAddress() + "\n";

            listOContacts += getHomeAddress() + "\n";

            listOContacts += getWorkAddresss() + "\n";
        }

        return listOContacts;
    }

    
}
