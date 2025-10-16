 import java.util.Scanner;

public class calculadoraPg {


    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        double A1 = 0.0;

        double Q = 0.0;

        double N = 0.0;

        double total = 0.0;

       


        System.out.println("Digite o A1");

        A1 = ler.nextDouble();

        System.out.println("Digite o Q");

        Q = ler.nextDouble();

        System.out.println("Digite o N");

        N = ler.nextDouble();


        ler.close();


       total = A1 * (Math.pow(Q , N-1));

        System.out.println("E o valor final é: " + total);

        }

    }