package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projet {
@Id
private String codeProjet;
private String idTicket;
private Date dateDebutprojet;
private Date dateFinProjet;
private String code;
private String idAss;
private String etatProjet;

public Projet(String codeProjet, String idTicket, Date dateDebutprojet, Date dateFinProjet, String code, String idAss,
		String etatProjet) {
	super();
	this.codeProjet = codeProjet;
	this.idTicket = idTicket;
	this.dateDebutprojet = dateDebutprojet;
	this.dateFinProjet = dateFinProjet;
	this.code = code;
	this.idAss = idAss;
	this.etatProjet = etatProjet;
}



@Override
public String toString() {
	return "Projet [codeProjet=" + codeProjet + ", idTicket=" + idTicket + ", dateDebutprojet=" + dateDebutprojet
			+ ", dateFinProjet=" + dateFinProjet + ", code=" + code + ", idAss=" + idAss + ", etatProjet=" + etatProjet
			+ "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((code == null) ? 0 : code.hashCode());
	result = prime * result + ((codeProjet == null) ? 0 : codeProjet.hashCode());
	result = prime * result + ((dateDebutprojet == null) ? 0 : dateDebutprojet.hashCode());
	result = prime * result + ((dateFinProjet == null) ? 0 : dateFinProjet.hashCode());
	result = prime * result + ((etatProjet == null) ? 0 : etatProjet.hashCode());
	result = prime * result + ((idAss == null) ? 0 : idAss.hashCode());
	result = prime * result + ((idTicket == null) ? 0 : idTicket.hashCode());
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
	Projet other = (Projet) obj;
	if (code == null) {
		if (other.code != null)
			return false;
	} else if (!code.equals(other.code))
		return false;
	if (codeProjet == null) {
		if (other.codeProjet != null)
			return false;
	} else if (!codeProjet.equals(other.codeProjet))
		return false;
	if (dateDebutprojet == null) {
		if (other.dateDebutprojet != null)
			return false;
	} else if (!dateDebutprojet.equals(other.dateDebutprojet))
		return false;
	if (dateFinProjet == null) {
		if (other.dateFinProjet != null)
			return false;
	} else if (!dateFinProjet.equals(other.dateFinProjet))
		return false;
	if (etatProjet == null) {
		if (other.etatProjet != null)
			return false;
	} else if (!etatProjet.equals(other.etatProjet))
		return false;
	if (idAss == null) {
		if (other.idAss != null)
			return false;
	} else if (!idAss.equals(other.idAss))
		return false;
	if (idTicket == null) {
		if (other.idTicket != null)
			return false;
	} else if (!idTicket.equals(other.idTicket))
		return false;
	return true;
}



public String getCodeProjet() {
	return codeProjet;
}



public void setCodeProjet(String codeProjet) {
	this.codeProjet = codeProjet;
}



public String getIdTicket() {
	return idTicket;
}



public void setIdTicket(String idTicket) {
	this.idTicket = idTicket;
}



public Date getDateDebutprojet() {
	return dateDebutprojet;
}



public void setDateDebutprojet(Date dateDebutprojet) {
	this.dateDebutprojet = dateDebutprojet;
}



public Date getDateFinProjet() {
	return dateFinProjet;
}



public void setDateFinProjet(Date dateFinProjet) {
	this.dateFinProjet = dateFinProjet;
}



public String getCode() {
	return code;
}



public void setCode(String code) {
	this.code = code;
}



public String getIdAss() {
	return idAss;
}



public void setIdAss(String idAss) {
	this.idAss = idAss;
}



public String getEtatProjet() {
	return etatProjet;
}



public void setEtatProjet(String etatProjet) {
	this.etatProjet = etatProjet;
}



public Projet() {
	
}

}
