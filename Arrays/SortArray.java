package Arrays;

public class SortArray {
    public static void main(String[] args) {
        int []arr = {1,7,3,11,24,9};
        System.out.print("Array is : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        for(int i=0; i<arr.length - 1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array is : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
