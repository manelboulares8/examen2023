package examen2023;
import java.time.LocalDate;
public class Image extends BilletTaggables {
	private String url;
	
	public Image(LocalDate datePub, String auteur, int capacité, String url) {
		
	super(datePub, auteur, capacité);
	this.url = url;
	
	}
	
	public String getUrl() {
	return url;
	}
	@Override
	public String toString() {
	return "Image ["+ super.toString()+", url=" + url + "]";
	}
}
