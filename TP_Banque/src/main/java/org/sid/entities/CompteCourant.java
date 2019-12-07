package org.sid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte{
	private double decourvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(String codeCompte, Date dateCreation, double solde, Client client, double decourvert) {
		super(codeCompte, dateCreation, solde, client);
		this.decourvert = decourvert;
	}

	public double getDecourvert() {
		return decourvert;
	}

	public void setDecourvert(double decourvert) {
		this.decourvert = decourvert;
	}
	
}
