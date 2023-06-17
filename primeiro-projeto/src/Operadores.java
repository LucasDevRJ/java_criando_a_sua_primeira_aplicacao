public class Operadores {
    public static void main(String[] args) {
        int valor =  5;  //Atribui o valor 5 à variável valor

        int valor2 =  10;
        valor2 += 15;  //Equivalente a valor = valor + 15, atribui o valor 15 à variável valor

        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

        int f = 10; // Atribui o valor 10 à variável a
        int g = 5; // Atribui o valor 5 à variável b
        int h = 30; // Atribui o valor 30 à variável c

        boolean igual = (f == g); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de f não é igual o valor de g.
        boolean diferente = (f != h); //A variável diferente ficará com o valor *true*, pois o valor de f é diferente do valor de h.
        boolean maior = (f > g); //A variável maior ficará com o valor *false*, pois o valor de f é menor que o valor de g.
        boolean menorIgual = (f <= h); //A variável menorIgual ficará com o valor *true*, pois o valor de f é menor que o valor de h.

        boolean i = true;
        boolean j = false;
        if (i && j) {
            // Este código não será executado, já que i é verdadeiro e j é falso.
        }

        boolean k = true;
        boolean l = false;
        if (k || l) {
            // Este código será executado, já que k é verdadeiro, mesmo que l seja falso.
        }

        boolean m = true;
        if (!m) {
            // Este código não será executado, já que m é verdadeiro.
        }

        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2); // imprime 6
        System.out.println(resultado2); // imprime 5

    }
}
