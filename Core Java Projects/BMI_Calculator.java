package COREJavaProjects;

import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weight in kg : ");
        float w = sc.nextFloat();
        System.out.print("Enter the Height in meter : ");
        float h = sc.nextFloat();
        System.out.print("Your BMI is : " + (w/(h*h)));
    }
}