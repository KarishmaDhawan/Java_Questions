import java.util.Scanner;

public class kaprekarornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp,sqr,sum=0,a=0,b=0,c=1;
        sqr=num*num;
        temp=num;
        while(temp!=0){
            c=c*10;
            temp=temp/10;
        }
        a=sqr%c;
        b=sqr/c;
        sum=a+b;
        if(sum==num){
            System.out.println("Kaprekar");
        }
        else{
            System.out.println("Not Kaprekar");
        }
    }
}
