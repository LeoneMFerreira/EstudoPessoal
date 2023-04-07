import java.util.Scanner;
public class DesafioProduto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do produto?");
        String nome = scan.nextLine();
        System.out.println("Qual o preço do produto?");
        double preco = scan.nextDouble();
        System.out.println("Iforme a quantidade da unidade em estoque:");
        int unidades = scan.nextInt();
        if (unidades > 0) {
            System.out.println("Temos produtos no estoque!");
            double somar = preco * unidades;
            System.out.println("O valor da soma do produto" + nome + "é: "
            +somar);}
        else {
            System.out.println("Temos que repor o produto");
        }
    }
}
