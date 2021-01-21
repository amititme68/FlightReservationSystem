package com.amititme68.company;

public class TouristTicket extends Ticket {

    private String hotelAddress;
    public String[] selectedTouristLocation ;


    public TouristTicket(String pnr,String from,String to,Flight flight,String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNumber,
                         float price,boolean isCancelled,String hotelAddress,String[] selectedTouristLocation) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNumber, price, isCancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation=new String[5];
    }



    public void setHotelAddress(String hotelAddress){
        this.hotelAddress = hotelAddress;
    }
    public String getHotelAddress(){
        return this.hotelAddress;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation){
        this.selectedTouristLocation = selectedTouristLocation;
    }

   public void getSelectedTouristLocation(){
       System.out.println(selectedTouristLocation[0]+" "+selectedTouristLocation[1]+" "
               +selectedTouristLocation[2]+" "+selectedTouristLocation[3]+" "+selectedTouristLocation[4]);
   }





}
