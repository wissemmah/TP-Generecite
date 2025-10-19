public class Livre extends Media {
    private String auteur;
    private int nbPages;

    public Livre(String titre, int anneePublication, String auteur, int nbPages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    @Override
    public String getDescription() {
        return "Livre de " + auteur + ", " + nbPages + " pages.";
    }
}
