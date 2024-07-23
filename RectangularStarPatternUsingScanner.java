import java.util.Scanner;

public class RectangularStarPatternUsingScanner {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scc.nextInt();
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
