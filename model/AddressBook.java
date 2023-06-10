//package addressBook.model;

import java.util.List;

public class AddressBook {
    private List<Contact> contactList;

    public static AddressBook addressBook;

    public static AddressBook getInstance(){
        
        if(addressBook == null){
            addressBook = new AddressBook();
        }

        return addressBook;
    }

    private AddressBook(){

    }

    public List<Contact> getContactList(){
        return this.contactList;
    }
}
