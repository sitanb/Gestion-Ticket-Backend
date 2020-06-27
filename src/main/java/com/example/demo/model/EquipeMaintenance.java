package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EquipeMaintenance {
	@Id
private String code;
private String nomEquipeMain;
private Date dateConstitution;
private String chef;


public EquipeMaintenance(String code, String nomEquipeMain, Date dateConstitution, String chef) {
	super();
	this.code = code;
	this.nomEquipeMain = nomEquipeMain;
	this.dateConstitution = dateConstitution;
	this.chef = chef;
}


@Override
public String toString() {
	return "EquipeMaintenance [code=" + code + ", nomEquipeMain=" + nomEquipeMain + ", dateConstitution="
			+ dateConstitution + ", chef=" + chef + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((chef == null) ? 0 : chef.hashCode());
	result = prime * result + ((code == null) ? 0 : code.hashCode());
	result = prime * result + ((dateConstitution == null) ? 0 : dateConstitution.hashCode());
	result = prime * result + ((nomEquipeMain == null) ? 0 : nomEquipeMain.hashCode());
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
	EquipeMaintenance other = (EquipeMaintenance) obj;
	if (chef == null) {
		if (other.chef != null)
			return false;
	} else if (!chef.equals(other.chef))
		return false;
	if (code == null) {
		if (other.code != null)
			return false;
	} else if (!code.equals(other.code))
		return false;
	if (dateConstitution == null) {
		if (other.dateConstitution != null)
			return false;
	} else if (!dateConstitution.equals(other.dateConstitution))
		return false;
	if (nomEquipeMain == null) {
		if (other.nomEquipeMain != null)
			return false;
	} else if (!nomEquipeMain.equals(other.nomEquipeMain))
		return false;
	return true;
}


public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public String getNomEquipeMain() {
	return nomEquipeMain;
}


public void setNomEquipeMain(String nomEquipeMain) {
	this.nomEquipeMain = nomEquipeMain;
}


public Date getDateConstitution() {
	return dateConstitution;
}


public void setDateConstitution(Date dateConstitution) {
	this.dateConstitution = dateConstitution;
}


public String getChef() {
	return chef;
}


public void setChef(String chef) {
	this.chef = chef;
}


public EquipeMaintenance() {
	
}
}
