import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhação {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(10); // gera um número aleatório entre 0 e 10
        int tentativas = 0;
        int numerodigitado = 0;

        System.out.println("Este é um jogo de adivinhação.");
        System.out.println("Tente adivinhar o número da sorte, você tem 5 tentativas.");


        while (tentativas < 5) {
        System.out.println("Digite um número entre 0 e 10:");
            numerodigitado = leitor.nextInt();
        tentativas++;

        if (numerodigitado == numeroGerado) {
            System.out.println("Parabéns você acertou o número em "+ tentativas + "tentativas");
            break; // interrompe o loop while
        } else if (numerodigitado < numeroGerado) {
            System.out.println("O número digitado é menor que o numero da sorte.");
        } else {
            System.out.println("O número digitado é maior que o numero da sorte.");
        }

    }
        if (tentativas == 5 && numerodigitado != numeroGerado) {
            System.out.println("Que pena! Você não conseguiu acertar o número da sorte.");
        }
    }
}
