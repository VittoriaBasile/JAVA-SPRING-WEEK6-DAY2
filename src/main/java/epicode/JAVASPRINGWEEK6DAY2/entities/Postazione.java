package epicode.JAVASPRINGWEEK6DAY2.entities;

import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Postazione {
	private Random r = new Random();
	private int id = r.nextInt(0, 100);
	private String descrizione;
	private TipoPostazione tipoPostazione;
	private int numeroMassimo;
	private Edificio edificio;
	private boolean disponibile;

	public Postazione(String descrizione, TipoPostazione tipoPostazione, int numeroMassimo, Edificio edificio,
			boolean disponibile) {
		super();
		this.descrizione = descrizione;
		this.tipoPostazione = tipoPostazione;
		this.numeroMassimo = numeroMassimo;
		this.edificio = edificio;
		this.disponibile = disponibile;
	}

	@Override
	public String toString() {
		return "id=" + id + ", descrizione=" + descrizione + ", tipoPostazione=" + tipoPostazione + ", numeroMassimo="
				+ numeroMassimo + ", edificio=" + edificio + ", disponibile=" + disponibile;
	}

}
