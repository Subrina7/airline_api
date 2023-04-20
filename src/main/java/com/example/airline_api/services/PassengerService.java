package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

    public void savePassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    public Passenger findPassenger(Long id) {
        return passengerRepository.findById(id).get();
    }

    public List<Passenger> findAllPassengers() {
        return passengerRepository.findAll();
    }

    public void deletePassenger(Long id) {
        Passenger passenger = passengerRepository.findById(id).get();
        for (Flight flight : passenger.getFlights()) {
            flight.removePassengers(passenger);
            flightRepository.save(flight);
        }
        passengerRepository.deleteById(id);
    }
}

