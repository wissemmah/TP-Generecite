import java.util.*;
import java.util.function.Predicate;

public class OutilsGeneriques {

    public static <T> void afficherListe(Collection<T> liste) {
        for (T element : liste) {
            System.out.println(element);
        }
    }

    public static <T> List<T> filtrer(List<T> liste, Predicate<T> critere) {
        List<T> resultat = new ArrayList<>();
        for (T element : liste) {
            if (critere.test(element)) {
                resultat.add(element);
            }
        }
        return resultat;
    }

    public static <T> void copierCollection(Collection<T> source, Collection<T> destination) {
        destination.addAll(source);
    }
}
