import java.util.Scanner;

public class STRING_3_capitalize_first_letter {
    public static String capital(String str){
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            words[i]=Character.toUpperCase(word.charAt(0))+word.substring(1);
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(capital(str));
    }
}
