//package addressBook;

import java.util.List;

public class AddressBookDriver {
    private static AddressBook addressBook;
    public static void main(String[] args){
        addressBook  = AddressBook.getInstance();
        List<Contact> contactList = addressBook.getContactList();
        System.out.println(contactList);

    }
}
