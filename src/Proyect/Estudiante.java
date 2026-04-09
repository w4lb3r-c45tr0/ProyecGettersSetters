package Proyect;

public class Estudiante {
	    private String carnet, nombre;
	    private double promedio;

	    public Estudiante(String carnet, String nombre, double promedio) {
	        this.carnet = carnet;
	        this.nombre = nombre;
	        setPromedio(promedio);
	    }

	    public void setPromedio(double promedio) {
	        if (promedio >= 0 && promedio <= 100) {
	            this.promedio = promedio;
	        } else {
	            System.out.println("Promedio inválido");
	        }
	    }

	    public boolean esBecado() {
	        return promedio >= 85;
	    }
	}

