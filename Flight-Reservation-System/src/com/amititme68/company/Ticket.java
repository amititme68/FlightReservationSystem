package com.amititme68.company;
import java.util.Date;
import  java.text.SimpleDateFormat;
import  java.text.ParseException;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatNumber;
    private float price;
    private boolean isCancelled;


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

    public void setIsCancelled(boolean isCancelled){
        this.isCancelled=isCancelled;}
    public boolean getIsCancelled(){return isCancelled;}

// Method declaration starts here

    public String checkStatus() {
        if (getIsCancelled()) {
            return "Cancelled";
        } else {
            return "Confirmed";
        }
    }

    public void getFlightDuration() throws ParseException{
        SimpleDateFormat dateTime = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        Date d1 = dateTime.parse(departureDateTime);
        Date d2 = dateTime.parse(arrivalDateTime);

        long diffInTime = Math.abs(d1.getTime()- d2.getTime());
        long diffInSeconds = (diffInTime/1000)%60;
        long diffInMinutes = (diffInTime/(1000*60))%60;
        long diffInHours = (diffInTime/(1000*60*60))%24;
        long diffInDays = (diffInTime/(1000*60*60*24))%365;

        System.out.println("Flight Duration is :"+diffInDays+" days "+diffInHours+" hours "+diffInMinutes+" minutes");

    }

    public void Cancel(){
        this.isCancelled=true;
    }

}
