package org.sid.entitie;




import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;







@Entity
public class Role {
	@Id @GeneratedValue
	private Long idRole;
	private String NomRole;
	@OneToMany(mappedBy = "role")
	private Collection<User> users;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String nomRole) {
		super();
		NomRole = nomRole;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getNomRole() {
		return NomRole;
	}

	public void setNomRole(String nomRole) {
		NomRole = nomRole;
	}
	
	
	
	
	
	

}
