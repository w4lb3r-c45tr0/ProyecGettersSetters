package Proyect;

public class main {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setId(1);
		p.setNombre("Juan");
		p.setApellido("Perez");
		p.setEdad(-1);
		p.setDireccion("Santa catarina mita");
		p.setSexo("Masculino");
		p.setEstado("Activo");
		
		p.mostrar();

	}

}
