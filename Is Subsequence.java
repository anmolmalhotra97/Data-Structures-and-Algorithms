class Solution {
    public boolean isSubsequence(String sub, String sentence) {
        int x = 0;
        for(int i = 0; i < sentence.length() && x < sub.length(); i++)
        {
            System.out.println("checking " + sentence.charAt(i) + " with "+ sub.charAt(x));
            if(sentence.charAt(i) == sub.charAt(x)){
                System.out.println(sentence.charAt(i) + " equals "+ sub.charAt(x));
                x++;
            }
        }
        if(x == sub.length())
            return true;
        else
            return false;
    }
}