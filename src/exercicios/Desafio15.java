package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroNegativo = numeros.stream().allMatch(n -> n < 0);
        if (numeroNegativo){
            System.out.println("Há Numeros negativos na lista!");
        }else {
            System.out.println("Todos os numeros da Lista São positivos!");
        }
    }
}
