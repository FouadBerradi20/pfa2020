package org.sambasoft.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Colis implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private int poids;
	private int dimension;
	private String assurance;
	private String codebarre;
	private String adresse;
	private String etat;
	private String date_changement;
	@ManyToOne
	private Demande demande;
	@ManyToOne
	private Reclamation reclamation;

}
