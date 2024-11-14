/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class bai4 {

    public class ToggleCase {

        public static String toggleCase(String str) {
            StringBuilder toggled = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    toggled.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    toggled.append(Character.toUpperCase(c));
                } else {
                    toggled.append(c);
                }
            }
            return toggled.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chuoi de chuyen doi: ");
            String str = scanner.nextLine();
            System.out.println("Da chuyen doi thanh: " + toggleCase(str));
            scanner.close();
        }

    }
}
