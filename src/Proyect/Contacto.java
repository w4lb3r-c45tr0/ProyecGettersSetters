package Proyect;

public class Contacto {
	
    private String nombre, telefono, email;

	    public Contacto(String nombre, String telefono, String email) {
	        this.nombre = nombre;
	        this.telefono = telefono;
	        this.email = email;
	        setTelefono(telefono);
	        setEmail(email);
	    }


		public void setTelefono(String telefono) {
	        if (telefono.length() == 8) {
	            this.telefono = telefono;
	        } else {
	            System.out.println("Teléfono inválido");
	        }
	    }

	    public void setEmail(String email) {
	        if (email.contains("@")) {
	            this.email = email;
	        } else {
	            System.out.println("Email inválido");
	        }
	    }

	    public void mostrarContacto() {
	        System.out.println(nombre + " - " + telefono + " - " + email);
	    }
	}

