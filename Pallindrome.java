class Solution {
    public boolean isPalindrome(int num) {
        if(num < 0 || (num % 10 == 0 && num != 0))
            return false;
        
        int revertedNumber = 0;
        while(num > revertedNumber)
        {
            revertedNumber = revertedNumber * 10 + (num % 10);
            num /=10;
        }
        
        return num == revertedNumber || num == revertedNumber/10;
    }
}