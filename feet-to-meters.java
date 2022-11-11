import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter measurement in feet: ");
        double feet = sc.nextDouble();
        double meters = feet * 0.305;
        
        String roundedOff = String.format("%.2f", meters);
        
        System.out.print("Equivalent meters = " + roundedOff);
    }
}