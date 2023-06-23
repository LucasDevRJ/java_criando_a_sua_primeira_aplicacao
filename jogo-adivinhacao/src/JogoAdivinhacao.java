import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroSorteado = new Random().nextInt(100);
        Scanner entrada = new Scanner(System.in);

        for (int tentativas = 5; tentativas > 0; tentativas--) {
            System.out.print("Digite o número: ");
            int numeroAdivinhado = entrada.nextInt();

            if (numeroAdivinhado > numeroSorteado) {
                System.out.println("Errou!! O número adivinhado é maior que o número sorteado!");
            } else if (numeroAdivinhado < numeroSorteado) {
                System.out.println("Errou!! O número adivinhado é menor que o número sorteado!");
            } else {
                System.out.println("Acertou!!");
                break;
            }
        }
    }
}
