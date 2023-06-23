import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int nota = 0;
        int somaNotas = 0;
        int quantidade = 0;
        while (nota != -1) {
            System.out.print("Digte sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextInt();
            if (nota > -1) {
                somaNotas += nota;
                quantidade++;
            }
        }

        double media = 0;
        media = (double) somaNotas / quantidade;
        System.out.printf("Avaliação do filme: %.1f", media);
    }
}
