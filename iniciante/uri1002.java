package iniciante;
import java.util.Scanner;

public class uri1002 {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double area = Math.pow(raio, 2) * PI;

        System.out.println("A=" + area);

        sc.close();
    }
}
