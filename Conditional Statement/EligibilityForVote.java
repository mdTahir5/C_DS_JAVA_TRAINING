import java.util.Scanner;
public class EligibilityForVote {
    public static void main(String[] args) {
        System.out.print("Enter the Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("NOT Eligible for Vote");
        }
    }
}

