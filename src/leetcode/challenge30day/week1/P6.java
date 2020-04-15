package leetcode.challenge30day.week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class P6 {

  public static void main(String[] args) {
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
//    [
//      ["ate","eat","tea"],
//      ["nat","tan"],
//      ["bat"]
//    ]
    System.out.println(new P6().groupAnagrams(input));
  }

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    Arrays.stream(strs).forEach(x -> {
      char[] chars = x.toCharArray();
      Arrays.sort(chars);
      String sortedKey = String.valueOf(chars);
      List<String> list = map.getOrDefault(sortedKey, new LinkedList<>());
      list.add(x);
      map.put(sortedKey, list);
    });
    return new LinkedList<>(map.values());
  }
}
