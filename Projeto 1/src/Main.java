import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println ("Arroz");
//        System.out.println ("Feijão");

        //Testando Scanner
        //in = entrada Out = Saida
        //String é alguma variavel seja numero,objetos ou até codigos
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scan.next();
        System.out.println("Seja bem vindo "+nome);

        //Analisando idade
        //int Numeros inteiros
        System.out.println("Qual a sua idade?");
        int Idade = scan.nextInt();

        //Se idade for maior que ou igual a 18
        //if se for positivo
        if(Idade>=18) {
            System.out.println("Legal vc é maior de idade");
        }
        //else se for negativo
        else{
            System.out.println("A que pena vc é menor de idade");
        }
    }

}