class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        int low = findMin(bloomDay, n);
        int high = findMax(bloomDay, n);

        if(n < m*k){
            return -1;
        }

        while(low <= high){

            int mid = (low + high)/2;

            if(possible(bloomDay, mid, m, k, n)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean possible(int[] bloomDay, int day, int m, int k, int n){
        int noOfBouquet = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(bloomDay[i] <= day){
                count++;
            }
            else{
                noOfBouquet += (count/k);
                count = 0;
            }
        }
        noOfBouquet += (count/k);
        if(noOfBouquet >= m) return true;
        else return false;
    }

    public int findMax(int[] bloomDay, int n){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(bloomDay[i] > max){
                max = bloomDay[i];
            }
        }
        return max;
    }

     public int findMin(int[] bloomDay, int n){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(bloomDay[i] < min){
                min = bloomDay[i];
            }
        }
        return min;
    }


}