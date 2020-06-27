package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CleNotification implements Serializable{
	private String idAss;
	private String codeProjet;

}
