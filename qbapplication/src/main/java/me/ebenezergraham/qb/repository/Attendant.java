package me.ebenezergraham.qb.repository;
/*
ebenezergraham created on 2/1/19
*/


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Attendant {
	
	private @Id
	@GeneratedValue
	Long id;
	private String name;
	private String role;
	
	public Attendant(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
}
