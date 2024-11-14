/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class bai7 {

    public class RemoveExtraSpaces {

        public static String removeExtraSpaces(String str) {
            return str.trim().replaceAll("\\s+", " ");
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a sentence to remove extra spaces: ");
            String str = scanner.nextLine();
            System.out.println("String after removing extra spaces: '" + removeExtraSpaces(str) + "'");
            scanner.close();
        }
    }
}
