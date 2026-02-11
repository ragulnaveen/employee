package com.employee.empEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="EmployeeDetails")
public class Employee {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private int id;
private String name;
private float experience;
private int salary;
private String role;
public void setid( int id) {
	this.id=id;
}
public int getid() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getExperience() {
	return experience;
}
public void setExperience(float experience) {
	this.experience = experience;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", experience=" + experience + ", salary=" + salary + ", role=" + role + "]";
}

}
