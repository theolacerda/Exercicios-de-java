import java.util.Scanner;


public class  SomaPg {


    public static void main(String args[]) {

    Scanner ler = new Scanner(System.in);

        double A1 = 0.0;

        double Q = 0.0;

        double N = 0.0;

        double Sn = 0.0;

       

       

      System.out.println("Digite A1");

        A1 = ler.nextDouble();


       System.out.println("Digite Q");

        Q = ler.nextDouble();


        System.out.println("Digite N");

        N = ler.nextDouble();

         

        ler.close();


        Sn = A1 * (Q * (N-1)) / (Q - 1);

         

        System.out.println("o resultado é igual a: " + Sn);

    }

}