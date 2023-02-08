package coches;

public class Coche {
	public enum Marca {
		BMW("BMW"), MERCEDES("Mercedes"), RENAULT("Renault"), TOYOTA("Toyota"), OTRO("Otro");

		private String marca;

		Marca(String marca) {
			this.marca = marca;
		}

		public String getMarca() {
			return marca;
		}
	}

	public enum Color {
		ROJO, VERDE, AZUL, BLANCO, NEGRO, GRIS, OTRO
	}

	private final static Marca MARCA_DEFAULT = Marca.OTRO;
	private final static Color COLOR_DEFAULT = Color.OTRO;

	private final Marca marca;
	private final Color color;

	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}

	public Coche() {
		this(MARCA_DEFAULT, COLOR_DEFAULT);
	}

	public String getMarca() {
		return marca.getMarca();
	}
}
