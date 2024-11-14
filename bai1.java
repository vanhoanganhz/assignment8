/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

public class bai1 {
    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = scanner.nextLine();
        System.out.print("Nhap ki tu de dem chuoi: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Ki tu '" + ch + "' xuat hien: " + countCharacter(str, ch));
        scanner.close();
    }
}

