import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data>  {
    @Override
    public int compare(Covid19Data d1, Covid19Data d2) {
        return d1.getAldergruppe().compareTo(d2.getAldergruppe());
    }
    
}
