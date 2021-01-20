package com.amititme68.company;

public class Passenger {
    private static int idCounter;
    private int id;
    private Address address; // object declare in owner class
    private Contact contact; // object declare in owner class

    private static class Address {
        String street, city, state;

        // constructor of class Address
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }


    private static  class Contact {

        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    static {
        idCounter = 0;
    }

    public Passenger(String addressStreet,String addressCity,String addressState,
                     String contactName, String contactPhone, String contactEmail){
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);

    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state; }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email; }

     public void setId(int id){
        this.id = id;
     }

     public int getPassengerCount(){
        return this.id;}



}
