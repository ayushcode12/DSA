class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        
        List<Integer> list = new ArrayList<>();
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        list.add(a);
        list.add(b);
        
        return list;
        
    }
}