import java.util.*;

public class STRING_2_find_occurence_palindrome_words {
    public static int occurence(String str){
        String words[]=str.split(" ");
        int count =0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(palindrome(word)){
                count++;
            }

        }
        return count;
    }
    public static boolean palindrome(String word){
        int s=0;
        int e=word.length()-1;
        while(s<e){
            if(Character.toLowerCase(word.charAt(s))!=Character.toLowerCase(word.charAt(e))){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(occurence(str));
    }
}
