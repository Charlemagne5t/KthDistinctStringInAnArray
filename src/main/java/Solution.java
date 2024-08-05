import java.util.HashMap;
import java.util.Map;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int c = map.getOrDefault(arr[i], 0);
            c++;
            map.put(arr[i], c);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                k--;
            }
            if (k == 0) {
                return arr[i];
            }
        }

        return "";
    }
}