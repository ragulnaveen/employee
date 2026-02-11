package com.employee.empDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.empEntity.Employee;
import com.employee.empRepository.EmployeeRepository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;
public String postdate(Employee e) {
	er.save(e);
	return "save successfully";
}
public String multiple(List<Employee> a) {
	er.saveAll (a);
	return "Sava successfully";	
}
public Employee getdata(int a) {
	Employee x=er.findById(a).get();
	return x;
}
public List<Employee>getall() {
	List<Employee>a=er.findAll();
	return a;
}
public String update(Employee e,int a) {
	Employee x=er.findById(a).get();
    x.setName(e.getName());
    x.setExperience(e.getExperience());
    x.setSalary(e.getSalary());
    x.setRole(e.getRole());
    er.save(x);
    return "updated Successfully";
}
public String patch(Employee e,int a) {
	Employee aa=er.findById(a).get();
	aa.setName(e.getName());
	er.save(aa);
	return "one change successfully";
}
public String delete(int a) {
	er.deleteById(a);
	return "one delete successfully";
}
}
