import java.util.Scanner;

  public class Senha {

    public static void main (String args[]) {

        Scanner ler = new Scanner(System.in);

        int senha = 0000;

           

         System.out.println("Digite a senha: ");

         senha = ler.nextInt();

         if(senha == 1234) {

            System.out.println("Acesso Permitido");

         } else {

            System.out.println("Acesso negado -_-");

         }

     

     }

    }