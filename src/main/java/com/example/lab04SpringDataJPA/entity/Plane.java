package com.example.lab04SpringDataJPA.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class Plane {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mamb;
//	@Column(name = "Loai")
	private String loai;
//	@Column(name = "TamBay")
	private int tambay;
	@ManyToMany(mappedBy = "listPlane", cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Set<Employee> listEmployee;
	//
	public int getMamb() {
		return mamb;
	}
	public void setMamb(int mamb) {
		this.mamb = mamb;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getTamBay() {
		return tambay;
	}
	public void setTamBay(int tamBay) {
		this.tambay = tamBay;
	}
	public Plane(int mamb, String loai, int tamBay) {
		super();
		this.mamb = mamb;
		this.loai = loai;
		this.tambay = tamBay;
	}
	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Plane [mamb=" + mamb + ", loai=" + loai + ", tamBay=" + tambay + "]";
	}
	
}
