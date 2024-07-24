package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,3,7,9,11,24};
        System.out.print("Array is : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int start = 0 , end = arr.length - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reverse Array is : ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
