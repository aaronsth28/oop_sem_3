import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        System.out.println("Enter the exchange rate of US Dollars");
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();

        System.out.println("Enter the amount");
        Scanner sc1 = new Scanner(System.in);

        double amount = sc1.nextDouble();

        double price = amount * rate;

        System.out.println(price);
    }
}
