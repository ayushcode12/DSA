class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
	    int num = x;
        int rem , rev = 0;
	    while(num!=0){
	        rem=num%10;
	        rev=(rev*10)+rem;
	        num=num/10;
	    }
	    if(rev==x)
	        return true;
	    return false;
    }
}