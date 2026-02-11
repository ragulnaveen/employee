package com.electronic.eleEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="ElectronicDetails")
public class Electronic {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String color;
private int price;
private float warranty;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public float getWarranty() {
	return warranty;
}
public void setWarranty(float warranty) {
	this.warranty = warranty;
}
@Override
public String toString() {
	return "Electronic [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", warranty="
			+ warranty + "]";
}

}
