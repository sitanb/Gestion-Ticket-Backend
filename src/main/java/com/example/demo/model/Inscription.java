package com.example.demo.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Inscription {
	@Id
	private String nomUtil;
	
	private String nom;
	private String prenom;
	private String email;
	private Date dateInsc;
	private String etat;
	private String societe;
	private String telephone;
	public Inscription() {
		
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
	public Date getDateInsc() {
		return dateInsc;
	}
	public void setDateInsc(Date dateInsc) {
		this.dateInsc = dateInsc;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateInsc == null) ? 0 : dateInsc.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((nomUtil == null) ? 0 : nomUtil.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((societe == null) ? 0 : societe.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Inscription other = (Inscription) obj;
		if (dateInsc == null) {
			if (other.dateInsc != null)
				return false;
		} else if (!dateInsc.equals(other.dateInsc))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (etat == null) {
			if (other.etat != null)
				return false;
		} else if (!etat.equals(other.etat))
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
		if (societe == null) {
			if (other.societe != null)
				return false;
		} else if (!societe.equals(other.societe))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Inscription [nomUtil=" + nomUtil + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", dateInsc=" + dateInsc + ", etat=" + etat + ", societe=" + societe + ", telephone=" + telephone
				+ "]";
	}
	public Inscription(String nomUtil, String nom, String prenom, String email, Date dateInsc, String etat,
			String societe, String telephone) {
		super();
		this.nomUtil = nomUtil;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateInsc = dateInsc;
		this.etat = etat;
		this.societe = societe;
		this.telephone = telephone;
	}
		
}
