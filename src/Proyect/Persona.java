package Proyect;

	public class Persona {
	//Modificacdor de acceso + tipo de dato + nombre 
	private int id;
	private String nombre;
	private String apellido;
	private int edad; 
	private String direccion; 
	private String sexo; //TODO volver enum 
	private String estado;  //TODO volver enu 
	;
	public void Persona(int id, String nombre, String apellido, int edad, String direccion, String sexo, String estado) {
	
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.sexo = sexo;
		this.estado = estado;
		
	}
	 public void mostrar() {
			    System.out.println("ID: " + id);
			    System.out.println("Nombre: " + nombre);
			    System.out.println("Apellido: " + apellido);
			    System.out.println("Edad: " + edad);
			    System.out.println("Dirección: " + direccion);
			    System.out.println("Sexo: " + sexo);
			    System.out.println("Estado: " + estado);
			}
	    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
		
	}

	public int getEdad() {
		return edad;
			
	}

	public void setEdad(int edad) {
		this.edad = edad;
		  if (edad < 0) {
		        System.out.println("Edad inválida");
		        this.edad = 0;
		    } else {
		        this.edad = edad;
		}
		
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
    
	}


