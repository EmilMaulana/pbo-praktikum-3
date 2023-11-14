/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_3;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu2 {
    double fahrenheitToReamur(double fahrenheit) {
        // Convert Fahrenheit to Celsius first, then to Reamur
        double celcius = (fahrenheit - 32) * 5 / 9;
        return celcius * 4 / 5;
    }
}
