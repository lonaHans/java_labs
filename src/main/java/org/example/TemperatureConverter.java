package org.example;

public class TemperatureConverter {
//Create TemperatureConverter. Convert Celsius to Fahrenheit using:
//fahrenheit = (celsius * 9 / 5) + 32
//Display both values. Challenge: Convert Fahrenheit back to Celsius.
    public void getTemperature(){
        double fahrenheit,celsius =21;

        fahrenheit = (celsius * 9 / 5) + 32;
        celsius = (fahrenheit - 32) * 5/9;

        System.out.println("The temperature in celsius is: " + celsius);
        System.out.println("The temperture in fahrenheit is: " + fahrenheit);

    }
}
