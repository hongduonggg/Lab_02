import java.util.Scanner;

public class Lab0201 {
    public static void main(String[] args) {
        Scanner height = new Scanner(System.in);
        System.out.println( "Enter number height: " );
        Scanner weight = new Scanner(System.in);
        System.out.println( "Enter number weight: " );
        float H = height.nextFloat();
        float W = weight.nextFloat();
        Float  BMI= W / (2*H);
        if (BMI<= 18.5){
            System.out.println("Underweight---  ");
        } else if (18.5 < BMI && BMI<= 24.9){
            System.out.println("Normal weight");
        } else if (BMI>25 && BMI<=29.9) {
            System.out.println("Overweight ");
            
        }else {
            System.out.println("Obesity ");
        }
    }
}
