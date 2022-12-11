import java.util.Scanner;

public class Lab0203 {
    public static void main(String[] args) {
        Scanner weight  = new Scanner(System.in);
        System.out.println( "Please enter your weight: " );
        Scanner height = new Scanner(System.in);
        System.out.println( "Please enter your height : " );
        float H = height.nextFloat();
        float W = weight.nextFloat();
        float  BMI= W / (2*H);
        if (BMI<= 18.5){
            System.out.println("Underweight" );
            System.out.println(" You need to increase weight");
        } else if (18.5 < BMI && BMI<= 24.9){
            System.out.println("Normal weight");
        } else if (BMI>25 && BMI<=29.9) {
            System.out.println("Overweight");
            System.out.println(" You need to decrease weight");

        }else {
            System.out.println("Obesity");
            System.out.println(" You need to decrease weight");

        }

    }
}
