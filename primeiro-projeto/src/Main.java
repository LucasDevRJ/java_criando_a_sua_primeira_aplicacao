public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média do filme: " + media);

        String nomeFilme = "Top Gun: Maverick";
        System.out.println(String.format("O filme %s possui a média de %.1f", nomeFilme, media));

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println("Sinopse do Filme: " + sinopse);

        //Text Block
        String descricao = """
                    Filme: Top Gun: Maverick
                    Ano de lançamento: 
                """ + anoDeLancamento;

        String descricaoFormatada = """
                    Filme: %s
                    Ano de lançamento: %d
                    Nota do Filme: %.0f
                    Sinopse: %s
                """.formatted(nomeFilme, anoDeLancamento, notaDoFilme, sinopse);

        System.out.println(descricaoFormatada);
    }
}