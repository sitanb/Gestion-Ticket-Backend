package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chat {
	@Id
private String nomUtil;
	private Date dateChat;
	private String nbMsg;
	public Chat() {
		
	}
	public String getNomUtil() {
		return nomUtil;
	}
	public void setNomUtil(String nomUtil) {
		this.nomUtil = nomUtil;
	}
	public Date getDateChat() {
		return dateChat;
	}
	public void setDateChat(Date dateChat) {
		this.dateChat = dateChat;
	}
	public String getNbMsg() {
		return nbMsg;
	}
	public void setNbMsg(String nbMsg) {
		this.nbMsg = nbMsg;
	}
	@Override
	public String toString() {
		return "Chat [nomUtil=" + nomUtil + ", dateChat=" + dateChat + ", nbMsg=" + nbMsg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateChat == null) ? 0 : dateChat.hashCode());
		
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
		Chat other = (Chat) obj;
		if (dateChat == null) {
			if (other.dateChat != null)
				return false;
		} else if (!dateChat.equals(other.dateChat))
			return false;
		if (nbMsg != other.nbMsg)
			return false;
		if (nomUtil == null) {
			if (other.nomUtil != null)
				return false;
		} else if (!nomUtil.equals(other.nomUtil))
			return false;
		return true;
	}
	public Chat(String nomUtil, Date dateChat, String nbMsg) {
		super();
		this.nomUtil = nomUtil;
		this.dateChat = dateChat;
		this.nbMsg = nbMsg;
	}


}
