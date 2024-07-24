import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        // Using For Loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int m = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=m; i++){
            System.out.print(i +" ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of 1 to "+m+" is : " + sum);
        String num = (sum%2==0) ? "Sum is EVEN" : "Sum is ODD";
        System.out.println(num);

    }
}
