/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class bai6 {

    public class WordCount {

        public static int countWords(String str) {
            String[] words = str.trim().split("\\s+");
            return words.length;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a sentence to count words: ");
            String str = scanner.nextLine();
            System.out.println("Word count: " + countWords(str));
            scanner.close();
        }
    }
}
