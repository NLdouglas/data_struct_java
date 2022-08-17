package testes; /* importa a pasta dentro do arquivo iniciado */

import java.util.Scanner; /* converte os valores de acordo com a tipagem da variavel  */

public class Main { /* "Main" se refere ao arquivo dentro da pasta */
    public static void main(String[] args) { // função "metodo"
        final double CAMBIO_ATUAL = 5.4; // double == float
            Scanner s = new Scanner(System.in); // s = obj onde está o input 
        System.out.println("Qual e o valor em dolar? ");
                double valorEmDolar = s.nextDouble();
            double valorEmReal = valorEmDolar*CAMBIO_ATUAL;
    System.out.println("valor em real: R$" + valorEmReal);
        
    }
}