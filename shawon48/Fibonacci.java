import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last number of the series: ");
        int n = input.nextInt();
        int a = 0;
        int b =1; 
        int c;
        int i;

        for(i = 1; i<=n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        
    }
    
}
