class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        pq.addAll(map.entrySet());

        StringBuilder result = new StringBuilder();

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();

            for(int i = 0; i < freq; i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}