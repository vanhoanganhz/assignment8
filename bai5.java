/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class bai5 {

    public class SplitWords {

        public static String[] splitWords(String str) {
            return str.trim().split("\\s+");
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a sentence to split words: ");
            String str = scanner.nextLine();
            String[] words = splitWords(str);
            System.out.println("Words:");
            for (String word : words) {
                System.out.println(word);
            }
            scanner.close();
        }
    }
}
