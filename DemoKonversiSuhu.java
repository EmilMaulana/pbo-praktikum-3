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
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the temperature in Celcius: ");
        double celciusValue = scanner.nextDouble();

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheitValue = scanner.nextDouble();

        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        // Calling methods from KonversiSuhu class
        System.out.println("Celcius to Fahrenheit: " + konversiSuhu.celciusToFahrenheit(celciusValue));
        System.out.println("Celcius to Reamur: " + konversiSuhu.celciusToReamur(celciusValue));

        // Calling methods from KonversiSuhu2 class
        System.out.println("Fahrenheit to Reamur: " + konversiSuhu2.fahrenheitToReamur(fahrenheitValue));

        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
}
