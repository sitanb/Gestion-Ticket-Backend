package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LangageDeveloppement {
	@Id
private String codeLang;
private String descriptionLang;
private String nomLang;



public LangageDeveloppement(String codeLang, String descriptionLang, String nomLang) {
	super();
	this.codeLang = codeLang;
	this.descriptionLang = descriptionLang;
	this.nomLang = nomLang;
}



@Override
public String toString() {
	return "LangageDeveloppement [codeLang=" + codeLang + ", descriptionLang=" + descriptionLang + ", nomLang="
			+ nomLang + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codeLang == null) ? 0 : codeLang.hashCode());
	result = prime * result + ((descriptionLang == null) ? 0 : descriptionLang.hashCode());
	result = prime * result + ((nomLang == null) ? 0 : nomLang.hashCode());
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
	LangageDeveloppement other = (LangageDeveloppement) obj;
	if (codeLang == null) {
		if (other.codeLang != null)
			return false;
	} else if (!codeLang.equals(other.codeLang))
		return false;
	if (descriptionLang == null) {
		if (other.descriptionLang != null)
			return false;
	} else if (!descriptionLang.equals(other.descriptionLang))
		return false;
	if (nomLang == null) {
		if (other.nomLang != null)
			return false;
	} else if (!nomLang.equals(other.nomLang))
		return false;
	return true;
}



public String getCodeLang() {
	return codeLang;
}



public void setCodeLang(String codeLang) {
	this.codeLang = codeLang;
}



public String getDescriptionLang() {
	return descriptionLang;
}



public void setDescriptionLang(String descriptionLang) {
	this.descriptionLang = descriptionLang;
}



public String getNomLang() {
	return nomLang;
}



public void setNomLang(String nomLang) {
	this.nomLang = nomLang;
}



public LangageDeveloppement() {
	
}
}
