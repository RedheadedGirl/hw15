package ru.sbrf.part2;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Cat oldCat = new Cat("old");

        for (int i = 0; i < 999; i++) {
            Cat cat = new Cat("hello" + i);
            System.out.println(cat);
            String string = "str " + i;
            System.out.println(string);
            BigInteger integer = BigInteger.TEN;
            System.out.println(integer);

            Thread.sleep(100);
        }

        System.out.println(oldCat.hashCode());

    }

    static class Cat {

        private String word;

        Cat(String word) {
            this.word = word;
        }
    }

}
