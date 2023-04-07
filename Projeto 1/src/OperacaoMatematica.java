import java.sql.SQLOutput;
import java.util.Scanner;

public class OperacaoMatematica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro Número: ");
        System.out.print("R: ");

        double pNumero = scan.nextInt();
        System.out.println("Operação: ");
        System.out.print("R: ");
        boolean positivo = true;
        String operacao = scan.next();
        double resultado;
        System.out.println("Segundo Número:");
        System.out.print("R: ");
        double sNumero = scan.nextInt();

        if (operacao.equals("*")){
            resultado = (pNumero * sNumero);
        }
        else if (operacao.equals("+")){
            resultado = (pNumero + sNumero);
        }
        else if (operacao.equals("-")){
          resultado = (pNumero - sNumero);
        }
        else if (operacao.equals("/")){
            resultado = (pNumero / sNumero);
        }
        else{
            resultado = 0;
            System.out.println("Erro 404 ");
            positivo = false;
        }
        if (positivo) {
            System.out.println("Resultado = " + resultado + "!");
        }

        }
    }
