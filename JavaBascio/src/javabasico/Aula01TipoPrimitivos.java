package javabasico;

public class Aula01TipoPrimitivos {
    public static void main(String [] args) {
        // int = inteiro, double = 2000 , float = 22.00, char = caracteres , byte = valores pequenos,
        // short = curto, long = n longos , boolean = ture or false
        int idade = 22;
        int idade2 = (int) 1000000000L; // casting = colocar um valor em um tipo n suportado
                                        // na mesma var coloca entre parentes o tipo q deseja forçar no caso, (int) mesmo o numero sendo do tipo LONG
        System.out.println(idade);
     }
}
