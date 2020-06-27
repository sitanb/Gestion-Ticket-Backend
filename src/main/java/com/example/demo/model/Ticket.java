package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
@Id 
private String idTicket;
private String objetTicket;
private Date dateDebut;
private String codePro;
private String raisonSoc;




public Ticket(String idTicket, String objetTicket, Date dateDebut, String codePro, String raisonSoc) {
	super();
	this.idTicket = idTicket;
	this.objetTicket = objetTicket;
	this.dateDebut = dateDebut;
	this.codePro = codePro;
	this.raisonSoc = raisonSoc;
}




@Override
public String toString() {
	return "Ticket [idTicket=" + idTicket + ", objetTicket=" + objetTicket + ", dateDebut=" + dateDebut + ", codePro="
			+ codePro + ", raisonSoc=" + raisonSoc + "]";
}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codePro == null) ? 0 : codePro.hashCode());
	result = prime * result + ((dateDebut == null) ? 0 : dateDebut.hashCode());
	result = prime * result + ((idTicket == null) ? 0 : idTicket.hashCode());
	result = prime * result + ((objetTicket == null) ? 0 : objetTicket.hashCode());
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
	Ticket other = (Ticket) obj;
	if (codePro == null) {
		if (other.codePro != null)
			return false;
	} else if (!codePro.equals(other.codePro))
		return false;
	if (dateDebut == null) {
		if (other.dateDebut != null)
			return false;
	} else if (!dateDebut.equals(other.dateDebut))
		return false;
	if (idTicket == null) {
		if (other.idTicket != null)
			return false;
	} else if (!idTicket.equals(other.idTicket))
		return false;
	if (objetTicket == null) {
		if (other.objetTicket != null)
			return false;
	} else if (!objetTicket.equals(other.objetTicket))
		return false;
	if (raisonSoc == null) {
		if (other.raisonSoc != null)
			return false;
	} else if (!raisonSoc.equals(other.raisonSoc))
		return false;
	return true;
}




public String getIdTicket() {
	return idTicket;
}




public void setIdTicket(String idTicket) {
	this.idTicket = idTicket;
}




public String getObjetTicket() {
	return objetTicket;
}




public void setObjetTicket(String objetTicket) {
	this.objetTicket = objetTicket;
}




public Date getDateDebut() {
	return dateDebut;
}




public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
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




public Ticket() {
	
}
}
