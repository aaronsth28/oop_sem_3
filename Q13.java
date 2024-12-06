import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        System.out.println("Enter the quantity of the product u have purchased:");
        Scanner sc = new Scanner(System.in);

        int q=sc.nextInt();

        System.out.println("Enter the price of the product:");
        Scanner sc1 = new Scanner(System.in);
        int p=sc1.nextInt();

        int total = q*p;

        System.out.println(total);
    }
}
