package com.amititme68.company;
import java.text.ParseException;

public class Main {


    public static void main(String[] args) throws ParseException {
	// write your code here

        Passenger amitKumar = new Passenger("Maharajganj","Madhubani",
                "Bihar","Amit Kumar","+91-8789945531",
                "amititme68@gmail.com");

        Passenger nituPanjiyar = new Passenger("Maharajganj","Madhubani",
                "Bihar","Amit Kumar","+91-8789945531",
                "amititme68@gmail.com");

       Flight AirIndia = new Flight("AI123","Air India",123,2);

      RegularTicket regTicket = new RegularTicket("AR12345","Delhi","Mumbai",
              AirIndia,"20-01-2020 08:15:00","20-01-2020 05:30:00",amitKumar,
                "1234",5000.0f,false,"Tea,Snacks");

        String[] selectedTouristLocation = new String[]{"Panji","Puducherry","Kolkata","Bangalore"};

      TouristTicket tourTicket = new TouristTicket("SP123","Bangalore",
                "Goa",AirIndia,"21-02-2020 01:10:00","21-02-2020 03:30:00",
                amitKumar,"12",2000.0f,false,
              "Vagator Beach Bardez - Goa 403509 India",selectedTouristLocation);


        printTicketDetails(tourTicket);
        printTicketDetails(regTicket);


        System.out.println(nituPanjiyar.getPassengerCount());
        System.out.println(amitKumar.getAddressDetails());
        System.out.println(amitKumar.getContactDetails());
        System.out.println(AirIndia.getFlightNumber());
        System.out.println(regTicket.getSpecialServices());
        System.out.println(AirIndia.getFlightDetails());
        System.out.println(regTicket.getPnr());
        System.out.println(regTicket.checkStatus());
        System.out.println(tourTicket.checkStatus());
        tourTicket.getFlightDuration();
        regTicket.getFlightDuration();
    }


    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }



}

