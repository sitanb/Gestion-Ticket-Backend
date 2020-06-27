package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class CleDevEquipe implements Serializable {
	
	private String codeEquipe;
	
	private String idDev;

}
