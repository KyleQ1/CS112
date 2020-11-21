import java.util.ArrayList;
import java.util.Collections;

public class Sort
{

    // convenient method that uses index 0
    public static void sort(ArrayList<String[]> data) {
        quicksort(data, 0, data.size() - 1);
    }

    private static void quicksort(ArrayList<String[]> data, int start, int end) {
        // if there's something to sort
        if (start < end) {
            int where = partition(data, start, end);
            quicksort(data, start, where - 1);
            quicksort(data, where + 1, end);
        }
    }

    public static int partition(ArrayList<String[]> data, int start, int end) {
        // calculate mid point
        int  mid = (start + end) / 2;
        // get the pivot
        String[] pivotValue = data.get(mid);
        // bring pivot to mid
        Collections.swap(data, start, mid);
        // keep track of where the small number list ends
        // the next open space
        int endOfSmallList = start;

        for (int x = start + 1; x <= end; x++) {
            // if the string <= pivot value
            if (data.get(x)[0].compareToIgnoreCase(pivotValue[0]) < 0) {
                endOfSmallList++;
                Collections.swap(data, endOfSmallList, x);
            } else if (data.get(x)[0].compareToIgnoreCase(pivotValue[0]) == 0
                    && data.get(x)[1].compareToIgnoreCase(pivotValue[1]) < 0) {
                endOfSmallList++;
                Collections.swap(data, endOfSmallList, x);
            } else if (data.get(x)[0].compareToIgnoreCase(pivotValue[0]) == 0
                    && data.get(x)[1].compareToIgnoreCase(pivotValue[1]) == 0
                    && data.get(x)[2].compareToIgnoreCase(pivotValue[2]) < 0) {
                endOfSmallList++;
                Collections.swap(data, endOfSmallList, x);
            }
        }

        // bring pivot to end of the small list
        Collections.swap(data, start, endOfSmallList);

        // return where the pivot ended up
        return endOfSmallList;
    }
}
