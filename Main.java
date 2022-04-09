package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = "";;
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        System.out.printf("Последний символ строчки %s.", findLastSymbol(word));


    }
    public static char findLastSymbol(String word){
        int lastIndex = word.length() - 1;
        char[] words = word.toCharArray();
        return words[lastIndex];
    }
}
