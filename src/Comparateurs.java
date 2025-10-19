import java.util.Comparator;

public class Comparateurs {

    public static Comparator<Media> mediaParAnneePuisTitre = (m1, m2) -> {
        int cmp = Integer.compare(m2.getAnneePublication(), m1.getAnneePublication());
        if (cmp != 0) return cmp;
        return m1.getTitre().compareTo(m2.getTitre());
    };

    public static Comparator<Livre> livreParAuteurPuisTitre = (l1, l2) -> {
        int cmp = l1.getAuteur().compareTo(l2.getAuteur());
        if (cmp != 0) return cmp;
        return l1.getTitre().compareTo(l2.getTitre());
    };
}
