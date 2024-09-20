import java.util.Scanner;

public class STRING_4_reverse_string {
    public static String reversestring(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    static String reverse_String(String str) {
        // Write your code here
        char chars[]=str.toCharArray();
        int i=0;
        int j=chars.length-1;
        while(i<j){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        i++;
        j--;
        }
        return new String(chars);
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reversestring(str));
        System.out.println(reverse_String(str));
    }
}
