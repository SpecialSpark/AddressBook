//package model;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    private List<Contact> contactList = new ArrayList<Contact>();

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

    public void addContact(){
        Contact contact = new Contact();
        this.contactList.add(contact);
    }
}
