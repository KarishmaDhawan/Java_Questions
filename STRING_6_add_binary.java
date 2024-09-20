import java.util.Scanner;

public class STRING_6_add_binary {
    public static String addbinary(String a, String b){
        StringBuilder sb=new StringBuilder();
        int n1=a.length()-1;
        int n2=b.length()-1;
        int carry=0;
        int base=2;
        while(n1>=0||n2>=0){
            int t1=0,t2=0,sum;
            if(n1>=0){
                t1=a.charAt(n1--)-'0';
            }
            if(n2>=0){
                t2=b.charAt(n2--)-'0';
            }
            sum=t1+t2+carry;
            if(sum>=base){
                carry=1;
                sum=sum-base;
            }
            else{
                carry=0;
            }
            sb.append(sum);
        }
        if(carry==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(addbinary(str1,str2));
    }
}
