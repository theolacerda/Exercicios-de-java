import java.util.Scanner;



    public class Imc {

        public static void main (String[] args) {



                double kg = 0;

                double altura = 0;

                double imc = 0;



                Scanner ler = new Scanner (System.in);



                System.out.printf("Informe seu peso em kg= ");



                kg = Double.parseDouble(ler.nextLine());



                System.out.printf("Informe sua altura em metros= ");



                altura = Double.parseDouble(ler.nextLine());



                imc = kg / (Math.pow(altura, 2));



                ler.close();



                if (imc<20) {



                    System.out.println("Você está com um imc abaixo do normal");



                } else if(imc>=20 && imc <25){



                    System.out.println("Você está com um imc normal ");



                } else if(imc>=25 && imc <30){



                    System.out.println("Você está com sobrepeso");



                } else if(imc>=30 && imc <35){



                    System.out.println("Você está com obesidade leve");



                } else if(imc>=35 && imc <40){



                    System.out.println("Você está com obesidade moderada");



                } else if(imc>40) {

                   

                    System.out.println("Você está com obesidade mórbida ");



                }

        }

 }