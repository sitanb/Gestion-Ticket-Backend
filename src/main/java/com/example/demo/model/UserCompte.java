package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserCompte {
@Id
private String nomUtil;
private String motpass;

public  UserCompte() {
	
}

public UserCompte(String nomUtil, String motpass) {
	super();
	this.nomUtil = nomUtil;
	this.motpass = motpass;
}

@Override
public String toString() {
	return "UserCompte [nomUtil=" + nomUtil + ", motpass=" + motpass + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((motpass == null) ? 0 : motpass.hashCode());
	result = prime * result + ((nomUtil == null) ? 0 : nomUtil.hashCode());
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
	UserCompte other = (UserCompte) obj;
	if (motpass == null) {
		if (other.motpass != null)
			return false;
	} else if (!motpass.equals(other.motpass))
		return false;
	if (nomUtil == null) {
		if (other.nomUtil != null)
			return false;
	} else if (!nomUtil.equals(other.nomUtil))
		return false;
	return true;
}
public String getNomUtil() {
	return nomUtil;
}
public void setNomUtil(String nomUtil) {
	this.nomUtil = nomUtil;
}
public String getMotpass() {
	return motpass;
}
public void setMotpass(String motpass) {
	this.motpass = motpass;
}
}
