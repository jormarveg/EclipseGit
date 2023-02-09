package prueba;

import coches.Coche;
import mascotas.Mascota;
import personas.Persona;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Juan", 42, new Mascota("Pepo", Mascota.Especie.LORO),
				new Coche(Coche.Marca.BMW, Coche.Color.GRIS));
		System.out.println("haciendo un cambio en la main");
		p1.saludar();
	}

}
