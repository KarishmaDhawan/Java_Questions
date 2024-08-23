import java.util.Scanner;

public class toeplitzmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        boolean istoeplitz=true;
        int matrix[][]=new int[r][c];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j] != matrix[i-1][j-1]){
                    istoeplitz=false;
                    break;
                }
            }
            if(!istoeplitz){
            break;
            }
        }
        if(istoeplitz){
        System.out.println("True");
    }
        else{
        System.out.println("False");
    }
    }
}
