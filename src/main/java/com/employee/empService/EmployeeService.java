package com.employee.empService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.empDao.EmployeeDao;
import com.employee.empEntity.Employee;
import com.employee.empRepository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;
public String postdate(Employee e) {
	return ed.postdate(e);
}
public String multiple(List<Employee> a) {
	return ed.multiple(a);
}
public Employee getdata(int a) {
	return ed.getdata(a);
}
public List<Employee>getall(){
	return ed.getall();
} 
public String update(Employee e,int a) {
	return ed.update(e,a);
}
public String patch(Employee e,int a) {
	return ed.patch(e,a);
}
public String delete(int a) {
	return ed.delete(a);
}
@Autowired 
EmployeeRepository er;
public int max() {
	List<Employee>a=er.findAll();
	int aa=a.stream().map(x->x.getSalary()).max(Comparable::compareTo).get();
	return aa;
}
public Employee object() {
	List<Employee>a=er.findAll();
	Employee aa=a.stream().max(Comparator.comparing(Employee::getSalary)).get();
	return aa;
}
public int secondmax() {
	List<Employee> a=er.findAll();
	Integer aa=a.stream().map(x->x.getSalary()).sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().get();
	return aa;
}
public Employee secondobject() {
	List<Employee>a=er.findAll();
	Employee aa=a.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).limit(1).findFirst().get();
	return aa;
}
public List<String> name() {
	List<Employee> a=er.findAll();
	List<String>aa=a.stream().map(x->x.getName()).collect(Collectors.toList());
	return  aa;
}
public List<Employee>name( String a){
	List<Employee>x=er.findAll();
	List<Employee>aa=x.stream().filter(y->y.getName().equals(a)).collect(Collectors.toList());
    return aa;
}
public List<Employee>salaryy(int a,int b){
	List<Employee>x=er.findAll();
	List<Employee>aa=x.stream().filter(y->y.getSalary()>a && y.getSalary()<b).collect(Collectors.toList());
	return aa;
}
public List<String>evenn(){
	List<Employee>x=er.findAll();
	List<String>aa=x.stream().filter(y->y.getName().length()%2==0).map(j->j.getName()).collect(Collectors.toList());
	return aa;
}
public int min() {
	List<Employee>x=er.findAll();
	int aa=x.stream().map(y->y.getSalary()).min(Comparable::compareTo).get();
	return aa;
}
public int sum() {
	List<Employee>z=er.findAll();
	int aa=z.stream().collect(Collectors.summingInt(x->x.getSalary()));
	return aa;
}
public List<Employee>get() {
	return er.get();
}
}
