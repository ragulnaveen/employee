package com.employee.empController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empEntity.Employee;
import com.employee.empService.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
EmployeeService es;
@PostMapping (value="singledata")
public String postdate(@RequestBody Employee e) {
	return es.postdate(e);
}
@PostMapping (value="multipledata")
public String multiple(@RequestBody List<Employee> a) {
	return es.multiple(a);
}
@GetMapping (value="get/{a}")
public Employee getdata(@PathVariable int a) {
	return es.getdata(a);
}
@GetMapping (value="getall")
public List<Employee>getall() {
	return es.getall();
}
@PutMapping (value="update/{a}")
public String update(@RequestBody Employee e,@PathVariable int a) {
	return es.update(e,a);
}
@PatchMapping (value="patch/{a}")
public String patch(@RequestBody Employee e,@PathVariable int a) {
	return es.patch(e,a);
}
@DeleteMapping (value="delete/{a}")
public String delete(@PathVariable int a) {
	return es.delete(a);
}
@GetMapping (value="getmaxsalary")
public int max() {
	return es.max();
}
@GetMapping (value="getobjectmaxsalary")
public Employee object() {
	return es.object();
}
@GetMapping (value="secondmax")
public int secondmax() {
	return es.secondmax();
}
@GetMapping (value="secondobject")
public Employee secondobject() {
	return es.secondobject();
}
@GetMapping (value="brand")
public List<String> name() {
	return es.name();
}
@GetMapping (value="getname/{a}")
public List<Employee>name(@PathVariable String a){
	return es.name(a);
}
@GetMapping (value="salary/{a}/{b}")
public List<Employee>salaryy(@PathVariable int a,@PathVariable int b){
	return es.salaryy(a,b);
}
@GetMapping (value="even")
public List<String>evenn(){
	return es.evenn();
}
@GetMapping (value="minsalary")
public int min(){
	return es.min();
}
@GetMapping (value="salarysum")
public int sum() {
	return es.sum();
}
@GetMapping (value="all")
public List<Employee> get(){
	return es.get();
	
}
}
