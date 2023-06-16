package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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
//		 Collections.sort(t, new SortEmployeeSalary());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sorting criteria (id/name/salary): ");
		String sortingCriteria = scanner.nextLine().toLowerCase();

		Comparator<Employee> comparator;

		switch (sortingCriteria) {
		case "id":
			comparator = new SortEmployeeById();
			break;
		case "name":
			comparator = new SortEmployeeByName();
			break;
		case "salary":
			comparator = new SortEmployeeSalary();
			break;
		default:
			System.out.println("Invalid sorting criteria. Sorting by ID.");
			comparator = new SortEmployeeById();
			break;
		}

		Collections.sort(t, comparator);

		for (Employee e : t) {
			System.out.println(e);
		}

	}

}
