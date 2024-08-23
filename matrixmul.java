import java.util.Scanner;

public class matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int matrix1[][]=new int[r1][c1];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int matrix2[][]=new int[r2][c2];
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("Invalid Input");
            return;
        }

        int prd[][]=new int[r1][c2];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }
    }
}
