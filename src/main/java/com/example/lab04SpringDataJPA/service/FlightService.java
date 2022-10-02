package com.example.lab04SpringDataJPA.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.lab04SpringDataJPA.entity.Flight;

public interface FlightService {
	public List<Flight> findAll();

	public Flight findById(String id);

	public void save(Flight flight);

	public void delete(String id);
	
//	@Query(value = "SELECT * FROM chuyenbay WHERE GaDen='DAD'", nativeQuery = true)
	public List<Flight> getFlighttoDAD();
	
//	@Query(value = "SELECT * FROM chuyenbay WHERE DoDai> 8000 AND DoDai< 10000", nativeQuery = true)
	public List<Flight> getFlightbyDoDai8000to10000();
	
//	@Query(value = "SELECT * FROM chuyenbay WHERE GaDi='SGN' AND GaDen='BMV'", nativeQuery = true)
	public List<Flight> getFlightbySGNtoBMV();

//	@Query(value = "SELECT COUNT(MaCB) FROM chuyenbay WHERE GaDi='SGN'", nativeQuery = true)
	public int getFlightbyGadiSGN();
}
