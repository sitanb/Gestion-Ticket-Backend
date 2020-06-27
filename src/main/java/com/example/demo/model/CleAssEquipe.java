package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CleAssEquipe  implements Serializable{
	private String idAss; 
	private String code;
}
