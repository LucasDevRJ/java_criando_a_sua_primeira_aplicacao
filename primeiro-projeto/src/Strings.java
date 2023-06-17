public class Strings {
    public static void main(String[] args) {
        String nome = "Alura";

        String saudacao = "Olá, ";
        String nome2 = "Alura";
        String mensagem = saudacao + nome2 + "!";

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        String mensagem2 = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
    }
}
