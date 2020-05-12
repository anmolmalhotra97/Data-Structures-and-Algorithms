class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> rMapping = new HashMap<>();
        rMapping.put('I', 1);
        rMapping.put('V', 5);
        rMapping.put('X', 10);
        rMapping.put('L', 50);
        rMapping.put('C', 100);
        rMapping.put('D', 500);
        rMapping.put('M', 1000);
        int result = 0;
        for(int i = 0; i < s.length()-1; i++)
        {
            if(rMapping.get(s.charAt(i)) < rMapping.get(s.charAt(i+1)))
            {
                result -= rMapping.get(s.charAt(i));
            }
            else
            {
                result += rMapping.get(s.charAt(i));
            }
        }
        return result + rMapping.get(s.charAt(s.length()-1));
    }
}