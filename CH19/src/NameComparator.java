import java.util.Comparator;

public class NameComparator implements Comparator<Stock> {

    @Override
    public int compare(Stock o1, Stock o2) {
        return o1.name.compareTo(o2.name);
    }
}
