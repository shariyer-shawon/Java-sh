import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your last number of the series: ");
        int n = input.nextInt();
        double sum = 0.0;
        int i ;

        for(i=1; i<=n; i++){
            sum = sum + i/ (Math.pow(2, i));
        }
        System.out.println("Sum of the series: " + sum);
        input.close();
    } 
}
