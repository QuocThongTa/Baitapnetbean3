/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        double average = (double) sum / n;
        
        System.out.println("Tổng của các phần tử: " + sum);
        System.out.println("Trung bình của các phần tử: " + average);
        
        scanner.close();
        // TODO code application logic here
    }
    
}
