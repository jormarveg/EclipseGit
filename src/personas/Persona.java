package personas;

import coches.Coche;
import mascotas.Mascota;

public class Persona {
	private final static String NOMBRE_DEFAULT = "Nadie";
	private final static int EDAD_DEFAULT = 20;

	private String nombre;
	private int edad;
	private Mascota mascota;
	private Coche coche;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre, int edad, Mascota mascota, Coche coche) {
		this(nombre, edad);
		this.mascota = mascota;
		this.coche = coche;
	}

	public Persona() {
		this(NOMBRE_DEFAULT, EDAD_DEFAULT);
	}

	public void saludar() {
		System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
		if (mascota != null && coche != null) {
			System.out.println("Mi coche es " + coche.getMarca() + " y mi mascota es un " + mascota.getEspecie()+".");
		}
	}
}
