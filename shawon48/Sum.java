import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double sum = input.nextDouble();
        int n = input.nextInt();
        int i = input.nextInt();

        for(i; i>=n; i++){
            sum = sum + i
        }
        input.close();
    } 
}
