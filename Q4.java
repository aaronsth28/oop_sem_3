import javax.xml.transform.Source;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        System.out.println("Enter the value of a:");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.println("Enter the value of b:");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.println("Enter the value of c:");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();

        int s=(a+b+c)/2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));;



        System.out.println(area);
    }
}
