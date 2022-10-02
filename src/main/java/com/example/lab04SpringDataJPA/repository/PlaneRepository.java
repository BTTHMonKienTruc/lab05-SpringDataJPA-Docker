package com.example.lab04SpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lab04SpringDataJPA.entity.Plane;

public interface PlaneRepository extends JpaRepository<Plane, Integer> {

	@Query(value = "SELECT * FROM maybay WHERE TamBay>10000", nativeQuery = true)
	public List<Plane> getPlanebyTamBayTren10000();

	@Query(value = "SELECT * FROM maybay WHERE Loai like 'Boeing%'", nativeQuery = true)
	public List<Plane> getPlanebyBoeing();
}
