package COREJavaProjects;

import java.util.*;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for INR to USD");
        System.out.println("Enter 2 for USD to INR");
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                inrTousd();
                break;
            case 2:
                usdToinr();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    private static void inrTousd() {
        System.out.print("Enter the Amount in INR : ");
        Scanner sc = new Scanner(System.in);
        float inr = sc.nextFloat();
        System.out.println("Your Amount in US Dollar are : " + (inr/83.76));
    }
    private static void usdToinr(){
        System.out.print("Enter the Amount in USD : ");
        Scanner sc = new Scanner(System.in);
        float usd = sc.nextFloat();
        System.out.println("Your Amount in Indian Rupees are : " + (usd*83.76));
    }
}