package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String newPoem1 = poemBeautifier.beautify("text ",a -> a + "abc");
        String newPoem2 = poemBeautifier.beautify("text ",a -> a.length() + " xyz " + a.toUpperCase());
        String newPoem3 = poemBeautifier.beautify("TEXT ", a -> (a.subSequence(0,2)) + " EFG");
        String newPoem4 = poemBeautifier.beautify("text", a -> "ABC " + a + " ABC");
        System.out.println(newPoem1.toUpperCase());
        System.out.println(newPoem2);
        System.out.println(newPoem3);
        System.out.println(newPoem4);

    }
}
