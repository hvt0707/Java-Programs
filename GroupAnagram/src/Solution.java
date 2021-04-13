import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] stringArray = {"tea","eat","tan","ate","nat", "bat", "dog", "god"};
        System.out.println(groupAnagrams(stringArray));
    }

    static List<List<String>> groupAnagrams(String[] strings){
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strings){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new LinkedList<>());
            }
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }
}
