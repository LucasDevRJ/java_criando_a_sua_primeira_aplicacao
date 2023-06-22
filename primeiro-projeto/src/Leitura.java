import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println(String.format("O filme digitado é %s", filme));
    }
}
