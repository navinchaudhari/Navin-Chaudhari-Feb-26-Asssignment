package com.employee.entities;

import java.time.LocalDate;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@AttributeOverride(name = "id", column = @Column(name = "employee_id"))

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = { "password", "department" }, callSuper = false)
public class Employee extends BaseEntity {
//	email(unique) , password , name , salary, join date
	@Column(nullable = false, unique = true, length = 50)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String name;

	private double salary;

	@Column(name = "join_date", nullable = false)
	private LocalDate joinDate;

	// Employee *----->1 Department

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	private Department department;

	public Employee(String email, String name, double salary, LocalDate joinDate) {
		super();
		this.email = email;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
	}

}
