package Proyect;

public class main {

	public static void main(String[] args) {
		// Persona
		System.out.println("\n=== PERSONA ===");

        Persona p = new Persona();
        p.setId(1);
        p.setNombre("Juan");
        p.setApellido("Perez");
        p.setEdad(20);
        p.setDireccion("Santa Catarina Mita");
        p.setSexo("Masculino");
        p.setEstado("Activo");

        p.mostrar();
		
        //Producto
		  System.out.println("\n=== PRODUCTO ===");

        Producto P = new Producto("001", "Laptop", 5000.00, 30);

        P.vender(3);
        P.vender(20);
        P.vender(4);
	
       P.DespuesVenta();

		//Cuenta Bancaria
       System.out.println("\n=== CUENTA BANCARIA ===");
       
       CuentaBancaria B = new CuentaBancaria("Walber Castro", 5000.00, 3465);
       
      
       B.retirar(2500, 3465);
       B.retirar(400, 365);
       B.retirar(2600, 3465);
       B.retirar(2000, 3465);
        
     
	}
	   
	   

}
