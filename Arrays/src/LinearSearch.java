public class LinearSearch {
    public static void main(String[] args) throws Exception {
        int[] nums = {10, 20, 30, 40, 50};
        int element = 40;

        int index = linearSearchAlgo(nums, element);
        if(index == -1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at index " + index);
        }
    }

    public static int linearSearchAlgo(int[] arr, int ele){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
}
 