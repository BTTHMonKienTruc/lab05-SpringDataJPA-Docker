package com.example.lab04SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab04SpringDataJPA.entity.Plane;
import com.example.lab04SpringDataJPA.service.PlaneService;

@RestController
@RequestMapping("/api")
public class PlaneRestController {

	private PlaneService planeService;

	@Autowired
	public PlaneRestController(PlaneService planeService) {
		this.planeService = planeService;
	}

	//
	@GetMapping("/planes")
	public List<Plane> getPlanes(){
		return planeService.findAll();
	}

	//
	@GetMapping("/cau02")
	public List<Plane> getPlanebyTamBayTren10000(){
		return planeService.getPlanebyTamBayTren10000();
	}
	//
	@GetMapping("/cau07")
	public List<Plane> getPlanebyBoeing(){
		return planeService.getPlanebyBoeing();
	}
	
}
