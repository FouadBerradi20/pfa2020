package org.sambasoft.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class Personne implements Serializable

{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String nom;
	@OneToMany(mappedBy = "personne",fetch=FetchType.EAGER)
	private List<Commande> commandes;
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", commandes=" + commandes + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	public Personne(Long id, String nom, List<Commande> commandes) {
		super();
		this.id = id;
		this.nom = nom;
		this.commandes = commandes;
	}
	public Personne() {
		super();
	}
	
	
	

}
