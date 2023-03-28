package org.sid.entitie;



import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "User")
public class User {
	
	@Id @GeneratedValue
	private Long idUser;
	private String nomUser;
	private String numeroTel;
	private String email;
	@ManyToOne
	@JoinColumn(name = "idRole")
	private Role role;
	@OneToMany(targetEntity = Service.class, fetch = FetchType.LAZY /*,mappedBy = "user"*/)
	private Collection<Service> servises;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Role role, String nomUser, String numeroTel, String email) {
		super();
		this.role=role;
		this.nomUser = nomUser;
		this.numeroTel = numeroTel;
		this.email = email;
	}


	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getNomUser() {
		return nomUser;
	}


	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}


	public String getNumeroTel() {
		return numeroTel;
	}


	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	


}
