/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class bai3 {
    public class PalindromeCheck {

        public static boolean isPalindrome(String str) {
            StringBuilder reversed = new StringBuilder(str).reverse();
            return str.equals(reversed.toString());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chuoi de kiem tra palindrome: ");
            String str = scanner.nextLine();
            System.out.println("Is palindrome? " + isPalindrome(str));
            scanner.close();
        }
    }
}
