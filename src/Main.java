import java.util.*;

public class Main {
    public static void main(String[] args) {

        Livre livre1 = new Livre("Harry Potter", 2007, "J.K. Rowling", 600);
        Livre livre2 = new Livre("Le Petit Prince", 1943, "Saint-Exupéry", 96);
        Livre livre3 = new Livre("Ready Player One", 2018, "Ernest Cline", 400);
        CD cd1 = new CD("Thriller", 1982, "Michael Jackson", 42);
        CD cd2 = new CD("Future Nostalgia", 2020, "Dua Lipa", 37);

        List<Media> medias = Arrays.asList(livre1, livre2, livre3, cd1, cd2);

        System.out.println("Tous les médias :");
        OutilsGeneriques.afficherListe(medias);

        System.out.println("\nMédias publiés après 2010 :");
        List<Media> mediasApres2010 = OutilsGeneriques.filtrer(medias, m -> m.getAnneePublication() > 2010);
        OutilsGeneriques.afficherListe(mediasApres2010);

        System.out.println("\nMédias de type Livre :");
        List<Media> livres = OutilsGeneriques.filtrer(medias, m -> m instanceof Livre);
        OutilsGeneriques.afficherListe(livres);

        Membre alice = new Membre("Alice", 1);
        Membre bob = new Membre("Bob", 2);

        alice.emprunterMedia(livre1);
        alice.emprunterMedia(cd1);
        bob.emprunterMedia(livre1);
        bob.emprunterMedia(livre2);

        Map<Membre, List<Media>> emprunts = new HashMap<>();
        emprunts.put(alice, alice.getMediasEmpruntes());
        emprunts.put(bob, bob.getMediasEmpruntes());

        Set<Media> mediasEmpruntes = new HashSet<>();
        for (List<Media> liste : emprunts.values()) {
            mediasEmpruntes.addAll(liste);
        }

        System.out.println("\nTous les médias empruntés (sans doublons) :");
        OutilsGeneriques.afficherListe(mediasEmpruntes);

        List<Media> mediasTries = new ArrayList<>(medias);
        mediasTries.sort(Comparateurs.mediaParAnneePuisTitre);
        System.out.println("\nMédias triés par année décroissante puis titre :");
        OutilsGeneriques.afficherListe(mediasTries);

        List<Livre> livresTri = new ArrayList<>();
        for (Media m : medias) {
            if (m instanceof Livre) livresTri.add((Livre) m);
        }
        livresTri.sort(Comparateurs.livreParAuteurPuisTitre);
        System.out.println("\nLivres triés par auteur puis titre :");
        OutilsGeneriques.afficherListe(livresTri);

        List<Media> copieMedias = new ArrayList<>();
        OutilsGeneriques.copierCollection(medias, copieMedias);
        System.out.println("\nCopie des médias :");
        OutilsGeneriques.afficherListe(copieMedias);
    }
}
