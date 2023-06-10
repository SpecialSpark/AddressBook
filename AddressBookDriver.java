//package addressBook;

import java.util.List;
import java.util.Scanner;
import model.AddressBook;
import model.Contact;


public class AddressBookDriver {
    private static AddressBook addressBook;
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        boolean runProgram = true;

        addressBook  = AddressBook.getInstance();
        List<Contact> contactList = addressBook.getContactList();

        do {
            String userInput = user.nextLine();

            if(userInput.equals("end")){
                runProgram = false;
            } else {
            System.out.println(userInput);
            }

        } while (runProgram);

        user.close();
    }
}
