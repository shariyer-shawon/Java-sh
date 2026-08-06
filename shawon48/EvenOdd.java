import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        
        if(number % 2 == 0){
            System.out.println(number + " is an Even Number.");
        }
        else{
            System.out.println(number + " is a Odd Number.");
        }

        input.close();
    }    
}
