package com.example.airline_api.controllers;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.FlightDTO;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(name = "flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightRepository flightRepository;

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFLights(){
        return new ResponseEntity(flightRepository.findAll(), HttpStatus.OK)
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Flight>> getChocolate(@PathVariable Long id) {
        return new ResponseEntity(flightService.findFlightById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Flight> postChocolate(@RequestBody FlightDTO flightDTO){
        Flight flight = flightService.saveFlight(flightDTO);
        return new ResponseEntity<>(flight, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Flight> updateChocolate(
            @RequestBody FlightDTO flightDTO,
            @PathVariable Long id){
        Flight flight = flightService.updateService(flightDTO, id);
        return new ResponseEntity<>(flight, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteChocolate(@PathVariable Long id){
        flightService.deleteFlight(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }




}
