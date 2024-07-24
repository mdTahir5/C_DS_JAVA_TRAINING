package Methods;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int l = sc.nextInt();
        System.out.print("Enter the Breadth : ");
        int b = sc.nextInt();
        rectangularArea(l,b);
    }
    private static void rectangularArea(int length, int breadth) {
        System.out.println("Area of Rectangle is : " + (length*breadth));
    }
}
