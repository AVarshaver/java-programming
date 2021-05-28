package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country = "USA";

    public Address(){

    }


    public String getStreet() {
        return street + ", "+ city + ", " + state + ", " + zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

}

