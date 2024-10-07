public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int element = 10;

        int index = binarySearchAlgo(nums, element);
        if(index == -1){
            System.out.println("element not found!");
        }else{
            System.out.printf("element is found at index : %d", index);
        }
    }

    public static int binarySearchAlgo(int[] arr, int element){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == element){
                return mid;
            }else if(arr[mid] < element){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }
}
