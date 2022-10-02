package com.example.lab04SpringDataJPA.entity;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class Employee {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int manv;
	private String ten;
	private int luong ;
	
	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinTable(name = "CHUNGNHAN", joinColumns = {@JoinColumn(name = "manv")},
		inverseJoinColumns = {@JoinColumn(name = "mamb")})
	private Set<Plane> listPlane = new HashSet();
	
	public int getManv() {
		return manv;
	}
	public void setManv(int manv) {
		this.manv = manv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	//
	public Employee(int manv, String ten, int luong) {
		super();
		this.manv = manv;
		this.ten = ten;
		this.luong = luong;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [manv=" + manv + ", ten=" + ten + ", luong=" + luong + "]";
	}
	
	
	

}
