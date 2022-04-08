package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = "";;
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        findLastSymbol(word);

    }
    public static void findLastSymbol(String word){
        int lastIndex = word.length() - 1;
        char[] words = word.toCharArray();
        System.out.printf("Последний символ строчки %s.", words[lastIndex]);
    }
}
