class Solution{
  public static int lengthOfLongestSubstring(String s){
    if(s.length()<=1)
      s.length();
    int start=0,maxLength=0;
    HashMap<Character,Integer> charIndexMap=new HashMap<Character,Integer>();
    for(int i=0;i<s.length();i++){
      char currChar=s.charAt(i);
      if(charIndexMap.containsKey(currChar))
        start=Math.max(start,charIndexMap.get(currChar)+1);
      charIndexMap.put(currChar,i);
      maxLength=Math.max(maxLength,i-start+1);
    }
    return maxLength;
  }
}
