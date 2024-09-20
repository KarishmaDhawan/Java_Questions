import java.util.*;

public class STRING_1_swap_first_last_char {
    public static String swap_char(String str){
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.length()>1){
                words[i]=word.charAt(word.length()-1)+word.substring(1, word.length()-1)+word.charAt(0);
            }
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(swap_char(str));
    }
}
