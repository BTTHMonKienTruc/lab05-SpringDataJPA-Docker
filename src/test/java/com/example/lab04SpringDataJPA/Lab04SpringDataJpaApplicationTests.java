package com.example.lab04SpringDataJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.lab04SpringDataJPA.entity.Employee;
import com.example.lab04SpringDataJPA.entity.Flight;
import com.example.lab04SpringDataJPA.entity.Plane;
import com.example.lab04SpringDataJPA.service.EmployeeService;
import com.example.lab04SpringDataJPA.service.FlightService;
import com.example.lab04SpringDataJPA.service.PlaneService;

@SpringBootTest
class Lab04SpringDataJpaApplicationTests {

	@Autowired
	private FlightService flightService;	
	@Autowired
	private PlaneService planeService;
	@Autowired
	private EmployeeService employeeService;

	//Cau1
	@Test
	void getFlighttoDAD() {
		
		List<Flight> flights = flightService.getFlighttoDAD();
		for (Flight flight : flights) {
			System.out.println(flight);
		}
	}
	
	//Cau02
	@Test
	void getPlanebyTamBayTren10000() {
		System.out.println("Cau 02: ");
		List<Plane> planes = planeService.getPlanebyTamBayTren10000();
		for (Plane val : planes) {
			System.out.println(val);
		}
	}

	//Cau03
	@Test
	void getEmployeesByLuongDuoi10000() {
		System.out.println("Cau 03: Tìm các nhân viên có lương nhỏ hơn 10,000.");
		List<Employee> employees = employeeService.getEmployeesByLuongDuoi10000();
		for (Employee val : employees) {
			System.out.println(val);
		}
	}

	//Cau04
	@Test
	void getFlightbyDoDai8000to10000() {
		System.out.println("Cau 04: chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.");
		List<Flight> flights = flightService.getFlightbyDoDai8000to10000();
		for (Flight flight : flights) {
			System.out.println(flight);
		}
	}
	
	//Cau05
	@Test
	void getFlightbySGNtoBMV() {
		System.out.println("Cau 05: chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).");
		List<Flight> flights = flightService.getFlightbySGNtoBMV();
		for (Flight flight : flights) {
			System.out.println(flight);
		}
	}

}
