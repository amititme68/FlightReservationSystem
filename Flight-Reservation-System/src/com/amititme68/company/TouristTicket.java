package com.amititme68.company;

public class TouristTicket extends Ticket {

    private String hotelAddress;
    //private String[] selectedTouristLocation;


    public TouristTicket(String pnr,String from,String to,Flight flight,String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNumber,
                         float price,boolean isCancelled,String hotelAddress) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNumber, price, isCancelled);
        this.hotelAddress = hotelAddress;
       // this.selectedTouristLocation=selectedTouristLocation;
    }

    public String checkStatus() {
        if (getIsCancelled()) {
            return "Cancelled";
        } else {
            return "Confirmed";
        }
    }
    public void setHotelAddress(String hotelAddress){
        this.hotelAddress = hotelAddress;
    }
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public int getFlightDuration(){
        return 24;
    }
    // public void cancel(){isCancelled;}



}
