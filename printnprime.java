import java.util.Scanner;

public class printnprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n=2;
        int count =0;
        int i;
        while(count<n1){
            for(i=2;i<n;i++){
                if(n%i==0){
                    break;
                }
            }
            if(i==n){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
