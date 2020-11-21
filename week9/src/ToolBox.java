import java.util.ArrayList;

public class ToolBox implements GenericTools {

    @Override
    public <T> void swap(ArrayList<T> data, int p1, int p2) {

    }

    @Override
    public <T extends Comparable<T>> void insertionSort(ArrayList<T> data) {
        for (int index = 1; index < data.size(); index++) {
            T unsortedValue = data.get(index);
            int scan = index;
            while (scan > 0 && data.get(scan - 1).compareTo(unsortedValue) > 0) {
                data.set(scan, data.get(scan - 1));
                scan--;
            }
            data.set(scan, unsortedValue);
        }
    }

    @Override
    public <T extends Comparable<T>> ArrayList<T> insertionSort(ArrayList<T> data, int start, int end) {
        for (int index = start; index < end; index++) {
            T unsortedValue = data.get(index);
            int scan = index;
            while (scan > 0 && data.get(scan - 1).compareTo(unsortedValue) > 0) {
                data.set(scan, data.get(scan - 1));
                scan--;
            }
        }

        ArrayList<T> subData = new ArrayList<>();
        for (int i = start; i < end; i++) {
            subData.add(data.get(i));
        }

        return subData;
    }
}
