import java.util.Scanner;

public class DesafioFruta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eescolha uma fruta: Banana, Maça ou Pera?");
        System.out.print("R: ");
        String escolha = scan.next();
        escolha = escolha.toLowerCase();
        switch (escolha) {
            case "banana" -> System.out.println("A Banana é uma fruta de macho!");
            case "maça" -> System.out.println("A Maça é uma fruta crocante!");
            case "pera" -> System.out.println("A Pera é uma fruta suculenta!");
            default -> System.out.println("You Burro man?!");
        }
    }
}
