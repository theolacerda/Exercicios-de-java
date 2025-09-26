import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1=0;
        double num2=0;
        int ents =0;
        String op;
        
        System.out.println("Digite 1 para usar a calculadora ou 0 para sair do programa:");
        ents= ler.nextInt();

        while(ents==1){
             System.out.println("Digite o primeiro numero: ");
        num1= ler.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2= ler.nextDouble();

        System.out.println("Qual operacao deseja fazer? +, -, *, /");
        op= ler.next();
        
        switch(op){
            case"+":
                System.out.println("A soma dos numeros e: " + (num1+num2));
                break;

            case"-":
                System.out.println("A subtracao dos numeros e: " + (num1-num2));
                break;       
            case"*":
                System.out.println("A multiplicacao dos numeros e: " + (num1*num2));
                break;  
            case"/":
                if(num2==0){
                    System.out.println("Impossivel dividir por 0"); 
                }else{
                        System.out.println("A divisao dos numeros e: " + (num1/num2));
                        }
                break;  
            default:
                System.out.println("Operacao invalida");
                break;
            
                    
                    }
            System.out.println("Digite 1 para usar a calculadora ou 0 para sair do programa:");
        ents= ler.nextInt();
        }
        if(ents==0){
            System.exit(0);
        }
    }
}