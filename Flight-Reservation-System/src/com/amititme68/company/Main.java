package com.amititme68.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Passenger amitKumar = new Passenger("Maharajganj","Madhubani",
                "Bihar","Amit Kumar","+91-8789945531",
                "amititme68@gmail.com");

        Passenger nituPanjiyar = new Passenger("Maharajganj","Madhubani",
                "Bihar","Amit Kumar","+91-8789945531",
                "amititme68@gmail.com");

       Flight AirIndia = new Flight("AI123","Air India",123,2);
       Ticket ticket1 = new Ticket("AR12345","Delhi","Mumbai",AirIndia,
               "May 9_15:20","May 9_17:20",amitKumar,
               "123",3400.0f,false);
      RegularTicket regTicket = new RegularTicket("AR12345","Delhi","Mumbai",
              AirIndia,"May 9_17:20","May 9_19:30",amitKumar,
                "1234",5000.0f,false,"Tea,Snacks");
      TouristTicket tourTicket = new TouristTicket("SP123","Bangalore",
                "Goa",AirIndia,"Mar 5_06:20","Mar 5_07:20",
                amitKumar,"12",2000.0f,false,
              "Vagator Beach Bardez - Goa 403509 India");


        System.out.println(nituPanjiyar.getPassengerCount());
        System.out.println(amitKumar.getAddressDetails());
        System.out.println(amitKumar.getContactDetails());
        System.out.println(AirIndia.getFlightNumber());
        System.out.println(ticket1.getStatus());
        System.out.println(regTicket.getSpecialServices());
        System.out.println(tourTicket.getHotelAddress());



        System.out.println(ticket1.getPnr());
        System.out.println(ticket1.getFrom());
        System.out.println(AirIndia.getFlightNumber());
        System.out.println(ticket1.getTo());
        System.out.println(AirIndia.getFlightDetails());
        System.out.println(ticket1.getStatus());

    }
}
