package org.sambasoft.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "incident")
public class Incident implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "vehicule")
    private String vehicule;
	@Column(name = "date")
    private String date;
	@Column(name = "employe")
    private String employe;
	@Column(name = "details")
    private String details;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVehicule() {
		return vehicule;
	}
	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmploye() {
		return employe;
	}
	public void setEmploye(String employe) {
		this.employe = employe;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Incident [id=" + id + ", Vehicule=" + vehicule + ", Date=" + date + ", Employe=" + employe
				+ ", Details=" + details + "]";
	}
	public Incident(Long id, String vehicule, String date, String employe, String details) {
		super();
		this.id = id;
		this.vehicule = vehicule;
		this.date = date;
		this.employe = employe;
		this.details = details;
	}
	public Incident() {
		super();
	}

	

}
