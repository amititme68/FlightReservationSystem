package com.amititme68.company;

public class RegularTicket extends Ticket{
   private String specialServices;



    public RegularTicket(String pnr,String from,String to,Flight flight,String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNumber,
                         float price,boolean isCancelled,String specialServices) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNumber, price, isCancelled);
        this.specialServices = specialServices;
    }

    public String checkStatus() {
        if (getIsCancelled()) {
            return "Cancelled";
        } else {
            return "Confirmed";
        }
    }

    public int getFlightDuration(){
        return 24;
    }
    public void cancel(){getIsCancelled();}

    public void setSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }
    public  String getSpecialServices(){
        return this.specialServices;
    }




}
