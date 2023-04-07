import java.util.Scanner;
public class DesafioSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu Salário: ");
        System.out.print("R$: ");
        double porcentagem;
        double salario = scan.nextDouble();
        double novoSalario;
        if (salario <= 1000) {
            System.out.println("Calculando aumento aguarde...");
            porcentagem = (salario * 0.20);
            novoSalario = (salario + porcentagem);
            System.out.println("Salário atual de: " + novoSalario + "!");
            }
        else if (salario < 2000) {
            System.out.println("Calculando aumento aguarde:...");
            porcentagem = (salario * 0.15);
            novoSalario = (salario + porcentagem);
            System.out.println("Salário atual de: " + novoSalario + "!");
        }
        else if (salario < 3000) {
            System.out.println("Calculando aumento aguarde:...");
            porcentagem = (salario * 0.10);
            novoSalario = (salario + porcentagem);
            System.out.println("Salário atual de: " + novoSalario + "!");
        }
        else {
            System.out.println("Calculando aumento aguarde:...");
            porcentagem = (salario * 0.05);
            novoSalario = (salario + porcentagem);
            System.out.println("Salário atual de: " + novoSalario + "!");
        }
        }
    }