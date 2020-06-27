
 package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.Id;

 @Entity
 
 public class Utilisateur {
	 @Id
	 private String nomUtil;
	 private String nom;
	 private String prenom;
	 private String email;
	 private String motPass;
	 private String groupe;
	 private String idAss;

	
	public Utilisateur() {
		
	}


	public String getNomUtil() {
		return nomUtil;
	}


	public void setNomUtil(String nomUtil) {
		this.nomUtil = nomUtil;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMotPass() {
		return motPass;
	}


	public void setMotPass(String motPass) {
		this.motPass = motPass;
	}


	public String getGroupe() {
		return groupe;
	}


	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}


	


	public String getIdAss() {
		return idAss;
	}


	public void setIdAss(String idAss) {
		this.idAss = idAss;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((groupe == null) ? 0 : groupe.hashCode());
		result = prime * result + ((idAss == null) ? 0 : idAss.hashCode());
		result = prime * result + ((motPass == null) ? 0 : motPass.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((nomUtil == null) ? 0 : nomUtil.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (groupe == null) {
			if (other.groupe != null)
				return false;
		} else if (!groupe.equals(other.groupe))
			return false;
		if (idAss == null) {
			if (other.idAss != null)
				return false;
		} else if (!idAss.equals(other.idAss))
			return false;
		if (motPass == null) {
			if (other.motPass != null)
				return false;
		} else if (!motPass.equals(other.motPass))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (nomUtil == null) {
			if (other.nomUtil != null)
				return false;
		} else if (!nomUtil.equals(other.nomUtil))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Utilisateur [nomUtil=" + nomUtil + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", motPass=" + motPass + ", groupe=" + groupe + ", idAss=" + idAss + "]";
	}


	public Utilisateur(String nomUtil, String nom, String prenom, String email, String motPass, String groupe,
			String idAss) {
		super();
		this.nomUtil = nomUtil;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motPass = motPass;
		this.groupe = groupe;
		this.idAss = idAss;
	}


	


	
	
	 
	 
 }
 