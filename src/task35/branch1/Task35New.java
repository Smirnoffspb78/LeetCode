package task35.branch1;

//Класс, который реализует решение задачи
class Solution {
    private int numt;
    //Метод, который вставляет значение перед наибольшим или таким же числом
    public int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            numt=target==nums[i]? i: nums[i]>target? i: i==nums.length-1? nums.length: -1;
            if (numt!=-1) break;
        }
        return numt;
    }
}
public class Task35New {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};//тестовый массив
        int target=4; // значение, вставляемое в массив
        Solution obj=new Solution();
        System.out.println("Позиция в массиве="+obj.searchInsert(arr, target));
    }
}
