package com.example.lab04SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab04SpringDataJPA.entity.Flight;
import com.example.lab04SpringDataJPA.service.FlightService;

@RestController
@RequestMapping("/api")
public class FlightRestController {

	private FlightService flightService;

	@Autowired
	public FlightRestController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}
	//
	@GetMapping("/flights")
	public List<Flight> getPlanes(){
		return flightService.findAll();
	}

	//
	@GetMapping("/cau01")
	public List<Flight> getFlighttoDAD(){
		return flightService.getFlighttoDAD();
	}
	
	//
	@GetMapping("/cau04")
	public List<Flight> getFlightbyDoDai8000to10000(){
		return flightService.getFlightbyDoDai8000to10000();
	}

	//
	@GetMapping("/cau05")
	public List<Flight> getFlightbySGNtoBMV(){
		return flightService.getFlightbySGNtoBMV();
	}
	
	//
	@GetMapping("/cau06")
	public String getFlightbyGadiSGN(){
		return "Số chuyến bay xuất phát từ Sài Gòn: "+ flightService.getFlightbyGadiSGN();
	}
}
