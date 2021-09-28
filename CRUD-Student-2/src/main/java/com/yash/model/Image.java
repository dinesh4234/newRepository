package com.yash.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Image {

	@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String name;
 private String type;
// @Lob
 private long data;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public long getData() {
	return data;
}
public void setData(long data) {
	this.data = data;
}

}




