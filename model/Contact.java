//package model;

//import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Name name;
    private String phoneNumber;
    private String email;
    private List<Address> addresses;
    
    public Contact(){

    }

    public Contact(Name name, String phoneNumber, String email, List<Address> addresses){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(List<Address> addresses){
        this.addresses = addresses;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name){
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
