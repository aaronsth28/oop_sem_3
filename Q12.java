import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        System.out.println("Enter radius:");
        Scanner sc =new Scanner(System.in);
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println(area);
    }
}
