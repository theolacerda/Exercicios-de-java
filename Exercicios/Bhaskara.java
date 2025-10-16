import java.util.Scanner;

  public class Bhaskara {

    public static void main (String args[]) {

        Scanner ler = new Scanner (System.in);

        Double A = 0.0;

        Double B = 0.0;

        Double C = 0.0;

        Double Delta = 0.0;

        Double x1 = 0.0;

        Double x2 = 0.0;


         

          System.out.println("Digite o A:");

           A = ler.nextDouble();

          System.out.println("Digite o B:");

           B = ler.nextDouble();

          System.out.println("Digite o C:");

           C = ler.nextDouble();


           Delta = B*B - 4*A*C;


           if(Delta<0) {

            System.out.println("Delta Menor que zero!");


           }else {

            x1 = (-B + Math.sqrt(Delta)) / (2 * A);

            System.out.println("x1 = " + x1);

            x2 = (-B - Math.sqrt(Delta)) / (2 * A);

            System.out.println("x2 = " + x2);

           }

             

      }

  } 