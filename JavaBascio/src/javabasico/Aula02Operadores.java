package javabasico;

public class Aula02Operadores {
    public static void main(String[] args) {
        // <> == != >= <=
        // +, -, /(divisao), *(x), %(rest)
        // && (and) || (or)

        boolean IsDezDiferenteDez = 10 != 10.0;
        System.out.println(IsDezDiferenteDez);
        int num1 = 10;
        int num2 = 20;
        double resultado = num1 / (double) num2;
        System.out.println(resultado);


        int idade = 55;
        float salario = 3500F;
        boolean IsDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        System.out.println(IsDentroDaLeiMaiorQueTrinta);

        double ValorTotalContaCorrente = 8000;
        double ValorTotalContaPoupanca = 10000;
        float ValorMoto = 9800F;
        boolean IsMotoCompravel = ValorTotalContaCorrente > ValorMoto || ValorTotalContaPoupanca > ValorMoto;
        System.out.println(IsMotoCompravel);

        // atribuição

        //        if (idade > 10) {
//            System.out.println("alguma coisa");
//        }
        // operador ternário
        double salrio = 6000;
        String resultados = salrio > 5000 ? "euvou doar 5000" : "ainda nao tenho 500";
        System.out.println(resultados);
    }
}
