import java.util.Scanner;

public class CelciusToFarenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Cescius temp: ");
        int CelTemp = input.nextInt();

        float FarTemp;
        FarTemp = (9*CelTemp)/5 + 32;

        System.out.println("The Farenheit temp: " + FarTemp);

        input.close();
    }
    
}
