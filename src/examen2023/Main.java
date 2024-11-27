package examen2023;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Billet billet = new Billet(LocalDate.of(2023, 11, 27), "Alice");
        Message message = new Message(LocalDate.of(2023, 11, 28), "Bob", "Bienvenue sur le blog !");
        Image image = new Image(LocalDate.of(2023, 11, 25), "Charlie", 5, "https://image.example.com");
        Video video = new Video(LocalDate.of(2023, 11, 26), "Diane", 3, "https://video.example.com");
         
        image.LTags[0]="tag1";
        image.LTags[1]="tag2";
        image.LTags[2]="tag3";
        image.LTags[3]="tag4";

        video.LTags[0]="tag1";
        video.LTags[1]="tag2";
        video.LTags[2]="tag3";


        System.out.println(billet);
        System.out.println(message);
        System.out.println(image);
        System.out.println(video);
        
        
        image.ajoutTag("Nature");
        image.ajoutTag("Paysage");
        image.ajoutTag("Voyage");

        video.ajoutTag("Tutoriel");
        video.ajoutTag("Programmation");

        System.out.println("Tags de l'image : " + image);
        System.out.println("Tags de la vidéo : " + video);

        image.supprimeTag("Paysage");
        System.out.println("Tags de l'image après suppression : " + image);

        Blog blog = new Blog("Mon Blog Tech", 10);

        try {
            blog.post(message);
            blog.post(image);
            blog.post(video);
            blog.post(new Video(LocalDate.of(2023, 11, 27), "Eve", 4, "http://video.example.com")); 
        } catch (InvalidURLException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("Billets publiés dans le blog :");
        for (Publiable p : blog.LBillets) {
            if (p != null) {
                System.out.println(p);
            }
        }

        Publiable plusRecent = blog.getPlusRécentBillet();
        System.out.println("Le billet le plus récent est : " + plusRecent);

        Publiable[] billetsParAuteur = blog.RechercheBilletsTaggablesParAuteur("Charlie");
        System.out.println("Billets taggables de Charlie :");
        for (Publiable p : billetsParAuteur) {
            if (p != null) {
                System.out.println(p);
            }
        }

        String[] mots = {"Bienvenue", "blog"};
        Publiable[] messagesParContenu = blog.RechercheBilletsParContenu(mots);
        System.out.println("Messages contenant les mots 'Bienvenue' et 'blog' :");
        for (Publiable p : messagesParContenu) {
            if (p != null) {
                System.out.println(p);
            }
        }

        int nbTaggables = blog.getNombreBilletsTaggables();
        System.out.println("Nombre de billets taggables dans le blog : " + nbTaggables);
    }
}
