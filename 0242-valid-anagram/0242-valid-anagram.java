class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
      return false;
 
    s = SortString(s);
    t = SortString(t);
 
    // Case 2: check if every character of str1 and str2 matches with each other
    for (int i = 0; i < s.length(); i++)
    {
      if (s.charAt(i) != t.charAt(i))
        return false;
    }
    return true;
    }
    public static String SortString(String s)
  {
    char c[] = s.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }
}