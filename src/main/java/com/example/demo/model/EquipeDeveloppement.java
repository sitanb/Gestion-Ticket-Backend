package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EquipeDeveloppement {
@Id
private String codeEquipe;
private String nomEquipe;
private Date dateCreation;

public EquipeDeveloppement(String codeEquipe, String nomEquipe, Date dateCreation) {
	super();
	this.codeEquipe = codeEquipe;
	this.nomEquipe = nomEquipe;
	this.dateCreation = dateCreation;
}



@Override
public String toString() {
	return "EquipeDeveloppement [codeEquipe=" + codeEquipe + ", nomEquipe=" + nomEquipe + ", dateCreation="
			+ dateCreation + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codeEquipe == null) ? 0 : codeEquipe.hashCode());
	result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
	result = prime * result + ((nomEquipe == null) ? 0 : nomEquipe.hashCode());
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
	EquipeDeveloppement other = (EquipeDeveloppement) obj;
	if (codeEquipe == null) {
		if (other.codeEquipe != null)
			return false;
	} else if (!codeEquipe.equals(other.codeEquipe))
		return false;
	if (dateCreation == null) {
		if (other.dateCreation != null)
			return false;
	} else if (!dateCreation.equals(other.dateCreation))
		return false;
	if (nomEquipe == null) {
		if (other.nomEquipe != null)
			return false;
	} else if (!nomEquipe.equals(other.nomEquipe))
		return false;
	return true;
}



public String getCodeEquipe() {
	return codeEquipe;
}



public void setCodeEquipe(String codeEquipe) {
	this.codeEquipe = codeEquipe;
}



public String getNomEquipe() {
	return nomEquipe;
}



public void setNomEquipe(String nomEquipe) {
	this.nomEquipe = nomEquipe;
}



public Date getDateCreation() {
	return dateCreation;
}



public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}



public EquipeDeveloppement(){
	
}
}
