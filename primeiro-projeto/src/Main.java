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

        int classificacao;
        classificacao = (int) (media / 2);

        System.out.println(String.format("Classificação: %d", classificacao));

        //declarando variáveis com os tipos de dados
        long faixaEtariaLong = 24;
        int faixaEtariaInt = 18;
        byte faixaEtariaByte = 21;
        short faixaEtariaShort = 22;
        double faixaEtariaDouble = 25.0;

        //não irá funcionar porque o byte não armazena um inteiro
        //byte faixaEtariaByteParaInt = faixaEtariaInt;

        //também não funciona pois o short não armazena valores em inteiro
        //short faixaEtariaShortParaInt = faixaEtariaInt;

        //irá funcionar porque o int armazena byte
        int faixaEtariaIntParaByte = faixaEtariaByte;

        //irá funcionar porque o int armazena short
        int faixaEtariaIntParaShort = faixaEtariaShort;

        //também dará erro porque long aguenta mais bits que o int
        //int faixaEtariaIntParaLong = faixaEtariaLong;

        //double possui ponto flutuante, assim também dando erro
        //int faixaEtariaIntParaDouble = faixaEtariaDouble;

        //funciona porque o long armazena a quantidade de bits que o int possui
        long faixaEtariaLongParaInt = faixaEtariaInt;

        //também funciona, mas os números após a virgula não serão armazenados
        double faixaEtariaDoubleParaInt = faixaEtariaInt;

        /*
            Basicamente, para haver o casting entre tipos primitivo
            o tipo conversor deve aguentar o armazenamento do tipo a ser convertido
         */
    }
}