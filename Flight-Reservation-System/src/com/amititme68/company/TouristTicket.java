package com.amititme68.company;

public class TouristTicket {

    String pnr, from, to, departureDateTime, arrivalDateTime, seatNumber;
    float price;
    boolean isCancelled;
    String hotelAddress;

    public TouristTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,
                         String seatNumber,float price,boolean isCancelled,String hotelAddress) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isCancelled = isCancelled;
        this.hotelAddress = hotelAddress;
    }

    public String checkStatus() {
        if (isCancelled) {
            return "Cancelled";
        } else {
            return "Confirmed";
        }
    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public int getFlightDuration(){
        return 24;
    }
    public void cancel(){
        isCancelled =true;
    }



}
