public class Conversor {
    public static void main(String[] args) {
        double temperaturaCelsius;
        double temperaturaFahrenheit;
        String resultado;
        int temperaturaFahrenheitEmInt;

        temperaturaCelsius = 23.40;
        temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;

        resultado = String.format("%.2fºC(Celsius) para Fahrenheit é %.2fºF", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(resultado);

        temperaturaFahrenheitEmInt = (int) temperaturaFahrenheit;

        resultado = String.format("%.2fºC(Celsius) para Fahrenheit é %dºF", temperaturaCelsius, temperaturaFahrenheitEmInt);

        System.out.println(resultado);
    }
}
