package org.example;

public class TemperatureConverter {
    public void getTemperature(){
        double fahrenheit,celsius =21;

        fahrenheit = (celsius * 9 / 5) + 32;
        celsius = (fahrenheit - 32) * 5/9;

        System.out.println("The temperature in celsius is: " + celsius);
        System.out.println("The temperture in fahrenheit is: " + fahrenheit);

    }
}
