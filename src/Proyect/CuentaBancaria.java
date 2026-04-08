package Proyect;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	private int pin;
	
	
	public CuentaBancaria(String titular, double saldo, int pin) {

		this.titular = titular;
		this.saldo = saldo;
		this.pin = pin;
	}
	
	
	public void retirar(double monto, int pinIngresado) {
		if (pinIngresado == pin) {
		    if (monto <= saldo) {
		        saldo = saldo - monto;
		        System.out.println("\n---Retiro exitoso---");
		        mostrarSaldo();
		    } else {
		        System.out.println("\n---Retiro fallido---");
		        System.out.println("No hay saldo suficiente");
		    }
		} else {
		    System.out.println("\nEl pin es incorrecto");
		}
	
	}
	public void mostrarSaldo() {
		System.out.println("El saldo restante de tu cuenta es: " + saldo );
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
        this.titular = titular;
        		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}


	
}
