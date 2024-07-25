import java.util.*;
public class OTP_Generator {
    public static void main(String[] args) {
        Random rd = new Random();
        // To Store the Random Number
        int myOTP = rd.nextInt(1000000);
        System.out.print("Your OTP is : " + myOTP);
    }
}