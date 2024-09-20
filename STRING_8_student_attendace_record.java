import java.util.Scanner;

public class STRING_8_student_attendace_record {
    public static boolean attendance(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                count++;
                if(count>1){
                    return false;
                }
            }
            
            if(i>=2 && str.charAt(i)=='L' && str.charAt(i-1)=='L' && str.charAt(i-2)=='L'){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(attendance(str));
    }
}
