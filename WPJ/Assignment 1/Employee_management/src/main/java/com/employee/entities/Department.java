package com.employee.entities;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "departments")
@AttributeOverride(name = "id", column = @Column(name = "dept_id"))

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = false)
public class Department extends BaseEntity {

	@Column(name = "dept_name", unique = true, nullable = false, length = 30)
	private String name;

	@Column(length = 60, nullable = false)
	private String location;

	// Department 1-----* Employee
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee> employee;

	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

}
