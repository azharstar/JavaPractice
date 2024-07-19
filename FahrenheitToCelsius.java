package controlstatements;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Declare and initialize the temperature in Fahrenheit
        double fahrenheit = 55;

        // Convert Fahrenheit to Celsius using the formula: (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
