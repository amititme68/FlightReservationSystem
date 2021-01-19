package com.amititme68.company;

public class Contact {

    String name, phone, email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }




    public String getContactDetails() {
        return this.name + ", " + this.phone + ", " + this.email; }


}
