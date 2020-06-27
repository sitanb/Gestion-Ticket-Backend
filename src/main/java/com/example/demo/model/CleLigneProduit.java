package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class CleLigneProduit implements Serializable{
	private String codePro;
	private String raisonSoc;
	private String date;
}
