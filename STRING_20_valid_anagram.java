import java.util.*;
public class STRING_20_valid_anagram {
    public static boolean isanagram(String s1,String s2){
        char s1char[]=s1.toCharArray();
        char s2char[]=s2.toCharArray();
        Arrays.sort(s1char);
        Arrays.sort(s2char);

        return Arrays.equals(s1char,s2char);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isanagram(str1,str2));
    }
}
