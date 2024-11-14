/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class bai8 {
    public class LongestWord {
    public static String findLongestWord(String str) {
        String[] words = str.trim().split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to find the longest word: ");
        String str = scanner.nextLine();
        System.out.println("Longest word: " + findLongestWord(str));
        scanner.close();
    }
}
}
