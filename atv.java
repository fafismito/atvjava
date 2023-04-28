import java.util.Scanner;

public class atv {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite seu nome");
         String nome = sc.nextLine();

         System.out.println("Digite sua idade");
         int idade = sc.nextInt();

         System.out.println("Digite seu telefone");
         double telefone = sc.nextInt();

         System.out.println("Digite sua nota");
         double nota = sc.nextDouble();

         System.out.println("Digite seu número de faltas");
         double falta = sc.nextDouble();

        

         if (nota>5 || falta>=20 && falta==20){
         System.out.println("Reprovado. ");
         }
         if (nota<5 || falta>=20 && falta == 20){
            System.out.println("Reprovado. ");
        }
        if (nota==5 || falta>=20 && falta==20){
            System.out.println("Você está com a média aceitável e faltas controladas. Aprovado. ");
        }

        }

       }
        
       
