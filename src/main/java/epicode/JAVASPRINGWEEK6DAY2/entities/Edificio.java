package epicode.JAVASPRINGWEEK6DAY2.entities;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edificio {
	private Random r = new Random();
	private int id = r.nextInt(0, 100);
	private String name;
	private String indirizzo;
	private String città;

	public Edificio(String name, String indirizzo, String città) {
		super();
		this.name = name;
		this.indirizzo = indirizzo;
		this.città = città;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", indirizzo=" + indirizzo + ", città=" + città + "]";
	}

}
