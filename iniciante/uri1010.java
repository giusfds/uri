package iniciante;
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados da peça 1
        int codigoPeca1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        // Leitura dos dados da peça 2
        int codigoPeca2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        // Cálculo do valor total a ser pago
        double valorAPagar = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);

        // Impressão do resultado formatado
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);

        sc.close();
    }
    
}
