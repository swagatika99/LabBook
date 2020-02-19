package com.cg.iter.casestudy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.LocalDate;

public class EmployeeRepository {

	public static void main(String[] args) {
		Department buss = new Department(1200, "Sales And Transport", 1122);
		Department fin = new Department(7952, "Finance", 2233);
		Department it = new Department(2853, "Product Development", 3344);
		Department comm = new Department(4356, "Infrastructure",4455 );
		
		List<Department> deptSet = new ArrayList<>();
		deptSet.add(buss);
		deptSet.add(fin);
		deptSet.add(it);
		deptSet.add(comm);
		
		List<Employee> set = new ArrayList<>();
		set.add(new Employee(1234, "Prabhu", "Pandit", "ppp@gmail.com", "9874561235", LocalDate.now(), "Developer", 126000.0, 1122,buss));
		set.add(new Employee(2234, "Ashmita", "Kumar", "ak@gmail.com", "9778452130", LocalDate.now(), "Manager", 30000.0, 2233, fin));
		set.add(new Employee(5234, "Swagatika", "Satapathy", "ss@gmail.com", "8250146397", LocalDate.now(), "Developer", 80000.0, 3344, it));
		set.add(new Employee(7234, "Deepak", "Pradhan", "dp@gmail.com", "8012365479", LocalDate.now(), "CEO", 160000.0, 4455, it));
		set.add(new Employee(9204, "Satya", "Sahoo", "satya@gmail.com", "8895123467", LocalDate.now(), "Tester", 20000.0, 6666, it));
		set.add(new Employee(6804, "Suraj", "Sahoo", "suraj@gmail.com", "9937145698", LocalDate.now(), "Typer", 40000.0, 0, it));
		
		EmployeeService es = new EmployeeService(set,deptSet);
		//es.sumSalary();
		es.noOfEmployeeInEachDepartment();
		//es.empWithoutDept();
		es.sort(3);
	
	}

}
