package org.sambasoft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employe")
public class Employe implements Serializable{
	
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "cin")
    private String cin;
	@Column(name = "npc")
    private String npc;
	@Column(name = "ncp")
    private String ncp;
	@Column(name = "nom")
    private String nom;
	@Column(name = "prenom")
    private String prenom;
	@Column(name = "date_emb")
    private String date_emb;
	@Column(name = "tel")
    private String tel;
	
    private String qrurl;
	
    
	
	
	public String getQrurl() {
		return qrurl;
	}
	public void setQrurl(String qrurl) {
		this.qrurl = qrurl;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNpc() {
		return npc;
	}
	public void setNpc(String npc) {
		this.npc = npc;
	}
	public String getNcp() {
		return ncp;
	}
	public void setNcp(String ncp) {
		this.ncp = ncp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_emb() {
		return date_emb;
	}
	public void setDate_emb(String date_emb) {
		this.date_emb = date_emb;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

	@Override
	public String toString() {
		return "Employe [id=" + id + ", cin=" + cin + ", npc=" + npc + ", ncp=" + ncp + ", nom=" + nom + ", prenom="
				+ prenom + ", date_emb=" + date_emb + ", tel=" + tel + "]";
	}
	
	public Employe() {
		super();
	}
	
	
	public Employe(Long id, String cin, String npc, String ncp, String nom, String prenom, String date_emb,
			String tel,String qrurl) {
		super();
		this.id = id;
		this.cin = cin;
		this.npc = npc;
		this.ncp = ncp;
		this.nom = nom;
		this.prenom = prenom;
		this.date_emb = date_emb;
		this.tel = tel;
		this.qrurl = qrurl;
	}
	  
}
