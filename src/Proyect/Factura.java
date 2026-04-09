package Proyect;

public class Factura {
	
    private String codigo, descripcion;
    private int cantidad;
    private double precio;

    public Factura(String codigo, String descripcion, int cantidad, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double calcularTotal() {
        return cantidad * precio;
    }

    public void mostrarFactura() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Total: " + calcularTotal());
    }
}