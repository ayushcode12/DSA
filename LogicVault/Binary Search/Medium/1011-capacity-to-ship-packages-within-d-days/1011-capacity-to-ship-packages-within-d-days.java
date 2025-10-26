class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int low = Integer.MIN_VALUE;
        int high = 0;

        int n = weights.length;

        for(int i = 0; i < n; i++){
            high += weights[i];
            low = Math.max(weights[i], low);
        }

        while(low <= high){
            int mid = (low + high)/2;

            if(findDays(weights, mid, n) <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        return low;

    }

    public int findDays(int[] weights, int cap, int n){
        int days = 1;
        int load = 0; 

        for(int i = 0; i < n; i++){
            if(load + weights[i] > cap){
                days = days + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }

        return days;

    }

}