package org.sambasoft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client  implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "Nom")
    private String Nom;
	@Column(name = "Adresse")
    private String Adresse;
	@Column(name = "Tel")
    private String Tel;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", Nom=" + Nom + ", Adresse=" + Adresse + ", Tel=" + Tel + "]";
	}
	
	
	public Client(Long id, String nom, String adresse, String tel) {
		super();
		this.id = id;
		Nom = nom;
		Adresse = adresse;
		Tel = tel;
	}
	
	
	public Client() {
		super();
	}

}
