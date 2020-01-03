package org.sambasoft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vehicule")
public class Vehicule implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "imat_vehicule")
    private String imat_vehicule;
	@Column(name = "date_circulation")
    private String date_circulation;
	@Column(name = "marque")
    private String marque;
	@Column(name = "model")
    private String model;
	

	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getImat_vehicule() {
		return imat_vehicule;
	}



	public void setImat_vehicule(String imat_vehicule) {
		this.imat_vehicule = imat_vehicule;
	}



	public String getDate_circulation() {
		return date_circulation;
	}



	public void setDate_circulation(String date_circulation) {
		this.date_circulation = date_circulation;
	}



	public String getMarque() {
		return marque;
	}



	public void setMarque(String marque) {
		this.marque = marque;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}

	


	public Vehicule(Long id, String imat_vehicule, String date_circulation, String marque, String model) {
		super();
		this.id = id;
		this.imat_vehicule = imat_vehicule;
		this.date_circulation = date_circulation;
		this.marque = marque;
		this.model = model;
	}

	

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", imat_vehicule=" + imat_vehicule + ", date_circulation=" + date_circulation
				+ ", marque=" + marque + ", model=" + model + "]";
	}



	public Vehicule() {
		super();
	}


}
