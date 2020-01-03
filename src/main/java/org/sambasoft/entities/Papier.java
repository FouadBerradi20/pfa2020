package org.sambasoft.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "papiers")
public class Papier implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "type")
    private String type;
	@Column(name = "date_payement")
    private String date_payement;
	@Column(name = "date_peremption")
    private String date_peremption;
	@Column(name = "nom_societe")
    private String nom_societe;
	@Column(name = "vehicule")
    private String vehicule;
	@Column(name = "montant")
    private String montant;
	
	
	
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
	public String getDate_payement() {
		return date_payement;
	}
	public void setDate_payement(String date_payement) {
		this.date_payement = date_payement;
	}
	public String getDate_peremption() {
		return date_peremption;
	}
	public void setDate_peremption(String date_peremption) {
		this.date_peremption = date_peremption;
	}
	public String getNom_societe() {
		return nom_societe;
	}
	public void setNom_societe(String nom_societe) {
		this.nom_societe = nom_societe;
	}
	
	@Override
	public String toString() {
		return "Papier [id=" + id + ", type=" + type + ", date_payement=" + date_payement + ", date_peremption="
				+ date_peremption + ", nom_societe=" + nom_societe + ", vehicule=" + vehicule + ", montant=" + montant
				+ "]";
	}
	public Papier(Long id, String type, String date_payement, String date_peremption, String nom_societe,
			String vehicule, String montant) {
		super();
		this.id = id;
		this.type = type;
		this.date_payement = date_payement;
		this.date_peremption = date_peremption;
		this.nom_societe = nom_societe;
		this.vehicule = vehicule;
		this.montant = montant;
	}
	public Papier() {
		super();
	}
	
	

}
