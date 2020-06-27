package com.example.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class AssistantTechnique {
@Id 
private String idAss;

private String adresseAss;
private String emailAss;
private String nomAss;
private String prenomAss;
private String telAss;
private String chef;


public AssistantTechnique(String idAss, String adresseAss, String emailAss, String nomAss, String prenomAss,
		String telAss, String chef) {
	super();
	this.idAss = idAss;
	this.adresseAss = adresseAss;
	this.emailAss = emailAss;
	this.nomAss = nomAss;
	this.prenomAss = prenomAss;
	this.telAss = telAss;
	this.chef = chef;
}



@Override
public String toString() {
	return "AssistantTechnique [idAss=" + idAss + ", adresseAss=" + adresseAss + ", emailAss=" + emailAss + ", nomAss="
			+ nomAss + ", prenomAss=" + prenomAss + ", telAss=" + telAss + ", chef=" + chef + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adresseAss == null) ? 0 : adresseAss.hashCode());
	result = prime * result + ((chef == null) ? 0 : chef.hashCode());
	result = prime * result + ((emailAss == null) ? 0 : emailAss.hashCode());
	result = prime * result + ((idAss == null) ? 0 : idAss.hashCode());
	result = prime * result + ((nomAss == null) ? 0 : nomAss.hashCode());
	result = prime * result + ((prenomAss == null) ? 0 : prenomAss.hashCode());
	result = prime * result + ((telAss == null) ? 0 : telAss.hashCode());
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
	AssistantTechnique other = (AssistantTechnique) obj;
	if (adresseAss == null) {
		if (other.adresseAss != null)
			return false;
	} else if (!adresseAss.equals(other.adresseAss))
		return false;
	if (chef == null) {
		if (other.chef != null)
			return false;
	} else if (!chef.equals(other.chef))
		return false;
	if (emailAss == null) {
		if (other.emailAss != null)
			return false;
	} else if (!emailAss.equals(other.emailAss))
		return false;
	if (idAss == null) {
		if (other.idAss != null)
			return false;
	} else if (!idAss.equals(other.idAss))
		return false;
	if (nomAss == null) {
		if (other.nomAss != null)
			return false;
	} else if (!nomAss.equals(other.nomAss))
		return false;
	if (prenomAss == null) {
		if (other.prenomAss != null)
			return false;
	} else if (!prenomAss.equals(other.prenomAss))
		return false;
	if (telAss == null) {
		if (other.telAss != null)
			return false;
	} else if (!telAss.equals(other.telAss))
		return false;
	return true;
}






public String getIdAss() {
	return idAss;
}



public void setIdAss(String idAss) {
	this.idAss = idAss;
}



public String getAdresseAss() {
	return adresseAss;
}



public void setAdresseAss(String adresseAss) {
	this.adresseAss = adresseAss;
}



public String getEmailAss() {
	return emailAss;
}



public void setEmailAss(String emailAss) {
	this.emailAss = emailAss;
}



public String getNomAss() {
	return nomAss;
}



public void setNomAss(String nomAss) {
	this.nomAss = nomAss;
}



public String getPrenomAss() {
	return prenomAss;
}



public void setPrenomAss(String prenomAss) {
	this.prenomAss = prenomAss;
}



public String getTelAss() {
	return telAss;
}



public void setTelAss(String telAss) {
	this.telAss = telAss;
}



public String getChef() {
	return chef;
}



public void setChef(String chef) {
	this.chef = chef;
}



public AssistantTechnique() {
	
}
}
