import java.util.Random;

import java.util.Scanner;


public class Aposta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        int numS = random.nextInt(100) + 1;

        int tent = 0;

        int tentF = 0;


        System.out.println("Escolha um número entre 1 e 100");


        do {

            System.out.print("Digite o número: ");


            while (!scanner.hasNextInt()) {

                System.out.println(" Digite um número inteiro.");

                scanner.next();

            }


            tent = scanner.nextInt();

            tentF++;


            if (tent < numS) {

                System.out.println("Chutou muito baixo -_-");

            } else if (tent > numS) {

                System.out.println("Chutou muito alto -_-");

            } else {

                System.out.println("Você acertou em " + tentF + " tentativas");

            }


        } while (tent != numS);


        scanner.close();

    }

}