package exercicios;

import org.w3c.dom.ls.LSException;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaNumerosdivisiveisPor3e5 = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0, Integer::sum);

        System.out.println("Soma de todos os numeros divisiveis por 5 e 3: " + somaNumerosdivisiveisPor3e5);
    }


}
