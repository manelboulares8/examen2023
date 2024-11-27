package examen2023;

import java.time.LocalDate;
import java.util.Arrays;

public class Video extends BilletTaggables{
	
	private String url;
	public Video(LocalDate datePub, String auteur, int capacité, String url) {
	super(datePub, auteur, capacité);
	this.url = url;
	}
	public String getUrl() {
	return url;
	}
	@Override
	public String toString() {
		return "Video [url=" + url + ", LTags=" + Arrays.toString(LTags) + ", nbTags=" + nbTags + ", datePub=" + datePub
				+ ", auteur=" + auteur + ", getUrl()=" + getUrl() + ", nombreTags()=" + nombreTags() + ", toString()="
				+ super.toString() + ", getDatePublication()=" + getDatePublication() + ", getAuteur()=" + getAuteur()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
