package org.sambasoft.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Individue implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String email;
	private String adresse;
	private String cin;
	private String nom;
	private String prenom;
	private String tel;
	@OneToMany(mappedBy = "individue",fetch=FetchType.EAGER)
	private List<Demande> demandes;
	

}
