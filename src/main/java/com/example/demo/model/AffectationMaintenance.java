package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CleAssEquipe.class)
public class AffectationMaintenance {
@Id
private Long idAss; 
@Id
private String code;

public Long getIdAss() {
	return idAss;
}
public void setIdAss(Long idAss) {
	this.idAss = idAss;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((code == null) ? 0 : code.hashCode());
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
	AffectationMaintenance other = (AffectationMaintenance) obj;
	if (code == null) {
		if (other.code != null)
			return false;
	} else if (!code.equals(other.code))
		return false;
	if (idAss == null) {
		if (other.idAss != null)
			return false;
	} else if (!idAss.equals(other.idAss))
		return false;
	return true;
}
@Override
public String toString() {
	return "AffectationMaintenance [idAss=" + idAss + ", code=" + code + "]";
}
public AffectationMaintenance(Long idAss, String code) {
	super();
	this.idAss = idAss;
	this.code = code;
}

public AffectationMaintenance() {}
}
