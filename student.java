package com.klu.jfsd_hql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	@Id
	int id;
	String name;
	String location;
	String Hodname;
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
	public String getlocation() {
		return name;
	}
	public void setlocation(String location) {
		this.location = location;
	}
	public String getHodname() {
		return Hodname;
	}
	public void setHodname(String Hodname) {
		this.Hodname = Hodname;
	}

}
