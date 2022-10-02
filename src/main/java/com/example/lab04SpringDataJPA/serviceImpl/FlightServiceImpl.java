package com.example.lab04SpringDataJPA.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.lab04SpringDataJPA.entity.Flight;
import com.example.lab04SpringDataJPA.repository.FlightRepository;
import com.example.lab04SpringDataJPA.service.FlightService;

@Transactional
@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightRepository flightRepository;
	
	@Override
	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}

	@Override
	public Flight findById(String id) {
		Flight a = null;
		Optional<Flight> result = flightRepository.findById(id);
		if (result.isPresent()) {
			a = result.get();
		} else {
			throw new RuntimeException("Khong tim thay ma: "+ id);
		}
		return a;
	}

	@Override
	public void save(Flight flight) {
		flightRepository.save(flight);
		
	}

	@Override
	public void delete(String id) {
		flightRepository.delete(findById(id));
	}

	@Override
	public List<Flight> getFlighttoDAD() {
		// TODO Auto-generated method stub
		return flightRepository.getFlighttoDAD();
	}

	@Override
	public List<Flight> getFlightbyDoDai8000to10000() {
		// TODO Auto-generated method stub
		return flightRepository.getFlightbyDoDai8000to10000();
	}

	@Override
	public List<Flight> getFlightbySGNtoBMV() {
		// TODO Auto-generated method stub
		return flightRepository.getFlightbySGNtoBMV();
	}

	@Override
	public int getFlightbyGadiSGN() {
		// TODO Auto-generated method stub
		return flightRepository.getFlightbyGadiSGN();
	}

}
