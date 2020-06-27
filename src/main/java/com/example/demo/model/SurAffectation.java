package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CleSurAffectation.class)
public class SurAffectation implements Serializable {
	@Id
private String idAss;
	@Id
private String codeProjet;
	public SurAffectation() {
		
	}
	public SurAffectation(String idAss, String codeProjet) {
		super();
		this.idAss = idAss;
		this.codeProjet = codeProjet;
	}
	@Override
	public String toString() {
		return "SurAffectation [idAss=" + idAss + ", codeProjet=" + codeProjet + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeProjet == null) ? 0 : codeProjet.hashCode());
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
		SurAffectation other = (SurAffectation) obj;
		if (codeProjet == null) {
			if (other.codeProjet != null)
				return false;
		} else if (!codeProjet.equals(other.codeProjet))
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
}
