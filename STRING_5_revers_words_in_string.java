import java.util.*;

public class STRING_5_revers_words_in_string {
    public static String reverse_words(String str){
        str=str.trim();
        String words[]=str.split("\\s+");
        String ans="";
        for(int i=words.length-1;i>=0;i--){
            ans=ans+words[i]+" ";
        }
        return ans.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse_words(str));
    }
}
