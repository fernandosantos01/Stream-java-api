package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaNumerosMaiorQue5 = numeros.stream().filter(num -> num > 5).reduce(0, Integer::sum);
        long quantidade = numeros.stream().filter(num -> num>5).count();

        double media = (double) somaNumerosMaiorQue5/quantidade;

        System.out.printf("Resultado da media: %.2f", media);
    }
}
