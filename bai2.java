/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;
import java.util.Scanner;
public class bai2 {
     public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ki tu de dao nguoc: ");
        String str = scanner.nextLine();
        System.out.println("Chuoi dao nguoc: " + reverseString(str));
        scanner.close();
    }
}
