package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CleDevEquipe.class)
public class DevEquipe implements Serializable {
@Id
private String codeEquipe;
@Id
private String idDev;

public DevEquipe(String codeEquipe, String idDev) {
	super();
	this.codeEquipe = codeEquipe;
	this.idDev = idDev;
}

@Override
public String toString() {
	return "DevEquipe [codeEquipe=" + codeEquipe + ", idDev=" + idDev + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codeEquipe == null) ? 0 : codeEquipe.hashCode());
	result = prime * result + ((idDev == null) ? 0 : idDev.hashCode());
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
	DevEquipe other = (DevEquipe) obj;
	if (codeEquipe == null) {
		if (other.codeEquipe != null)
			return false;
	} else if (!codeEquipe.equals(other.codeEquipe))
		return false;
	if (idDev == null) {
		if (other.idDev != null)
			return false;
	} else if (!idDev.equals(other.idDev))
		return false;
	return true;
}

public String getCodeEquipe() {
	return codeEquipe;
}

public void setCodeEquipe(String codeEquipe) {
	this.codeEquipe = codeEquipe;
}

public String getIdDev() {
	return idDev;
}

public void setIdDev(String idDev) {
	this.idDev = idDev;
}

public DevEquipe() {}

}
