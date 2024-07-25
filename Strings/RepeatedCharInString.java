package Strings;

public class RepeatedCharInString {
    public static void main(String[] args) {
        String str = "abcdeeeeefgh";
        char name = ' ';
        int cnt = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                name = str.charAt(i);
                cnt++;
            }
        }
        System.out.print("Repeated Character is : " + name);
        System.out.println();
        System.out.print("Count is : " + (cnt+1));

    }
}
