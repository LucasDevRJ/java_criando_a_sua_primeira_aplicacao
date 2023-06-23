import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int somaNotas = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota: ");
            int nota = leitura.nextInt();
            somaNotas += nota;
        }
        //casting para que a média seja com ponto flutuante
        double media = (double) somaNotas / 3;

        System.out.printf("Avaliação do filme: %.1f", media);
    }
}
