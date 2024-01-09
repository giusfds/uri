package iniciante;
import java.util.Scanner;

public class uri1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeVendedor = sc.nextLine();
        sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double comissao = 0.15 * totalVendas;

        double salarioTotal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);

        sc.close();
    }
}
