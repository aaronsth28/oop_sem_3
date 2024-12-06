import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("Enter distance in miles: ");
        Scanner sc=new Scanner(System.in);
        int distance = sc.nextInt();

        double km=distance*1.6;
        System.out.println(km);
    }
}
