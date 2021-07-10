package com.learn.hibrnate.entity;

import java.math.BigDecimal;

public class FullTimeEmployee extends Employee {
	private BigDecimal salary;

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(String name, BigDecimal salary) {
		super(name);
		this.salary = salary;
	}

}