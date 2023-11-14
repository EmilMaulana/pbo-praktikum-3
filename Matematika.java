/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_3;

/**
 *
 * @author ASUS
 */
public class Matematika {
    int tambah(int a, int b) {
        return a + b;
    }
    
    int kurang(int a, int b) {
        return a - b;
    }
    
    int kali(int a, int b) {
        return a * b;
    }
    
    double bagi(double a, double b) {
        if (b != 0){
            return a / b;
        }else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not a Number
        }
    }
    
}
