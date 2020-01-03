package org.sambasoft.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reclamation")
public class Reclamation {
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String raison_reclamation;
    private String date_reclamation;
    private String commentaire;
    @OneToMany(mappedBy = "reclamation",fetch=FetchType.EAGER)
	private List<Colis> coliss;
	
    
	

}
