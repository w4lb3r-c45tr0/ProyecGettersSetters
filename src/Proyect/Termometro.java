package Proyect;

public class Termometro {
	
	    private double celsius;

	    public void setCelsius(double celsius) {
	        if (celsius >= -273.15) {
	            this.celsius = celsius;
	        } else {
	            System.out.println("Temperatura inválida");
	        }
	    }

	    public double getFahrenheit() {
	        return (celsius * 9 / 5) + 32;
	    }
	}

