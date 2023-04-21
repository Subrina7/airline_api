package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.FlightDTO;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerService passengerService;

    public Flight findFlightById(Long id) {
        return flightRepository.findById(id).get();
    }

    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    public Flight saveFlight(FlightDTO flightDTO) {
        Flight flight = new Flight(
                flightDTO.getDestination(),
                flightDTO.getCapacity(),
                flightDTO.getDepartureTime(),
                flightDTO.getDepartureDate());
        for (Long passengerId : flightDTO.getPassengerIds()) {
            Passenger passenger = passengerService.findPassenger(passengerId);
            flight.addPassengers(passenger);
        }
        return flightRepository.save(flight);
    }

    public Flight updateFlight(FlightDTO flightDTO, Long id) {
        Flight flight = flightRepository.findById(id).get();
        flight.setDepartureDate(flightDTO.getDestination());
        flight.setCapacity(flightDTO.getCapacity());
        flight.setPassengers(new ArrayList<>());
        for(Long passengersId : flightDTO.getPassengerIds()){
            Passenger passenger = passengerService.findPassenger(passengersId);
            flight.addPassengers(passenger);
        }
        return flightRepository.save(flight);
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}

