package examen2023;

import java.time.LocalDate;

public class Billet implements Publiable{
	protected LocalDate datePub;
	protected String auteur;
	
	
	Billet(LocalDate datePub, String auteur){
		this.auteur=auteur;
		this.datePub=datePub;
	}


	@Override
	public LocalDate getDatePublication() {
		return datePub;
	}


	@Override
	public String getAuteur() {
		return auteur;
	}


	@Override
	public String toString() {
		return "Billet [datePub=" + datePub + ", auteur=" + auteur + "]";
	}
	
}
