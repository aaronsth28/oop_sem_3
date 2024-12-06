import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();

        System.out.println("Enter height");
        Scanner in2 = new Scanner(System.in);
        double height = in2.nextDouble();

        double volume =Math.PI *radius *radius *height;

        System.out.println("Volume is:"+ volume);
    }
}
