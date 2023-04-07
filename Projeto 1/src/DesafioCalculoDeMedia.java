import java.util.Scanner;

public class DesafioCalculoDeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primeira nota do Aluno: ");
        System.out.print("R: ");
        double primeiraNota = scan.nextDouble();
        System.out.println("Segunda nota: ");
        System.out.print("R: ");
        double segundaNota = scan.nextDouble();
        System.out.println("Terceira nota: ");
        System.out.print("R: ");
        double terceiraNota = scan.nextDouble();
        double media = (primeiraNota + segundaNota + terceiraNota) /3;

       if (media >=7){
           System.out.println("Aprovado");
       }
       else if(media <7 && media >=4){
           System.out.println("Recuperação");
        }
       else if (media <4){
           System.out.println("Reprovado");
       }
        System.out.println("Sua média é " + media);
    }
    }

