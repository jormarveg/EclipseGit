package mascotas;

public class Mascota {
	public enum Especie {
		PERRO("perro"), GATO("gato"), LORO("loro");

		private final String especie;

		Especie(String especie) {
			this.especie = especie;
		}

		public String getEspecie() {
			return especie;
		}
	}

	private final static String NOMBRE_DEFAULT = "Mascota";
	private final static Especie ESPECIE_DEFAULT = Especie.PERRO;

	private String nombre;
	private Especie especie;

	public Mascota(String nombre, Especie especie) {
		this.nombre = nombre;
		this.especie = especie;
	}

	public Mascota() {
		this(NOMBRE_DEFAULT, ESPECIE_DEFAULT);
	}

	public String getEspecie() {
		return especie.getEspecie();
	}

}
