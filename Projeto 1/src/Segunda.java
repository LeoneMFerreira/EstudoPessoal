import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n1 - Registrar\n2 - Logar");
        String Escolha = scan.next();

        if(Escolha.equals("1")){
            System.out.println("Nome do Usuario:");
            String nome = scan.next();
            System.out.println("Senha:");
            String senha = scan.next();

            System.out.println("Está correto?\nNome: "+nome+"\nSenha: "+senha);
            System.out.println("Digite \"S\"");
        }


    }
}
