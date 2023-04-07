import java.util.Scanner;
public class DesafioGraus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Trasformar F em C ou C em F?");
        System.out.print("R: ");
        String temperatura = scan.nextLine();
        temperatura = temperatura.toLowerCase();
        System.out.println("Informe a Temperatura: ");
        double c;
        double f;
        switch (temperatura){
            case "f em c" -> {
                f = scan.nextDouble();
                c = (f - 32) * 5/9;
                System.out.println("A temperatura é: " + c +  "Celsius!" );
                break;
            }
            case "c em f" -> {
                c = scan.nextDouble();
                f = (c * 9/5) + 32;
                System.out.println("A temperatura é: " + f +  "Fahrenheit!");
                break;
            }
            default -> System.out.println("Erro");
        }
        }
    }
