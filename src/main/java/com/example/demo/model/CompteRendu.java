package com.example.demo.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompteRendu {
@Id 
private String idCompteRendu;
private String auteur;
private String objetCompteRendu;
private Date date;
private String libelle;
private String codeProjet;


public CompteRendu(String idCompteRendu, String auteur, String objetCompteRendu, Date date, String libelle,
		String codeProjet) {
	super();
	this.idCompteRendu = idCompteRendu;
	this.auteur = auteur;
	this.objetCompteRendu = objetCompteRendu;
	this.date = date;
	this.libelle = libelle;
	this.codeProjet = codeProjet;
}


@Override
public String toString() {
	return "CompteRendu [idCompteRendu=" + idCompteRendu + ", auteur=" + auteur + ", objetCompteRendu="
			+ objetCompteRendu + ", date=" + date + ", libelle=" + libelle + ", codeProjet=" + codeProjet + "]";
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
	result = prime * result + ((codeProjet == null) ? 0 : codeProjet.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + ((idCompteRendu == null) ? 0 : idCompteRendu.hashCode());
	result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
	result = prime * result + ((objetCompteRendu == null) ? 0 : objetCompteRendu.hashCode());
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
	CompteRendu other = (CompteRendu) obj;
	if (auteur == null) {
		if (other.auteur != null)
			return false;
	} else if (!auteur.equals(other.auteur))
		return false;
	if (codeProjet == null) {
		if (other.codeProjet != null)
			return false;
	} else if (!codeProjet.equals(other.codeProjet))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (idCompteRendu == null) {
		if (other.idCompteRendu != null)
			return false;
	} else if (!idCompteRendu.equals(other.idCompteRendu))
		return false;
	if (libelle == null) {
		if (other.libelle != null)
			return false;
	} else if (!libelle.equals(other.libelle))
		return false;
	if (objetCompteRendu == null) {
		if (other.objetCompteRendu != null)
			return false;
	} else if (!objetCompteRendu.equals(other.objetCompteRendu))
		return false;
	return true;
}





public String getIdCompteRendu() {
	return idCompteRendu;
}


public void setIdCompteRendu(String idCompteRendu) {
	this.idCompteRendu = idCompteRendu;
}


public String getAuteur() {
	return auteur;
}


public void setAuteur(String auteur) {
	this.auteur = auteur;
}


public String getObjetCompteRendu() {
	return objetCompteRendu;
}


public void setObjetCompteRendu(String objetCompteRendu) {
	this.objetCompteRendu = objetCompteRendu;
}


public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public String getLibelle() {
	return libelle;
}


public void setLibelle(String libelle) {
	this.libelle = libelle;
}


public String getCodeProjet() {
	return codeProjet;
}


public void setCodeProjet(String codeProjet) {
	this.codeProjet = codeProjet;
}


private CompteRendu() {
	
}
}
