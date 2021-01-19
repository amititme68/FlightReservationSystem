package com.amititme68.company;

public class Flight {
    String flightNumber,airLine;
    int capacity;
    int bookedSeats;

//
    int bookingCounter;
    boolean isAvailable;

    public Flight(String flightNumber, String airLine, int capacity,int bookedSeats) {


        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;

    }



    public String getFlightDetails() {
        return this.flightNumber + ", " + this.airLine +", "+ this.capacity + ", "+ this.bookedSeats;
    }

    public  boolean checkAvailability(){
        return isAvailable;
    }

    public void incrementBookingCounter(){
     bookingCounter++;
    }



}
