import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        System.out.print("Enter the Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String eligible = (age >= 18) ? "Eligible for Vote" : "NOT Eligible for Vote";
        System.out.println(eligible);
    }
}
