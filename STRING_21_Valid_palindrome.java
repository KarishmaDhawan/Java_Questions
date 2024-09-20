import java.util.Scanner;

public class STRING_21_Valid_palindrome {
    public static boolean ispalindrome(String str){
        str=str.toLowerCase().replace("[^a-z0-9]","");
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ispalindrome(str));
    }
}
