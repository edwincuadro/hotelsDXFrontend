package com.dxhotels.qa.models;

public class BookingData {

    private String location;
    private String checkIn;
    private String checkOut;

    public BookingData(String location, String checkIn, String checkOut){
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getLocation() {
        return location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }
}
