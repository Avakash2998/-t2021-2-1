import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] factors = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        Map<Integer, Integer> count = countDivisible(numbers, factors);
        System.out.println(count);
    }
    
    public static Map<Integer, Integer> countDivisible(int[] numbers, int[] factors) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int factor : factors) {
            countMap.put(factor, 0);
        }
        
        for (int number : numbers) {
            for (int factor : factors) {
                if (number % factor == 0) {
                    countMap.put(factor, countMap.get(factor) + 1);
                }
            }
        }
        
        return countMap;
    }
}
