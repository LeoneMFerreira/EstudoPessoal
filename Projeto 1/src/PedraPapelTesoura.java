import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        // 1 - Papel; 2 - Pedra; 3- Tesoura;.
        // U(1) C(2) = -1, Vencedor Usuario
        // U(1) C(3) = -2, Vencedor Computador
        // U(2) C(1) = 1, Vencedor Computador
        // U(2) C(3) = -1, Vencedor Usuario
        // U(3) C(1) = 2, Vencedor Usuario
        // U(3) C(2) = 1, Vencedor Computador
        Scanner scan = new Scanner(System.in);
        // O Scan Vai ler o que vier de entrada
        System.out.println("Escolha uma opção entre 1 a 3: \n 1)Papel \n 2)Pedra \n 3)Tesoura");
        System.out.print("R: ");
        Random gerador = new Random();
        // Random vai gerar um numero aleatório
        int numeroUsuario;
        int escolhaComputador;
        numeroUsuario = scan.nextInt();
        escolhaComputador = gerador.nextInt(3) + 1;// gera um numero entre 1 e 3
        // Switch imprime a escolha do computador
        switch (escolhaComputador) {
            // Case = Caso escolha essa opção.
            case 1 -> System.out.println("Computador escolheu: Papel!");
            case 2 -> System.out.println("Computador escolheu: Pedra!");
            case 3 -> System.out.println("Computador escolheu: Tesoura!");
        }
        // Ferificação do resultado
        if (numeroUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((numeroUsuario - escolhaComputador) == -1 ||
                    (numeroUsuario - escolhaComputador) == 2) {
            System.out.println("Usuario vencedor!");
        }
        else {
            System.out.println("Computador Vencedor!");
        }
    }
}