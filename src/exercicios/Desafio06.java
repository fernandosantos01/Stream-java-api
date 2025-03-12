package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultado = numeros.stream().allMatch(n -> n > 10);

        if (resultado){
            System.out.println("Há numeros maiores que 10!");
        }else {
            System.out.println("Não há numeros maiores que 10!");
        }
    }
}
