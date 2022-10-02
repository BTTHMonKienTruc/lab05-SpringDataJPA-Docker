package com.example.lab04SpringDataJPA.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.lab04SpringDataJPA.entity.Plane;


public interface PlaneService {
	public List<Plane> findAll();

	public Plane findById(int id);

	public void save(Plane plane);

	public void delete(int id);
	
	
	public List<Plane> getPlanebyTamBayTren10000();

//	@Query(value = "SELECT * FROM maybay WHERE Loai like 'Boeing%'", nativeQuery = true)
	public List<Plane> getPlanebyBoeing();
	
}
