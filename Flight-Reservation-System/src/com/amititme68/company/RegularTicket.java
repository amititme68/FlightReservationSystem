package com.amititme68.company;

public class RegularTicket {
    String specialServices;

    String pnr, from, to, departureDateTime, arrivalDateTime, seatNumber;
    float price;
    boolean isCancelled;

    public RegularTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,
                  String seatNumber,float price,boolean isCancelled,String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isCancelled = isCancelled;
        this.specialServices = specialServices;
    }

    public String checkStatus() {
        if (isCancelled) {
            return "Cancelled";
        } else {
            return "Confirmed";
        }
    }

    public int getFlightDuration(){
        return 24;
    }
    public void cancel(){
        isCancelled =true;
    }

    public  String getSpecialServices(){
        return this.specialServices;
    }




}
