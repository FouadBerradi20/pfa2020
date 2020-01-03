package org.sambasoft.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trajet")
public class Trajet implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "Date")
    private String Date;
	@Column(name = "Destination")
    private String Destination;
	@Column(name = "Poids")
    private String Poids;
	@Column(name = "Marchandise")
    private String Marchandise;
	@Column(name = "Vehicule")
    private String Vehicule;
	@Column(name = "Nbre_voyage")
    private String Nbre_voyage;
	@Column(name = "Employe")
    private String Employe;
	@Column(name = "Montant")
    private String Montant;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getPoids() {
		return Poids;
	}
	public void setPoids(String poids) {
		Poids = poids;
	}
	public String getMarchandise() {
		return Marchandise;
	}
	public void setMarchandise(String marchandise) {
		Marchandise = marchandise;
	}
	public String getVehicule() {
		return Vehicule;
	}
	public void setVehicule(String vehicule) {
		Vehicule = vehicule;
	}
	public String getNbre_voyage() {
		return Nbre_voyage;
	}
	public void setNbre_voyage(String nbre_voyage) {
		Nbre_voyage = nbre_voyage;
	}
	public String getEmploye() {
		return Employe;
	}
	public void setEmploye(String employe) {
		Employe = employe;
	}
	public String getMontant() {
		return Montant;
	}
	public void setMontant(String montant) {
		Montant = montant;
	}
	@Override
	public String toString() {
		return "Trajet [id=" + id + ", date=" + Date + ", destination=" + Destination + ", poids=" + Poids
				+ ", marchandise=" + Marchandise + ", vehicule=" + Vehicule + ", nbre_voyage=" + Nbre_voyage
				+ ", employe=" + Employe + ", montant=" + Montant + "]";
	}
	public Trajet(Long id, String date, String destination, String poids, String marchandise, String vehicule,
			String nbre_voyage, String employe, String montant) {
		super();
		this.id = id;
		Date = date;
		Destination = destination;
		Poids = poids;
		Marchandise = marchandise;
		Vehicule = vehicule;
		Nbre_voyage = nbre_voyage;
		Employe = employe;
		Montant = montant;
	}
	public Trajet() {
		super();
	}

	
	
}
