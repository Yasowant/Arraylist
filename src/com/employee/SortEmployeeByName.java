package com.employee;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee>{
	public int compare(Employee x,Employee y)
	{
		//return x.name.compareTo(y.name);//asending order
		return y.name.compareTo(x.name);
	}
}
