package com.example.lab04SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lab04SpringDataJPA.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, String> {
	@Query(value = "SELECT * FROM chuyenbay WHERE GaDen='DAD'", nativeQuery = true)
	public List<Flight> getFlighttoDAD();

	@Query(value = "SELECT * FROM chuyenbay WHERE DoDai > 8000 AND DoDai < 10000", nativeQuery = true)
	public List<Flight> getFlightbyDoDai8000to10000();
	
	@Query(value = "SELECT * FROM chuyenbay WHERE GaDi='SGN' AND GaDen='BMV'", nativeQuery = true)
	public List<Flight> getFlightbySGNtoBMV();

	@Query(value = "SELECT COUNT(MaCB) FROM chuyenbay WHERE GaDi='SGN'", nativeQuery = true)
	public int getFlightbyGadiSGN();
}
