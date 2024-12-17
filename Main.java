import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> resultMap = countElements(array);

        System.out.println(resultMap);
    }

    public static Map<Integer, Integer> countElements(int[] array) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int element : array) {
            if (resultMap.containsKey(element)) {
                resultMap.put(element, resultMap.get(element) + 1);
            } else {
                resultMap.put(element, 1);
            }
        }

        return resultMap;
    }
}
