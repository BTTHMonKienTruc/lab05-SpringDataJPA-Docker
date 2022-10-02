package com.example.lab04SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab04SpringDataJPA.entity.Employee;
import com.example.lab04SpringDataJPA.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@GetMapping("/")
	public String myHome() {
		return "home";
	}
	
	//
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	}

	//
	@GetMapping("/cau03")
	public List<Employee> getEmployeesluongduoi10000() {
		return employeeService.getEmployeesByLuongDuoi10000();
	}
	//
	@GetMapping("/cau08")
	public String getEmployeesSumMokey() {
		return "Tổng số lương phải trả cho các nhân viên: " + employeeService.getEmployeesSumMokey() + " USD";
	}

	//
	@GetMapping("/cau09")
	public String getEmployeesbyBoeing() {
		
		String str = "Mã số của các phi công lái máy báy Boeing: ";
		List<String> list = employeeService.getEmployeesbyBoeing();
		for (String string : list) {
			str += "  -- "+ string;
		}
		
		return str;
	}

	//
	@GetMapping("/cau10")
	public List<Employee> getEmployeesbyPlane747() {
		
		return employeeService.getEmployeesbyPlane747();
	}
	
	
}
