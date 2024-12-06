import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter principal");
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();

        System.out.println("Enter Time:");
        Scanner sc1 = new Scanner(System.in);
        double time = sc.nextDouble();

        System.out.println("Enter Rate");
        Scanner sc2= new Scanner(System.in);
        double rate = sc2.nextDouble();

        double SI=(principal*time*rate)/100;

        System.out.println(SI);
    }
}
