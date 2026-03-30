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


        for(int freq : map.values()){
            max = Math.max(max, freq);
        }

        StringBuilder result = new StringBuilder();

        while(max != 0){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() == max){
                    char ch = entry.getKey();
                    for(int i = 0; i < max; i++){
                        result.append(ch);
                    }
                }
            }
            max--;
        }
        return result.toString();
    }
}