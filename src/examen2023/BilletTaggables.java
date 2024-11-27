package examen2023;

import java.time.LocalDate;
import java.util.Arrays;

public class BilletTaggables extends Billet implements Taggable{
	protected String[] LTags;
	protected int nbTags;
	BilletTaggables(LocalDate datePub, String auteur, int capacité){
		super(datePub,auteur);
		this.LTags=new String[capacité];
		nbTags++;

		
		
	}
	@Override
	public void ajoutTag(String tag) {
	 if(nbTags==LTags.length) {
		 System.out.println("Tableau saturé");
			
		}
	 else {
		 for(int i=0;i<=LTags.length;i++) {
			 if(LTags[i].equals(tag)) {
				 System.out.println("Tag existant");
				 break;
			 }
		 }
		 LTags[nbTags]=tag;
		 nbTags++;
	 }
		
	}
	
	
	@Override
	public void supprimeTag(String tag) {
		for(int i=0;i<=nbTags;i++) {
			if(LTags[i].equals(tag)) {
				for(int j=i;j<=LTags.length;j++) {
					LTags[j]=LTags[j+1];
				}
			}
		}
	}
	@Override
	public int nombreTags() {
		return nbTags;
	}
	
	@Override
	public int rechercheTag(String tag) {
		for(int i=0;i<=LTags.length;i++) {
			if(LTags[i].equals(tag)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public String toString() {
		return "BilletTaggables [LTags=" + Arrays.toString(LTags) + ", nbTags=" + nbTags + ", datePub=" + datePub
				+ ", auteur=" + auteur + ", nombreTags()=" + nombreTags() + ", getDatePublication()="
				+ getDatePublication() + ", getAuteur()=" + getAuteur() + ", toString()=" + super.toString();
	}
	

}
