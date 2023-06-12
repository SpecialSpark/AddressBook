//package model;

public class Address {
    
    public static enum AddressType{

        mailing('M'),
        home('H'),
        work('W');

        public char value;

        AddressType(char value){
            this.value = value;
        }

    }

    private String zipAddress;
    private String streetAddress;
    private String cityAddress;
    private String stateAddress;
    private AddressType addressType;


    public Address(){

    }

    public Address(char type,String zip, String street, String city, String state){
        this.addressType.value = type;
        this.zipAddress = zip;
        this.streetAddress = street;
        this.cityAddress = city;
        this.stateAddress = state; 
    }
    
    public char getAddressType(){
        return this.addressType.value;
    }

    public void setAddressesType(AddressType addressType){
        this.addressType = addressType;
    }
    public String getZipAddress() {
        return this.zipAddress;
    }

    public void setZipAddress(String zipAddress){
        this.zipAddress = zipAddress;
    }

    public String getStreetAddress(){
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityAddress() {
        return this.cityAddress;
    }

    public void setCityAddress(String cityAddress){
        this.cityAddress =  cityAddress;
    }

    public String getStateAddress() {
        return this.stateAddress;
    }

    public void setStateAddress(String stateAddress){
        this.stateAddress = stateAddress;
    }
}
