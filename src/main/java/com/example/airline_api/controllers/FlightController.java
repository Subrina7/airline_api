package com.example.airline_api.controllers;

import com.example.airline_api.models.Flight;
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

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Flight>> getChocolate(@PathVariable Long id) {
        return new ResponseEntity(flightService.findFlightById(id), HttpStatus.OK);
    }



}
