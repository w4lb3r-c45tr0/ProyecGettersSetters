package Proyect;

public class Producto {
	//atributos privados
	  private String codigo, nombre;
	  private double precio;
	  private int stock;
	 
	  
public Producto(String codigo, String nombre, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		
	
	}

public void DespuesVenta() {
	System.out.println("=== Después de las ventas, en stock quedo: " + stock + " === ");
}

//getters and setters
		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			if (precio > 0) {
				this.precio = precio;
			} else {
				System.out.println("El precio es invalido ");
				
			}
				
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
		    if (stock < 0) {
		        System.out.println("Stock inválido");
		    } else {
		        this.stock = stock;
		        
		        if (stock == 0) {
		            System.out.println("No hay existencias");
		        }
		    }
		}
	    
	public void vender (int cantidad) {
			if (cantidad <= stock) {
				stock = stock - cantidad;
				System.out.println("Venta realizada");
			} else {	
				System.out.println("!!No hay suficientes existencias para realizar esta venta!!");
			}
	}
	
}



