package com.amititme68.company;

public class Flight {
    private String flightNumber;
    private String airLine;
    private int capacity;
    private int bookedSeats;


    public Flight(String flightNumber, String airLine, int capacity,int bookedSeats) {

        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;

    }


   public void setFlightNumber(String flightNumber){
        this.flightNumber =flightNumber;
    }
    public String getFlightNumber(){return flightNumber;}

    public void setAirLine(String airLine){
        this.airLine =airLine;
    }
    public String getAirLine(){return airLine;}

    public void setCapacity(int capacity){
        this.capacity =capacity;
    }
    public int getCapacity(){return capacity;}

    public void setBookedSeats(int bookedSeats){
        this.bookedSeats =bookedSeats;
    }
    public int getBookedSeats(){return bookedSeats;}

    public String getFlightDetails() {
        return this.flightNumber + ", " + this.airLine +", "+ this.capacity + ", "+ this.bookedSeats;
    }

    public  boolean checkAvailability(){
        return true;
    }


}
