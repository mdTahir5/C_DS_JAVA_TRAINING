import java.util.Scanner;

public class doWhileLoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int m = sc.nextInt();
        int i = 1 , sum = 0;
        do {
            System.out.print(i + " ");
            sum += i;
            i++;
        }
        while(i <= m);
        System.out.println();
        System.out.println("Sum of 1 to " + m + " is : " + sum);
        if(sum % 2 == 0)
            System.out.println("Sum is EVEN");
        else
            System.out.println("Sum is ODD");
    }
}
