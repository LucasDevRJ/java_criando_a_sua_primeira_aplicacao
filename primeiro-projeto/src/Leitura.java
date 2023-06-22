import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //classe para ler valores na entrada de dados
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito:");
        String filme = leitura.nextLine(); //armazenando valor do tipo String

        System.out.printf("Digite o ano de lançamento do %s:", filme);
        int ano = leitura.nextInt();

        System.out.printf("Digite a sua nota de 0 a 10 para o %s:", filme);
        int nota = leitura.nextInt();

        System.out.printf("\nFilme: %s", filme);
        System.out.printf("\nAno: %d", ano);
        System.out.printf("\nNota: %d", nota);
    }
}
