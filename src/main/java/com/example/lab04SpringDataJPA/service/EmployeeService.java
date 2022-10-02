package com.example.lab04SpringDataJPA.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.example.lab04SpringDataJPA.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(String manv);
	public void save(Employee employee);
	public void delete(String manv);
	
	
	public List<Employee> getEmployeesByLuongDuoi10000();

//	@Query(value = "SELECT SUM(Luong) FROM nhanvien", nativeQuery = true)
	public Double getEmployeesSumMokey();
	
	
	
	/**
	 * @Query(value = "SELECT nhanvien.MaNV\r\n"
			+ "FROM     nhanvien INNER JOIN chungnhan ON nhanvien.MaNV = chungnhan.MaNV INNER JOIN\r\n"
			+ "                  maybay ON chungnhan.MaMB = maybay.MaMB\r\n"
			+ "WHERE maybay.Loai like 'Boeing%'", nativeQuery = true)
	 * @return
	 */
	public List<String> getEmployeesbyBoeing();
	

//	@Query(value = "SELECT nhanvien.*\r\n"
//			+ "FROM     maybay INNER JOIN\r\n"
//			+ "                  chungnhan ON maybay.MaMB = chungnhan.MaMB INNER JOIN\r\n"
//			+ "                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
//			+ "WHERE maybay.Loai like '%747%'", nativeQuery = true)
	public List<Employee> getEmployeesbyPlane747();
	
}
