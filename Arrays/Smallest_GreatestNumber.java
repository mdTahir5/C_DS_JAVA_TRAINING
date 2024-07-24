package Arrays;

public class Smallest_GreatestNumber {
    public static void main(String[] args) {
        int [] arr = {1,3,7,9,11,24};
        int smallNo = Integer.MAX_VALUE;
        int largerNo = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > largerNo){
                largerNo = arr[i];
            }
            if(arr[i] < smallNo){
                smallNo = arr[i];
            }
        }
        System.out.println("Greatest Number is : " + largerNo);
        System.out.println("Smallest Number is : " + smallNo);

    }
}