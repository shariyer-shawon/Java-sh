import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] argsf){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Largest number is the first number = " + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.err.println("Largest number is the second number = " + num2);
        }
        else{
            System.out.println("Largest number is the third number = " + num3);
            
        }
        input.close();
    }
}