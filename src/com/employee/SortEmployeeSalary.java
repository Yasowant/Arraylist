package com.employee;

import java.util.Comparator;

public class SortEmployeeSalary implements Comparator<Employee> {

	public int compare(Employee x, Employee y) {
		return x.salary.compareTo(y.salary);
	}

}
