import java.util.Scanner;

public class STRING_14_length_of_last_word {
    public static int last(String str){
        str=str.trim();
        int last=str.lastIndexOf(' ');
        return str.length()-last-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(last(str));
    }
}
