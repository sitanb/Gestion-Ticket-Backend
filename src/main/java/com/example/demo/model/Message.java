package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
@Id @GeneratedValue(strategy = GenerationType.AUTO)
private long idMsg;
private String contenu;
private Date date;
private String status;
private String idAss;
private String nomUtil;
public  Message(){ 
	
}
public Message(long idMsg, String contenu, Date date, String status, String idAss, String nomUtil) {
	super();
	this.idMsg = idMsg;
	this.contenu = contenu;
	this.date = date;
	this.status = status;
	this.idAss = idAss;
	this.nomUtil = nomUtil;
}
public long getIdMsg() {
	return idMsg;
}
public void setIdMsg(long idMsg) {
	this.idMsg = idMsg;
}
public String getContenu() {
	return contenu;
}
public void setContenu(String contenu) {
	this.contenu = contenu;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getIdAss() {
	return idAss;
}
public void setIdAss(String idAss) {
	this.idAss = idAss;
}
public String getNomUtil() {
	return nomUtil;
}
public void setNomUtil(String nomUtil) {
	this.nomUtil = nomUtil;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + ((idAss == null) ? 0 : idAss.hashCode());
	result = prime * result + (int) (idMsg ^ (idMsg >>> 32));
	result = prime * result + ((nomUtil == null) ? 0 : nomUtil.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
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
	Message other = (Message) obj;
	if (contenu == null) {
		if (other.contenu != null)
			return false;
	} else if (!contenu.equals(other.contenu))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (idAss == null) {
		if (other.idAss != null)
			return false;
	} else if (!idAss.equals(other.idAss))
		return false;
	if (idMsg != other.idMsg)
		return false;
	if (nomUtil == null) {
		if (other.nomUtil != null)
			return false;
	} else if (!nomUtil.equals(other.nomUtil))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}
@Override
public String toString() {
	return "Message [idMsg=" + idMsg + ", contenu=" + contenu + ", date=" + date + ", status=" + status + ", idAss="
			+ idAss + ", nomUtil=" + nomUtil + "]";
}



}
