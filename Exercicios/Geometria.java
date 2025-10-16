import java.util.Scanner;



public class Geometria {

    public static void main(String[] args) {



        Scanner ler = new Scanner(System.in);



        System.out.println("Qual o valor de A? ");

        int A = ler.nextInt();



        System.out.println("Qual o valor de B? ");

        int B = ler.nextInt();



        System.out.println("Qual o valor de C? ");

        int C = ler.nextInt();



        if (A + B > C && A + C > B && B + C > A) {

            if (A == B && B == C) {

                System.out.println("É um triângulo Equilátero.");

            } else if (A == B || A == C || B == C) {

                System.out.println("É um triângulo Isósceles.");

            } else {

                System.out.println("É um triângulo Escaleno.");

            }

        } else {

            System.out.println("Os valores informados não formam um triângulo.");

        }



        ler.close();

    }

}