package com.employee;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(25, "Yash", 26.52);
		Employee e2 = new Employee(26, "Disney", 22.59);

		SortEmployeeById id = new SortEmployeeById();
		SortEmployeeByName name = new SortEmployeeByName();
		SortEmployeeSalary salary = new SortEmployeeSalary();

		ArrayList<Employee> t = new ArrayList<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(new Employee(23, "Girish", 35.69));
		t.add(new Employee(21, "Mayank", 15.692));
		
//		 Collections.sort(t, new SortEmployeeById());
//		 Collections.sort(t, new SortEmployeeByName());
		 Collections.sort(t, new SortEmployeeSalary());
		 

		for (Employee e : t) {
			System.out.println(e);
		}

	}

}
