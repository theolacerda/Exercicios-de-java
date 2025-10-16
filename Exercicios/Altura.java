import java.util.Scanner;

 public class Altura {



    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double pesoideal = 0;



        System.out.println("Digite seu sexo(1 = homem | 2 = mulher); ");

        int sexo = ler.nextInt();



        System.out.println("Digite sua altura em metros: ");

        double altura = ler.nextDouble();



        if (sexo == 1) {

            pesoideal = (72.7 * altura) - 58;

        } else if (sexo == 2) {

            pesoideal = (62.1 * altura) - 44.7;

        } else {

            System.out.println("sexo invalido");

              ler.close();

              return;

            }

        System.out.printf("Seu peso ideal é: %.2f kg\n", pesoideal);

        System.out.println("Digite seu peso atual: ");

        double pesoAtual = ler.nextDouble();

       

        if (pesoAtual < pesoideal) {

            System.out.println("Você está abaixo do peso ideal. ");

        } else if (pesoAtual > pesoideal) {

            System.out.println("Você está acima do peso ideal. ");

        } else {

            System.out.println("Você está no peso ideal. ");

        }

       

        ler.close();

    }

 }