import java.util.Comparator;

public class PriceComparator implements Comparator<Stock> {

    @Override
    public int compare(Stock o1, Stock o2) {
        return o1.price.compareTo(o2.price);
    }
}
