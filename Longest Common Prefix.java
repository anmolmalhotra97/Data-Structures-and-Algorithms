class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0)
        return "";
    int minLen = Integer.MAX_VALUE;
    for(String str:strs)
        minLen = Math.min(minLen, str.length());
    int low = 1, high = minLen;
    while(low <= high)
    {
        int middle = (low+high)/2;
        if(commonString(strs, middle))
            low = middle + 1;
        else
            high = middle - 1;
    }
      return strs[0].substring(0, (low+high)/2);
  }
      
private Boolean commonString(String[] strs, int length)
{
    String str1 = strs[0].substring(0,length);
    for(int i = 1; i < strs.length; i++)
    {
        if(!strs[i].startsWith(str1))
            return false;
    }
    return true;
}
        
}