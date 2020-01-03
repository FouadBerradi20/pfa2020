package org.sambasoft.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Course implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String destination;
	private String date_depart;
	@ManyToOne
	private Livreur livreur;
}
