import java.util.Scanner;

public class nextfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int nextFib = a + b;

        while (nextFib <= n) {
            a = b;
            b = nextFib;
            nextFib = a + b;
        }

        System.out.println("The next closest Fibonacci number greater than " + n + " is: " + nextFib);
    }
}
