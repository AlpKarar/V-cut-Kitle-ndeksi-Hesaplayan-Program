import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        float height, bodyMassIndex;
        int mass;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your height in m: ");
        height = input.nextFloat();
        
        System.out.print("Please enter your mass in kg: ");
        mass = input.nextInt();
        
        bodyMassIndex = mass/(height*height);
        
        System.out.print("Your Body Mass Index: " + bodyMassIndex);
    }
}
