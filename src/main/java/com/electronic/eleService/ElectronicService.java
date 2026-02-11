package com.electronic.eleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronic.eleDao.ElectronicDao;
import com.electronic.eleEntity.Electronic;

@Service
public class ElectronicService {
@Autowired
ElectronicDao bb;
public String single(Electronic e) {
	return bb.single(e);
}
public String multiple(List <Electronic> e) {
	return bb.multiple(e);
}
public Electronic get1(int a) {
	return bb.get1(a);
}

public List<Electronic>getall(){
	return bb.getall();
}
public String update(Electronic e,int a) {
	return bb.update(e,a);
}
public String patch(Electronic e,int a) {
	return bb.patch(e,a);
}
public String delete() {
	return bb.delete();
}
}
