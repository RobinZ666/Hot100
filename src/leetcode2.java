
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class leetcode2 {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
        int[] arr = new int[]{1,2,3,4};

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Collection<List<String>> values = Arrays.stream(strs).collect(Collectors.groupingBy(s -> {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        })).values();
        return new ArrayList<>(values);
    }
}
