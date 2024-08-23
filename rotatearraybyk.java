import java.util.Scanner;

public class rotatearraybyk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        int k=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        rotate(nums,k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void rotate(int nums[],int k){
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
