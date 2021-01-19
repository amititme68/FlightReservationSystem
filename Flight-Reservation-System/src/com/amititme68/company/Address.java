package com.amititme68.company;

public class Address {
    String street, city, state;


    // contructor of class Address
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }


    public String getAddressDetails() {
        return this.street + ", " + this.city + ", " + this.state; }

}
