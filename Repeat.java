import java.util.HashMap;
import java.util.Map;

public class Repeat{

    public static int firstUniqChar(String s) {
        // Create a frequency map to store the count of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no non-repeating character found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1)); // Output: 0

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2)); // Output: 2

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3)); // Output: -1
    }
}
