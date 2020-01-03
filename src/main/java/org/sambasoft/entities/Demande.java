package org.sambasoft.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Demande implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String date;
	private String type;
	@ManyToOne
	private Entreprise entreprise;
	@ManyToOne
	private Individue individue;
	@OneToMany(mappedBy = "demande",fetch=FetchType.EAGER)
	private List<Colis> coliss;

}
