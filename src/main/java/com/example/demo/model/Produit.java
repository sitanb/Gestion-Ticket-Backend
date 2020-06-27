package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id
private String codePro;
	
private String descPro;
private String nomPro;
private String versionPro;
private String langage;
private int quantiteStock;
private String codeEquipe;
@Column(length=10000000)
private String image;
public Produit(String codePro, String descPro, String nomPro, String versionPro, String langage, int quantiteStock,
		String codeEquipe, String image) {
	super();
	this.codePro = codePro;
	this.descPro = descPro;
	this.nomPro = nomPro;
	this.versionPro = versionPro;
	this.langage = langage;
	this.quantiteStock = quantiteStock;
	this.codeEquipe = codeEquipe;
	this.image = image;
}

@Override
public String toString() {
	return "Produit [codePro=" + codePro + ", descPro=" + descPro + ", nomPro=" + nomPro + ", versionPro=" + versionPro
			+ ", langage=" + langage + ", quantiteStock=" + quantiteStock + ", codeEquipe=" + codeEquipe + ", image="
			+ image + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codeEquipe == null) ? 0 : codeEquipe.hashCode());
	result = prime * result + ((codePro == null) ? 0 : codePro.hashCode());
	result = prime * result + ((descPro == null) ? 0 : descPro.hashCode());
	result = prime * result + ((image == null) ? 0 : image.hashCode());
	result = prime * result + ((langage == null) ? 0 : langage.hashCode());
	result = prime * result + ((nomPro == null) ? 0 : nomPro.hashCode());
	result = prime * result + quantiteStock;
	result = prime * result + ((versionPro == null) ? 0 : versionPro.hashCode());
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
	Produit other = (Produit) obj;
	if (codeEquipe == null) {
		if (other.codeEquipe != null)
			return false;
	} else if (!codeEquipe.equals(other.codeEquipe))
		return false;
	if (codePro == null) {
		if (other.codePro != null)
			return false;
	} else if (!codePro.equals(other.codePro))
		return false;
	if (descPro == null) {
		if (other.descPro != null)
			return false;
	} else if (!descPro.equals(other.descPro))
		return false;
	if (image == null) {
		if (other.image != null)
			return false;
	} else if (!image.equals(other.image))
		return false;
	if (langage == null) {
		if (other.langage != null)
			return false;
	} else if (!langage.equals(other.langage))
		return false;
	if (nomPro == null) {
		if (other.nomPro != null)
			return false;
	} else if (!nomPro.equals(other.nomPro))
		return false;
	if (quantiteStock != other.quantiteStock)
		return false;
	if (versionPro == null) {
		if (other.versionPro != null)
			return false;
	} else if (!versionPro.equals(other.versionPro))
		return false;
	return true;
}

public String getCodePro() {
	return codePro;
}

public void setCodePro(String codePro) {
	this.codePro = codePro;
}

public String getDescPro() {
	return descPro;
}

public void setDescPro(String descPro) {
	this.descPro = descPro;
}

public String getNomPro() {
	return nomPro;
}

public void setNomPro(String nomPro) {
	this.nomPro = nomPro;
}

public String getVersionPro() {
	return versionPro;
}

public void setVersionPro(String versionPro) {
	this.versionPro = versionPro;
}

public String getLangage() {
	return langage;
}

public void setLangage(String langage) {
	this.langage = langage;
}

public int getQuantiteStock() {
	return quantiteStock;
}

public void setQuantiteStock(int quantiteStock) {
	this.quantiteStock = quantiteStock;
}

public String getCodeEquipe() {
	return codeEquipe;
}

public void setCodeEquipe(String codeEquipe) {
	this.codeEquipe = codeEquipe;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public Produit()
{
}
}
