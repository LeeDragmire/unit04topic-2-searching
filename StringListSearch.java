import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(term)) {
                return i;
            }
        }
        return -1;
    }

    public static int orderedLinearSearch(ArrayList<String> a, String value) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(value)) {
                return i;
            } else if (a.get(i).compareTo(value) > 0) {
                return -1;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<String> a, String value) {
        int high = a.size() - 1;
        int low = 0;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (a.get(mid).equals(value)) {
                return mid;
            } else if (a.get(mid).compareTo(value) > 0) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else {
                high = mid - 1;
                mid = (low + high) / 2;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}