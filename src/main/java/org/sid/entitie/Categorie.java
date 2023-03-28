package org.sid.entitie;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categorie {

	@Id @GeneratedValue
	private Long idCat;
	private String nomCat;
	@OneToMany(mappedBy ="categorie", fetch = FetchType.LAZY )
	private Collection<Service> services;
	
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Categorie(String nomCat) {
		super();
		this.nomCat = nomCat;
	}


	public Long getIdCat() {
		return idCat;
	}


	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}


	public String getNomCat() {
		return nomCat;
	}


	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	
	
	
}
