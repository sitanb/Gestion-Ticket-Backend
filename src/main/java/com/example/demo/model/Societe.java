package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Societe {
	
@Id

private String raisonSoc;
private String adresseSoc;
private String emailSoc;
private String nomRes;
private String telephoneSoc;
public Societe() {
	
}
public String getRaisonSoc() {
	return raisonSoc;
}
public void setRaisonSoc(String raisonSoc) {
	this.raisonSoc = raisonSoc;
}
public String getAdresseSoc() {
	return adresseSoc;
}
public void setAdresseSoc(String adresseSoc) {
	this.adresseSoc = adresseSoc;
}
public String getEmailSoc() {
	return emailSoc;
}
public void setEmailSoc(String emailSoc) {
	this.emailSoc = emailSoc;
}
public String getNomRes() {
	return nomRes;
}
public void setNomRes(String nomRes) {
	this.nomRes = nomRes;
}
public String getTelephoneSoc() {
	return telephoneSoc;
}
public void setTelephoneSoc(String telephoneSoc) {
	this.telephoneSoc = telephoneSoc;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((adresseSoc == null) ? 0 : adresseSoc.hashCode());
	result = prime * result + ((emailSoc == null) ? 0 : emailSoc.hashCode());
	result = prime * result + ((nomRes == null) ? 0 : nomRes.hashCode());
	result = prime * result + ((raisonSoc == null) ? 0 : raisonSoc.hashCode());
	result = prime * result + ((telephoneSoc == null) ? 0 : telephoneSoc.hashCode());
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
	Societe other = (Societe) obj;
	if (adresseSoc == null) {
		if (other.adresseSoc != null)
			return false;
	} else if (!adresseSoc.equals(other.adresseSoc))
		return false;
	if (emailSoc == null) {
		if (other.emailSoc != null)
			return false;
	} else if (!emailSoc.equals(other.emailSoc))
		return false;
	if (nomRes == null) {
		if (other.nomRes != null)
			return false;
	} else if (!nomRes.equals(other.nomRes))
		return false;
	if (raisonSoc == null) {
		if (other.raisonSoc != null)
			return false;
	} else if (!raisonSoc.equals(other.raisonSoc))
		return false;
	if (telephoneSoc == null) {
		if (other.telephoneSoc != null)
			return false;
	} else if (!telephoneSoc.equals(other.telephoneSoc))
		return false;
	return true;
}
@Override
public String toString() {
	return "Societe [raisonSoc=" + raisonSoc + ", adresseSoc=" + adresseSoc + ", emailSoc=" + emailSoc + ", nomRes="
			+ nomRes + ", telephoneSoc=" + telephoneSoc + "]";
}
public Societe(String raisonSoc, String adresseSoc, String emailSoc, String nomRes, String telephoneSoc) {
	super();
	this.raisonSoc = raisonSoc;
	this.adresseSoc = adresseSoc;
	this.emailSoc = emailSoc;
	this.nomRes = nomRes;
	this.telephoneSoc = telephoneSoc;
}


}
