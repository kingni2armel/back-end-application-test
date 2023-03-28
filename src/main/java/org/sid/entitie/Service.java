package org.sid.entitie;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Service {
	
	@Id @GeneratedValue
	private Long idService ;
	private String nomService;
	private String detailService ;
	private double prixService;
	private String photoService;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCat")
	private Categorie categorie;
	
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Service(String nomService, String detailService, double prixService, String photoService, Categorie categorie) {
		super();
		this.nomService = nomService;
		this.detailService = detailService;
		this.prixService = prixService;
		this.photoService = photoService;
		this.categorie= categorie;
	}


	public Long getIdService() {
		return idService;
	}


	public void setIdService(Long idService) {
		this.idService = idService;
	}


	public String getNomService() {
		return nomService;
	}


	public void setNomService(String nomService) {
		this.nomService = nomService;
	}


	public String getDetailService() {
		return detailService;
	}


	public void setDetailService(String detailService) {
		this.detailService = detailService;
	}


	public double getPrixService() {
		return prixService;
	}


	public void setPrixService(double prixService) {
		this.prixService = prixService;
	}


	public String getPhotoService() {
		return photoService;
	}


	public void setPhotoService(String photoService) {
		this.photoService = photoService;
	}
	

}
