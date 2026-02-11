package com.electronic.eleDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronic.eleEntity.Electronic;
import com.electronic.eleRepository.ElectronicRepository;

@Repository
public class ElectronicDao {
@Autowired
ElectronicRepository cc;
public String single(Electronic e) {
	cc.save(e);
	return "save successfully";
}
public String multiple(List<Electronic> e) {
	cc.saveAll(e);
	return "All Save Successfully";
}
public Electronic get1(int a) {
	Electronic x=cc.findById(a).get();
	return x;
}
public List<Electronic>getall() {
	List<Electronic>a=cc.findAll();
	return a;
}
public String update(Electronic e,int a) {
	Electronic x=cc.findById(a).get();
	x.setName(e.getName());
	x.setColor(e.getColor());
	x.setPrice(e.getPrice());
	x.setWarranty(e.getWarranty());
	cc.save(x);
	return "save successfully";
}
public String patch(Electronic e,int a) {
	Electronic x=cc.findById(a).get();
	x.setColor(e.getColor());
	cc.save(x);
	return "one value successfully";
}
public String delete() {
	cc.deleteAll();
	return "Delete All";
}
}
