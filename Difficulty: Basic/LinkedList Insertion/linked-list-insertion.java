// User function Template for Java
class Solution {
    public static LinkedList<Integer> insertion(int arr[]) {
        LinkedList<Integer> list = new LinkedList<>();

        // Insert each array element into the LinkedList
        for (int num : arr) {
            list.add(num);
        }

        return list;
    }
} 