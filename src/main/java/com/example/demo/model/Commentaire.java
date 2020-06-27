package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commentaire {
@Id 
private String idComm;
@Column(length = 1000000)
private String desciptionComm;
private String idTicket;
private String auteur;
private Date dateComm;

public Date getDateComm() {
	return dateComm;
}
public void setDateComm(Date dateComm) {
	this.dateComm = dateComm;
}


public Commentaire(String idComm, String desciptionComm, String idTicket, String auteur, Date dateComm) {
	super();
	this.idComm = idComm;
	this.desciptionComm = desciptionComm;
	this.idTicket = idTicket;
	this.auteur = auteur;
	this.dateComm = dateComm;
}
@Override
public String toString() {
	return "Commentaire [idComm=" + idComm + ", desciptionComm=" + desciptionComm + ", idTicket=" + idTicket
			+ ", auteur=" + auteur + ", dateComm=" + dateComm + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
	result = prime * result + ((desciptionComm == null) ? 0 : desciptionComm.hashCode());
	result = prime * result + ((idComm == null) ? 0 : idComm.hashCode());
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
	Commentaire other = (Commentaire) obj;
	if (auteur == null) {
		if (other.auteur != null)
			return false;
	} else if (!auteur.equals(other.auteur))
		return false;
	if (desciptionComm == null) {
		if (other.desciptionComm != null)
			return false;
	} else if (!desciptionComm.equals(other.desciptionComm))
		return false;
	if (idComm == null) {
		if (other.idComm != null)
			return false;
	} else if (!idComm.equals(other.idComm))
		return false;
	if (idTicket == null) {
		if (other.idTicket != null)
			return false;
	} else if (!idTicket.equals(other.idTicket))
		return false;
	return true;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}

public String getIdComm() {
	return idComm;
}
public void setIdComm(String idComm) {
	this.idComm = idComm;
}
public String getDesciptionComm() {
	return desciptionComm;
}
public void setDesciptionComm(String desciptionComm) {
	this.desciptionComm = desciptionComm;
}


public String getIdTicket() {
	return idTicket;
}
public void setIdTicket(String idTicket) {
	this.idTicket = idTicket;
}
public Commentaire() {
	
}
}
