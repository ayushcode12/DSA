class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;

        int low = 1;
        int high = maxEl(piles, n);

        while(low <= high){
            int mid = (low + high)/2;
            int totalHr = totalHour(piles, mid, n);

            if(totalHr <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public int maxEl(int[] piles, int n){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        return max;
    }

    public int totalHour(int[] piles, int mid, int n){
        int totalHr = 0;

        for(int i = 0; i < n; i++){
            totalHr += Math.ceil((double)piles[i]/(double)mid);
        }

        return totalHr;
    }

}