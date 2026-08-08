import java.util.Scanner;

public class StarTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row or cloumn: ");
        int n = input.nextInt();

        int i; int j; 

        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*   ");
            }
            System.out.println("\n");
        }

    }
}
}
