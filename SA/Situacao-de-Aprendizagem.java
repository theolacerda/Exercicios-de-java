import java.util.Scanner;

   public class Situacao-de-Aprendizagem{

    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        int opt = 1;

        float total = 0;

        System.out.println("escolha a forma que deseja calcular: ");

        while (opt>0){

            System.out.println("Digite 0 para sair: ");

            System.out.println("Digite 1 para Triangulo: ");

            System.out.println("Digite 2 para Trapézio: ");

             System.out.println("Digite 3 para Circulo: ");

              System.out.println("Digite 4 para Quadrado: ");

               System.out.println("Digite 5 para Retangulo: ");

                System.out.println("Digite 6 para Diametro: ");

                System.out.println("Digite 7 para Losango: ");

                System.out.println("Digite 8 para calcular o pi: ");

                 opt =  ler.nextInt();


            if (opt==1){

               float H = 0;

               float B = 0;

               int C = 1;

               int p1= 0;

               int p2= 0;

               int p3= 0;

               int p4= 0;

               System.out.println("Digite 1 para área 2 para perimetro: ");

                C = ler.nextInt();

                if (C==1){

                    System.out.println(" Digite a  Altura: ");

                    H = ler.nextFloat();

                    System.out.println(" Digite a  Base: ");

                    B = ler.nextFloat();

                    total = (H*B)/2;

                    System.out.println("O total da area do triangulo é: "+total);

                }else {

                    System.out.println("Informe o valor do primeiro lado: ");

                    p1 = ler.nextInt();

                    System.out.println("Informe o valor do segundo lado: ");

                    p2 = ler.nextInt();

                    System.out.println("Informe o valor do terceiro lado: ");

                    p3 = ler.nextInt();

                    p4 = (p1+p2+p3);

                    System.out.println("o perimetro do triangulo é igual a: "+p4+"\n\n\n");

                }


            }

            if (opt== 2){

               int B = 0;

               int b = 0;

               int C = 1;

               int h= 0;

               int p1= 0;

               int p2= 0;

               int p4= 0;

               System.out.println("Digite 1 para área 2 para perimetro: ");

                C = ler.nextInt();

                if (C==1){

                    System.out.println(" Digite a  Base maior: ");

                    B = ler.nextInt();

                    System.out.println(" Digite a  Base menor: ");

                    b = ler.nextInt();

                    System.out.println(" Digite a  altura: ");

                    h = ler.nextInt();

                   

                    total = (B*b)*h/2;

                    System.out.println("O total da area do trapézio é: "+total);

                }else {

                    System.out.println(" Digite a  Base maior: ");

                    B = ler.nextInt();

                    System.out.println(" Digite a  Base menor: ");

                    b = ler.nextInt();

                    System.out.println("Informe o valor do primeiro lado: ");

                    p1 = ler.nextInt();

                    System.out.println("Informe o valor do segundo lado: ");

                    p2 = ler.nextInt();

                   

                    p4 = (B+b+p1+p2);

                    System.out.println("o perimetro do trapézio é igual a: "+p4+"\n\n\n");

                }

            }

            if (opt== 3){

               int a = 0;

               float pi = 0;

               int C = 1;

               int h= 0;

               int p1= 0;

               int p2= 0;

               float p4= 0;

               System.out.println("Digite 1 para área 2 para Circunferencia: ");

                C = ler.nextInt();

                if (C==1){

                    System.out.println(" Digite o raio: ");

                    a = ler.nextInt();

                    System.out.println(" Digite o pi: ");

                    pi = ler.nextFloat();

                    total = pi*(a*a);

                    System.out.println("O total da area do Circulo é: "+total);

                }else {

                     System.out.println(" Digite o raio: ");

                    a = ler.nextInt();

                    System.out.println(" Digite o pi: ");

                    pi = ler.nextFloat();

                    p4 = a*(pi*pi);

                    System.out.println("A Circunferencia do circulo é igual a: "+p4+"\n\n\n");

                }

            }

            if (opt== 4){

               int l = 0;

               int C = 1;

               int p4= 0;

               System.out.println("Digite 1 para área 2 para perimetro: ");

                C = ler.nextInt();

                if (C==1){

                    System.out.println(" Digite o valor do lado: ");

                    l = ler.nextInt();

                    total = (l*l);

                    System.out.println("O total da area do quadrado é: "+total);

                }else {

                    System.out.println(" Digite o valor do lado: ");

                    l = ler.nextInt();

                    p4 = (l*4);

                    System.out.println("o perimetro do quadrado é igual a: "+p4+"\n\n\n");

                }

            }

             if (opt== 5){

               int B = 0;

               int C = 1;

               int h= 0;

               

               int p4= 0;

               System.out.println("Digite 1 para área 2 para perimetro: ");

                C = ler.nextInt();

                if (C==1){

                    System.out.println(" Digite a  Base : ");

                    B = ler.nextInt();

                    System.out.println(" Digite a  altura: ");

                    h = ler.nextInt();

                   

                    total = (B*h);

                    System.out.println("O total da area do retangulo é: "+total);

                }else {

                    System.out.println(" Digite a  Base: ");

                    B = ler.nextInt();

                    System.out.println("Digite a altura: ");

                    h = ler.nextInt();

                    p4 = 2*(B+h);

                    System.out.println("o perimetro do retangulo é igual a: "+p4+"\n\n\n");

                }

            }

            if (opt== 6){

               int r = 0;

               int d = 0;

               int C = 1;

               int p4= 0;

               System.out.println("Digite 1 para Diametro 2 para raio: ");

                C = ler.nextInt();

                if (C==1){

                    System.out.println("Informe o raio: ");

                    r = ler.nextInt();

                 total = (r*r);

                    System.out.println("O total do diametro é: "+total);

                }else {

                   System.out.println("Informe o diametro: ");

                    d = ler.nextInt();

                   

                    p4 = (d/2);

                    System.out.println("o raio é igual a: "+p4+"\n\n\n");

                }

            }

             if (opt== 7){

               int D = 0;

               int d = 0;

               int l = 0;

               int C = 1;

               int p4= 0;

               System.out.println("Digite 1 para área 2 para perimetro: ");

                C = ler.nextInt();

                if (C==1){

                    System.out.println(" Digite a  Diagonal maior: ");

                    D = ler.nextInt();

                    System.out.println(" Digite a  Diagonal menor: ");

                    d = ler.nextInt();

                   total = (D*d)/2;

                    System.out.println("O total da area do Losango é: "+total);

                }else {

                    System.out.println(" Digite o lado: ");

                    l = ler.nextInt();

                   

                   

                    p4 = (l*4);

                    System.out.println("o perimetro do tlosango é igual a: "+p4+"\n\n\n");

                }

            }

            if (opt== 8){

               float c = 0;

               float d = 0;

               float p4 = 0;

               System.out.println("Informe a circunferencia: ");

               c = ler.nextFloat();

               System.out.println("Informe o diametro: ");

               d = ler.nextFloat();

               p4 = (c/d);

              System.out.println("pi é igual a: "+p4);

               

            }

        }

    }

}

  