
import java.util.Scanner;

public class exercício1 {
    public static void main (String[] args){

        double Chuveiro1 = 8500;
        double Chuveiro2 = 5000;
        double Chuveiro3= 7500;


        System.out.println("Informe a tensão do chuveiro: ");
        Scanner sc = new Scanner(System.in);
        double tensao = sc.nextInt();

        double corrente1 = Chuveiro1 / tensao;
        double corrente2 = Chuveiro2 / tensao;
        double corrente3 = Chuveiro3 / tensao;

        System.out.printf("Corrente para Chuveiro 01 (8500W): %.2f A%n" ,corrente1);
        System.out.printf("Corrente para chuveiro 02 (7500W): %.2f A%n" ,corrente2);
        System.out.printf("Corrente para Chuveiro 03 (7500W): %.2f A%n" ,corrente3);

    }
}
