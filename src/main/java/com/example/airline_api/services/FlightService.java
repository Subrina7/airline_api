package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.FlightDTO;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerService passengerService;

    public Flight saveChocolate(FlightDTO flightDTO){
        Flight chocolate = new Flight(flightDTO.getDestination(), flightDTO.getCapacity(), flightDTO.getPassengerIds());
        for(Long passengerId : flightDTO.getPassengerIds()){
            Passenger passenger = passengerService.findPassenger(passengerId);
            chocolate.addEstate(estate);
        }
        return FlightRepository.save(flight);
    }
    public Flight findFlightById(Long id){
        return flightRepository.findById(id).get();
    }

    public List<Flight> findAll(){
        return flightRepository.findAll();
    }

//    public Flight saveFlight(Flight Long){
//        Flight flight = new Flight("Dubai", 400, "10th May", "6am");
//
//    }
}
