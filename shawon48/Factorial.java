import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter a integer number: ");
        int n = input.nextInt();
        
        int fact = 1;

        for(i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("The factorial of the number is : " + fact);

        input.close();
    }
}
