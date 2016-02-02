package laskin.laskin;

public class Lampotilamuunnin {

    public Lampotilamuunnin() {

    }

    public double celsiuksestaFahrenheitiin(double celsius) {
        return celsius * 1.8 + 32;
    }

    public double celsiuksestaKelviniin(double celsius) {
        return celsius + 273.15;
    }

    public double fahrenheitistaCelsiukseen(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public double fahrenheitistaKelviniin(double fahrenheit) {
        return (fahrenheit + 459.67) / 1.8;
    }

    public double kelvinistaCelsiukseen(double kelvin) {
        return kelvin - 273.15;
    }

    public double kelvinistaFahrenheitiin(double kelvin) {
        return kelvin * 1.8 - 459.67;
    }

}
