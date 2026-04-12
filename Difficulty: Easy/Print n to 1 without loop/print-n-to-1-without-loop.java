class Solution {
    void printNos(int n) {
        // code here
        if( n == 0) return;
        
        System.out.print(n + " ");
        
        printNos(n-1);
    }
}