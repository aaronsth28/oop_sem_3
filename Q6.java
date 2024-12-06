import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter temperature in degrees Celsius: ");
        Scanner C = new Scanner(System.in);
        double temp = C.nextDouble();

        double fahrenheit = temp *(1.8) +32;

        System.out.println(fahrenheit);
    }
}
