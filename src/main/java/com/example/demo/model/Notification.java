package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CleNotification.class)
public class Notification implements Serializable {
@Id
private String idAss;
@Id
private String codeProjet;
private String descriptionNotification;
private String etatNotification;


public Notification(String idAss, String codeProjet, String descriptionNotification, String etatNotification) {
	super();
	this.idAss = idAss;
	this.codeProjet = codeProjet;
	this.descriptionNotification = descriptionNotification;
	this.etatNotification = etatNotification;
}




@Override
public String toString() {
	return "Notification [idAss=" + idAss + ", codeProjet=" + codeProjet + ", descriptionNotification="
			+ descriptionNotification + ", etatNotification=" + etatNotification + "]";
}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codeProjet == null) ? 0 : codeProjet.hashCode());
	result = prime * result + ((descriptionNotification == null) ? 0 : descriptionNotification.hashCode());
	result = prime * result + ((etatNotification == null) ? 0 : etatNotification.hashCode());
	result = prime * result + ((idAss == null) ? 0 : idAss.hashCode());
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
	Notification other = (Notification) obj;
	if (codeProjet == null) {
		if (other.codeProjet != null)
			return false;
	} else if (!codeProjet.equals(other.codeProjet))
		return false;
	if (descriptionNotification == null) {
		if (other.descriptionNotification != null)
			return false;
	} else if (!descriptionNotification.equals(other.descriptionNotification))
		return false;
	if (etatNotification == null) {
		if (other.etatNotification != null)
			return false;
	} else if (!etatNotification.equals(other.etatNotification))
		return false;
	if (idAss == null) {
		if (other.idAss != null)
			return false;
	} else if (!idAss.equals(other.idAss))
		return false;
	return true;
}




public String getIdAss() {
	return idAss;
}




public void setIdAss(String idAss) {
	this.idAss = idAss;
}




public String getCodeProjet() {
	return codeProjet;
}




public void setCodeProjet(String codeProjet) {
	this.codeProjet = codeProjet;
}




public String getDescriptionNotification() {
	return descriptionNotification;
}




public void setDescriptionNotification(String descriptionNotification) {
	this.descriptionNotification = descriptionNotification;
}




public String getEtatNotification() {
	return etatNotification;
}




public void setEtatNotification(String etatNotification) {
	this.etatNotification = etatNotification;
}




public Notification() {
	
}
}
