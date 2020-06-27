package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(CleLigneProduit.class)
public class LigneProduit implements Serializable {
	@Id
private String codePro;
@Id
private String raisonSoc;
@Id
private String date;
private int quantite;

private double prixUnitaire;

public LigneProduit(String codePro, String raisonSoc, String date, int quantite, double prixUnitaire) {
	super();
	this.codePro = codePro;
	this.raisonSoc = raisonSoc;
	this.date = date;
	this.quantite = quantite;
	this.prixUnitaire = prixUnitaire;
}



@Override
public String toString() {
	return "LigneProduit [codePro=" + codePro + ", raisonSoc=" + raisonSoc + ", date=" + date + ", quantite=" + quantite
			+ ", prixUnitaire=" + prixUnitaire + "]";
}







@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codePro == null) ? 0 : codePro.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	long temp;
	temp = Double.doubleToLongBits(prixUnitaire);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + quantite;
	result = prime * result + ((raisonSoc == null) ? 0 : raisonSoc.hashCode());
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
	LigneProduit other = (LigneProduit) obj;
	if (codePro == null) {
		if (other.codePro != null)
			return false;
	} else if (!codePro.equals(other.codePro))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (Double.doubleToLongBits(prixUnitaire) != Double.doubleToLongBits(other.prixUnitaire))
		return false;
	if (quantite != other.quantite)
		return false;
	if (raisonSoc == null) {
		if (other.raisonSoc != null)
			return false;
	} else if (!raisonSoc.equals(other.raisonSoc))
		return false;
	return true;
}







public String getCodePro() {
	return codePro;
}







public void setCodePro(String codePro) {
	this.codePro = codePro;
}







public String getRaisonSoc() {
	return raisonSoc;
}







public void setRaisonSoc(String raisonSoc) {
	this.raisonSoc = raisonSoc;
}







public String getDate() {
	return date;
}







public void setDate(String date) {
	this.date = date;
}







public int getQuantite() {
	return quantite;
}







public void setQuantite(int quantite) {
	this.quantite = quantite;
}







public double getPrixUnitaire() {
	return prixUnitaire;
}







public void setPrixUnitaire(double prixUnitaire) {
	this.prixUnitaire = prixUnitaire;
}







public LigneProduit() {
	
}
}
