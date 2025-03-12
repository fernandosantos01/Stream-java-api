package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer>numerosPrimos = numeros.stream().filter(Desafio17::EhPrimo).toList();

        System.out.println("------LISTA-NUMEROS-PRIMOS-------");
        numerosPrimos.forEach(System.out::println);
    }
    public static boolean EhPrimo(int numero){
        return Desafio14.ehPrimo(numero);
    }
}
