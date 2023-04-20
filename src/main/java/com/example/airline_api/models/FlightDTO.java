package com.example.airline_api.models;

import java.util.List;

public class FlightDTO {

    private String destination;
    private int capacity;
    private List<Long> passengerIds;

    public FlightDTO( String destination, int capacity, List passengerIds){
        this.destination = destination;
        this.capacity = capacity;
        this.passengerIds = passengerIds;
    }

    public FlightDTO(){

    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Long> getPassengerIds() {
        return passengerIds;
    }

    public void setPassengerIds(List<Long> passengerIds) {
        this.passengerIds = passengerIds;
    }
}
