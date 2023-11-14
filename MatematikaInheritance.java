/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Masukkan Angka Pertama: ");
        int num1 = scanner.nextInt();

        System.out.print("Masukkan Angka Kedua: ");
        int num2 = scanner.nextInt();

        Matematika matematika = new Matematika();
        Matematika2 matematika2 = new Matematika2();

        // Calling methods from Matematika class
        System.out.println("Penjumlahan: " + matematika.tambah(num1, num2));
        System.out.println("Pengurangan: " + matematika.kurang(num1, num2));
        System.out.println("Perkalian: " + matematika.kali(num1, num2));

        // Check for division by zero
        if (num2 != 0) {
            System.out.println("Pembagian: " + matematika.bagi((double) num1, (double) num2));
        } else {
            System.out.println("Error: Division by zero");
        }

        // Calling methods from Matematika2 class
        System.out.println("Modulus: " + matematika2.modulus(num1, num2));

        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
}
