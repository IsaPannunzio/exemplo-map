package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ExemploMap {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
            1 - Converter os valores inteiros para uma string binária
            2 - Inverter a string
            3 - Converter de volta para inteiro
         */

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2);

        numeros.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}
