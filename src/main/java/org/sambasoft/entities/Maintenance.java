package org.sambasoft.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maintenance")
public class Maintenance implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "type")
    private String type;
	@Column(name = "date")
    private String date;
	@Column(name = "montant")
    private String montant;
	@Column(name = "vehicule")
    private String vehicule;
	@Column(name = "employe")
    private String employe;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMontant() {
		return montant;
	}
	public void setMontant(String montant) {
		this.montant = montant;
	}
	public String getVehicule() {
		return vehicule;
	}
	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}
	public String getEmploye() {
		return employe;
	}
	public void setEmploye(String employe) {
		this.employe = employe;
	}
	@Override
	public String toString() {
		return "Maintenance [id=" + id + ", type=" + type + ", date=" + date + ", montant=" + montant + ", vehicule="
				+ vehicule + ", employe=" + employe + "]";
	}
	public Maintenance(Long id, String type, String date, String montant, String vehicule, String employe) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.montant = montant;
		this.vehicule = vehicule;
		this.employe = employe;
	}
	public Maintenance() {
		super();
	}
	
	

}
