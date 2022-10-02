package com.example.lab04SpringDataJPA.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.lab04SpringDataJPA.entity.Plane;
import com.example.lab04SpringDataJPA.repository.PlaneRepository;
import com.example.lab04SpringDataJPA.service.PlaneService;

@Service
@Transactional
public class PlaneServiceImpl implements PlaneService{

	@Autowired
	private PlaneRepository planeRepository;
	
	@Override
	public List<Plane> findAll() {
		// TODO Auto-generated method stub
		return planeRepository.findAll();
	}

	@Override
	public Plane findById(int id) {
		// TODO Auto-generated method stub
		Optional<Plane> result = planeRepository.findById(id);
		Plane p = null;
		if (result.isPresent()) {
			p = result.get();
		}
		else {
			throw new RuntimeException("Khong tim thay ma: "+ id);
		}
		return p;
	}

	@Override
	public void save(Plane plane) {
		planeRepository.save(plane);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		planeRepository.delete(findById(id));
	}

	@Override
	public List<Plane> getPlanebyTamBayTren10000() {
		// TODO Auto-generated method stub
		return planeRepository.getPlanebyTamBayTren10000();
	}

	@Override
	public List<Plane> getPlanebyBoeing() {
		// TODO Auto-generated method stub
		return planeRepository.getPlanebyBoeing();
	}

}
