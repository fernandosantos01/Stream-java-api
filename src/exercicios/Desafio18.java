package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosNumerosIguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        if (todosNumerosIguais){
            System.out.println("Todos os numeros são iguais!!");
        }else {
            System.out.println("Todos os numeros não iguais!!");
        }
    }
}
