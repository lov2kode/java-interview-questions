package com.lov2kode.jiq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1
{
  public static List<List<String>> groupAnagrams(String[] inputStrArray)
  {
    final Map<String, List<String>> myMap = new HashMap<>();

    for (String inputSingleStr : inputStrArray)
    {
      char[] t = inputSingleStr.toCharArray();
      Arrays.sort(t);
      String sortedStr = String.valueOf(t);
      myMap.computeIfAbsent(sortedStr, key -> new ArrayList<>()).add(inputSingleStr);
    }

    return new ArrayList<>(myMap.values());
  }

  public static void main(String[] args)
  {
    final String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    final List<List<String>> answer = Solution1.groupAnagrams(strs);
    System.out.println(answer);
  }
}
