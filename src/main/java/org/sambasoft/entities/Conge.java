package org.sambasoft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "conge")
public class Conge implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "empnom")
    private String empnom;
	@Column(name = "datedeb")
    private String datedeb;
	@Column(name = "datefin")
    private String datefin;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpnom() {
		return empnom;
	}
	public void setEmpnom(String empnom) {
		this.empnom = empnom;
	}
	public String getDatedeb() {
		return datedeb;
	}
	public void setDatedeb(String datedeb) {
		this.datedeb = datedeb;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	
	
	@Override
	public String toString() {
		return "Conge [id=" + id + ", empnom=" + empnom + ", datedeb=" + datedeb + ", datefin=" + datefin + "]";
	}
	
	
	public Conge(Long id, String empnom, String datedeb, String datefin) {
		super();
		this.id = id;
		this.empnom = empnom;
		this.datedeb = datedeb;
		this.datefin = datefin;
	}
	
	public Conge() {
		super();
	}
	
		
	
}
