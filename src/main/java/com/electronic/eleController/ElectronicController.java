package com.electronic.eleController;

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

import com.electronic.eleEntity.Electronic;
import com.electronic.eleService.ElectronicService;

@RestController
public class ElectronicController {
@Autowired
ElectronicService aa;
@PostMapping (value="singledata")
public String single(@RequestBody Electronic e) {
	return aa.single(e);
}
@PostMapping (value="multiple")
public String multiple(@RequestBody List<Electronic> e) {
	return aa.multiple(e);
}
@GetMapping (value="get/{a}")
public Electronic get1(@PathVariable int a) {
	return aa.get1(a);
}
@GetMapping (value="getall")
public List<Electronic>getall(){
	return aa.getall();
}
@PutMapping (value="update/{a}")
public String update(@RequestBody Electronic e,@PathVariable int a) {
	return aa.update(e,a);
}
@PatchMapping (value="patch/{a}")
public String patch(@RequestBody Electronic e,@PathVariable int a) {
	return aa.patch(e,a);
}
@DeleteMapping (value="deleteall")
public String delete(){
	return aa.delete();
}
}
