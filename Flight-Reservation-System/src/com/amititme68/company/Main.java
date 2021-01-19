package com.amititme68.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Passenger amitKumar = new Passenger(123);
        Address amitAddress = new Address("Maharajganj","Madhubani","Bihar");
        Contact contactDetails = new Contact("Amit Kumar","+91-8789945531","amititme68@gmail.com");
        Flight AirIndia = new Flight("AI123","Air India",123,2);
        RegularTicket regTicket = new RegularTicket("AR12345","Delhi","Mumbai",
                "May 9_15:20","May 9_17:20","79",
                5000.0f,false,"Snacks");
        TouristTicket tourTicket = new TouristTicket("SP123","Bangalore",
                "Goa","Mar 5_06:20","Mar 5_07:20",
                "75",2000.0f,false,"Vagator Beach Bardez - Goa 403509 India");

        System.out.println(amitKumar.id);
        System.out.println(amitAddress.getAddressDetails());
        System.out.println(contactDetails.getContactDetails());
        System.out.println(AirIndia.getFlightDetails());
        System.out.println(regTicket.getSpecialServices());

    }
}
