package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.FlightDTO;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader() {
    }

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
//
//        Passenger natashaPassenger = new Passenger("Natasha", "natasha@gmail.com");
//        passengerRepository.save(natashaPassenger);
//
//        Flight englandFlight = new Flight("England", 200, "21/04/23", "12pm");
//        flightRepository.save(englandFlight);
//
//        Flight spainFlight = new Flight("Spain", 400, "09/05/23", "1pm");
//        flightRepository.save(spainFlight);
//
//
//        Passenger johnPassenger = new Passenger("John", "john@gmail.com");
//        passengerRepository.save(johnPassenger);
//
//        Flight dubaiFlight = new Flight("Dubai", 1200, "26/04/23", "8am");
//        flightRepository.save(dubaiFlight);
//
//        Flight franceFlight = new Flight("France", 600, "09/06/23", "7am");
//        flightRepository.save(franceFlight);
//
//
//        Passenger samPassenger = new Passenger("Sam", "sam@gmail.com");
//        passengerRepository.save(samPassenger);
//
//        Flight japanFlight = new Flight("Japan", 2000, "10/09/23", "9am");
//        flightRepository.save(japanFlight);
//
//        englandFlight.addPassengers(natashaPassenger);
//        japanFlight.addPassengers(natashaPassenger);
//        spainFlight.addPassengers(johnPassenger);
//        spainFlight.addPassengers(samPassenger);
//
//        japanFlight.addPassengers(johnPassenger);
//
//        flightRepository.save(englandFlight);
//        flightRepository.save(spainFlight);
//        flightRepository.save(japanFlight);

}