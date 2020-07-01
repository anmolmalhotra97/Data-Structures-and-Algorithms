class Solution {
    public int hIndex(int[] citations) {
        
        int low = 0, mid = 0, high = citations.length - 1, n=citations.length;
        while(low <= high)
        {
            mid = low + (high-low)/2;           
            if(citations[mid] == n - mid)
                return citations[mid];
            else if(citations[mid] > (n - mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return n-low;
    }
}