package com.amititme68.company;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNumber;
    private float price;
    private boolean isCancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr,String from,String to,Flight flight,String departureDateTime,
                  String arrivalDateTime, Passenger passenger, String seatNumber,
                  float price,boolean isCancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isCancelled = isCancelled;
    }

  public void setPnr(String pnr){
        this.pnr =pnr;
    }
    public String getPnr(){return pnr;}

    public void setFrom(String from){
        this.from =from;
    }
    public String getFrom(){return from;}

    public void setTo(String to){
        this.to =to;
    }
    public String getTo(){return to;}

    public void setFlight(Flight flight){
        this.flight =flight;
    }
    public Flight getFlight(){return flight;}

    public void setDepartureDateTime(String departureDateTime){
        this.departureDateTime =departureDateTime;
    }
    public String getDepartureDateTime(){return departureDateTime;}

    public void setArrivalDateTime(String arrivalDateTime){
        this.arrivalDateTime =arrivalDateTime;
    }
    public String getArrivalDateTime(){return arrivalDateTime;}

    public void setPassenger(Passenger passenger){
        this.passenger =passenger;
    }
    public Passenger getPassenger(){return passenger;}

    public void setSeatNumber(String seatNumber){
        this.seatNumber =seatNumber;
    }
    public String getSeatNumber(){return seatNumber;}

    public void setPrice(float price){
        this.price =price;
    }
    public float getPrice(){return price;}

    public void setIsCancelled(){
        this.isCancelled=true;}
    public boolean getIsCancelled(){return isCancelled;}

    public String getStatus() {
        return this.pnr + ", " + this.from + ", " + this.to + ", " + this.flight.getFlightDetails() + ", "
                + this.departureDateTime + ", " + this.arrivalDateTime + ", " + this.passenger.getAddressDetails()
                + ", " + this.seatNumber + ", " + this.price  ; }

}
