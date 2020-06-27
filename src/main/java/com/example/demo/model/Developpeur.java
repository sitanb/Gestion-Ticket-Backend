package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developpeur {
@Id  
private String idDev;
private String adresseDev;
private String emailDev;
private Date dateEmbauche;
private String nomDev;
private String roleDev;
private String specialiteDev;
private String telephoneDev;
private String idAss;



public Developpeur(String idDev, String adresseDev, String emailDev, Date dateEmbauche, String nomDev, String roleDev,
		String specialiteDev, String telephoneDev, String idAss) {
	super();
	this.idDev = idDev;
	this.adresseDev = adresseDev;
	this.emailDev = emailDev;
	this.dateEmbauche = dateEmbauche;
	this.nomDev = nomDev;
	this.roleDev = roleDev;
	this.specialiteDev = specialiteDev;
	this.telephoneDev = telephoneDev;
	this.idAss = idAss;
}

@Override
public String toString() {
	return "Developpeur [idDev=" + idDev + ", adresseDev=" + adresseDev + ", emailDev=" + emailDev + ", dateEmbauche="
			+ dateEmbauche + ", nomDev=" + nomDev + ", roleDev=" + roleDev + ", specialiteDev=" + specialiteDev
			+ ", telephoneDev=" + telephoneDev + ", idAss=" + idAss + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adresseDev == null) ? 0 : adresseDev.hashCode());
	result = prime * result + ((dateEmbauche == null) ? 0 : dateEmbauche.hashCode());
	result = prime * result + ((emailDev == null) ? 0 : emailDev.hashCode());
	result = prime * result + ((idAss == null) ? 0 : idAss.hashCode());
	result = prime * result + ((idDev == null) ? 0 : idDev.hashCode());
	result = prime * result + ((nomDev == null) ? 0 : nomDev.hashCode());
	result = prime * result + ((roleDev == null) ? 0 : roleDev.hashCode());
	result = prime * result + ((specialiteDev == null) ? 0 : specialiteDev.hashCode());
	result = prime * result + ((telephoneDev == null) ? 0 : telephoneDev.hashCode());
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
	Developpeur other = (Developpeur) obj;
	if (adresseDev == null) {
		if (other.adresseDev != null)
			return false;
	} else if (!adresseDev.equals(other.adresseDev))
		return false;
	if (dateEmbauche == null) {
		if (other.dateEmbauche != null)
			return false;
	} else if (!dateEmbauche.equals(other.dateEmbauche))
		return false;
	if (emailDev == null) {
		if (other.emailDev != null)
			return false;
	} else if (!emailDev.equals(other.emailDev))
		return false;
	if (idAss == null) {
		if (other.idAss != null)
			return false;
	} else if (!idAss.equals(other.idAss))
		return false;
	if (idDev == null) {
		if (other.idDev != null)
			return false;
	} else if (!idDev.equals(other.idDev))
		return false;
	if (nomDev == null) {
		if (other.nomDev != null)
			return false;
	} else if (!nomDev.equals(other.nomDev))
		return false;
	if (roleDev == null) {
		if (other.roleDev != null)
			return false;
	} else if (!roleDev.equals(other.roleDev))
		return false;
	if (specialiteDev == null) {
		if (other.specialiteDev != null)
			return false;
	} else if (!specialiteDev.equals(other.specialiteDev))
		return false;
	if (telephoneDev == null) {
		if (other.telephoneDev != null)
			return false;
	} else if (!telephoneDev.equals(other.telephoneDev))
		return false;
	return true;
}



public String getIdDev() {
	return idDev;
}



public void setIdDev(String idDev) {
	this.idDev = idDev;
}



public String getAdresseDev() {
	return adresseDev;
}



public void setAdresseDev(String adresseDev) {
	this.adresseDev = adresseDev;
}



public String getEmailDev() {
	return emailDev;
}



public void setEmailDev(String emailDev) {
	this.emailDev = emailDev;
}



public Date getDateEmbauche() {
	return dateEmbauche;
}



public void setDateEmbauche(Date dateEmbauche) {
	this.dateEmbauche = dateEmbauche;
}



public String getNomDev() {
	return nomDev;
}



public void setNomDev(String nomDev) {
	this.nomDev = nomDev;
}



public String getRoleDev() {
	return roleDev;
}



public void setRoleDev(String roleDev) {
	this.roleDev = roleDev;
}



public String getSpecialiteDev() {
	return specialiteDev;
}



public void setSpecialiteDev(String specialiteDev) {
	this.specialiteDev = specialiteDev;
}



public String getTelephoneDev() {
	return telephoneDev;
}



public void setTelephoneDev(String telephoneDev) {
	this.telephoneDev = telephoneDev;
}



public String getIdAss() {
	return idAss;
}



public void setIdAss(String idAss) {
	this.idAss = idAss;
}



public Developpeur() {
	
}
}
