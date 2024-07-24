package Arrays;

public class AverageofSumArray {
    public static void main(String[] args) {
        int [] arr = {1,3,7,9,11,24};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println("Sum is : " + sum);
        int avg = sum / arr.length;
        System.out.println("Average of Sum is : " + avg);
    }
}
