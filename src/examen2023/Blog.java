package examen2023;

import java.util.Arrays;

public class Blog {
	public String titre;
	public Publiable [] LBillets;
	public int nbBillets;
	public Blog (String titre, int capacité) {
		this.titre=titre;
		this.LBillets=new Publiable[capacité];
		nbBillets++;
	}
	void post(Publiable billet) throws InvalidURLException {

				if(billet instanceof Video || billet instanceof Image) {
					if(  !((Video)billet).getUrl().startsWith("https") || !((Image)billet).getUrl().startsWith("https") )
						throw new InvalidURLException("URL doit commencer par HTTPS");
				
	                
				}
				if (nbBillets < LBillets.length) {
		           LBillets[nbBillets++] = billet;
		        }
				
			
		}
	
	public int getNombreBilletsTaggables() {
        int nb = 0;
        for (int i = 0; i < nbBillets; i++) {
            if (LBillets[i] instanceof BilletTaggables) {
                nb++;
            }
        }
        return nb;
    }
	Publiable[] RechercheBilletsTaggablesParAuteur(String auteur) {
		Publiable[] result = new Publiable[nbBillets]; 
		for (int i=0;i<=LBillets.length;i++) {
			if(LBillets[i] instanceof BilletTaggables && (LBillets[i].getAuteur()).equals(auteur)) {
				result[nbBillets]=LBillets[i];
				System.out.println(LBillets[i]);
			}
			
			
		}
		return result;
		
	}
	 public Publiable getPlusRécentBillet() {
	        if (nbBillets == 0) return null;
	        Publiable plusRecent = LBillets[0];
	        for (int i = 1; i < nbBillets; i++) {
	            if (LBillets[i].getDatePublication().isAfter(plusRecent.getDatePublication())) {
	                plusRecent = LBillets[i];
	            }
	        }
	        return plusRecent;
	    }
	
	 public Publiable[] RechercheBilletsParContenu(String[] mots) {
	        Publiable[] result = new Publiable[nbBillets];
	        int count = 0;
	        for (int i = 0; i < nbBillets; i++) {
	            if (LBillets[i] instanceof Message) {
	                Message message = (Message) LBillets[i];
	                boolean allFound = true;
	                for (String mot : mots) {
	                    if (message.getContenu().indexOf(mot) == -1) {
	                        allFound = false;
	                        break;
	                    }
	                }
	                if (allFound) {
	                    result[count++] = message;
	                }
	            }
	        }
	       // return Arrays.copyOf(result, count);
	        return result;
	    }
	}



		
		        



