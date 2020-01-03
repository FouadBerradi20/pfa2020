package org.sambasoft.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private int quantite;
	@ManyToOne
	private Personne personne;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Commande(Long id, int quantite, Personne personne) {
		super();
		this.id = id;
		this.quantite = quantite;
		this.personne = personne;
	}
	public Commande() {
		super();
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", quantite=" + quantite + ", personne=" + personne + "]";
	}
	
	
	
	
}
