package Methods;

import java.util.Scanner;
public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Earning : ");
        int earning = sc.nextInt();
        System.out.print("Enter the Expenses : ");
        int expenses = sc.nextInt();

        System.out.print("Enter the EarningUPI : ");
        float earningUPI = sc.nextFloat();
        System.out.print("Enter the ExpensesUPI : ");
        float expensesUPI = sc.nextFloat();
        // Methods Calls
        System.out.println("Saving is : " + totalSaving(earning,expenses));
        System.out.println("SavingUPI is : " + totalSaving(earningUPI,expensesUPI));
    }
    private static int totalSaving(int earn , int exp){
        return earn-exp;
    }
    private static float totalSaving(float earn , float exp){
        return earn-exp;
    }
}
