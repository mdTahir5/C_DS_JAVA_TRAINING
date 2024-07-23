import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        // Using While Loop
        int n = 1 , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int m = sc.nextInt();
        while(n<=m){
            System.out.print(n + " ");
            sum += n;
            n++;
        }
        System.out.println();
        System.out.println("Sum of 1 to " + m +  " is : " + sum);
        String num = (sum%2==0) ? "Sum is EVEN" : "Sum is ODD";
        System.out.println(num);
    }
}
