package task35;
class Solution {
    private int numt;
    public int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            System.out.println(i);
           numt=target==nums[i]? i: nums[i]>target? i: i==nums.length-1? nums.length: -1;
           if (numt!=-1) break;
        }
        return numt;
    }
}
public class Main {

    public static void main(String[] args) {
    int[] arr={1,3,5,6};
    int target=1;
    Solution obj=new Solution();
    System.out.println("Позиция в массиве="+obj.searchInsert(arr, target));
    }
}
