class Solution {
    public int median(int[][] mat) {
        // code here
        List<Integer> elements = new ArrayList<>();
        
        for(int[] row : mat){
            for(int val : row){
                elements.add(val);
            }
        }
        
        Collections.sort(elements);
        
        int n = elements.size();
        return elements.get(n/2);
    }
}