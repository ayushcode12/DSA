class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        if(((1 << k) & n) != 0) return true;
        else return false;
    }
}