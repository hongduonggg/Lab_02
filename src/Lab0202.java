import java.util.Scanner;

public class Lab0202 {
    public static void main(String[] args) {
        Scanner scannerNum= new Scanner(System.in);
        System.out.println( "Enter number: " );
         int n= scannerNum.nextInt();
        if (n % 2==0){
            System.out.println( "This number is an even number");
        }else {
            System.out.println("This number is an odd number");
        }
    }
}
