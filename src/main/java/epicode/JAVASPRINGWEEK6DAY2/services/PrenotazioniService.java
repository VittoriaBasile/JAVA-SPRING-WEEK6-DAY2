package epicode.JAVASPRINGWEEK6DAY2.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import epicode.JAVASPRINGWEEK6DAY2.entities.Edificio;
import epicode.JAVASPRINGWEEK6DAY2.entities.Postazione;
import epicode.JAVASPRINGWEEK6DAY2.entities.Prenotazione;
import epicode.JAVASPRINGWEEK6DAY2.entities.TipoPostazione;
import epicode.JAVASPRINGWEEK6DAY2.entities.Utente;

@Service
public class PrenotazioniService {
	Edificio edificio1 = new Edificio("palazzo1", "via Nicola Michiello 20", "Molfetta");
	Edificio edificio2 = new Edificio("palazzo2", "via Roma 2", "Bari");
	Edificio edificio3 = new Edificio("palazzo3", "via Terlizzi", "Molfetta");

	Utente utente1 = new Utente("vittoria", "Vittoria", "vittoriabasile@gmail.com");
	Utente utente2 = new Utente("giuseppe", "Giuseppe", "giuseppepansini@gmail.com");
	Utente utente3 = new Utente("maria", "Maria", "mariarossi@gmail.com");

	Postazione postazione1 = new Postazione("ariosa", TipoPostazione.OPENSPACE, 20, edificio1, true);
	Postazione postazione2 = new Postazione("comoda", TipoPostazione.PRIVATO, 2, edificio2, true);
	Postazione postazione3 = new Postazione("ben organizzata", TipoPostazione.SALA_RIUNIONI, 30, edificio3, false);

	Prenotazione prenotazione1 = new Prenotazione(utente1, postazione1, LocalDate.of(2023, 6, 3));
	Prenotazione prenotazione2 = new Prenotazione(utente2, postazione2, LocalDate.of(2023, 6, 4));
	Prenotazione prenotazione3 = new Prenotazione(utente3, postazione3, LocalDate.of(2023, 6, 3));

	private List<Prenotazione> prenotazioni = new ArrayList<>(List.of(prenotazione1, prenotazione2, prenotazione3));

	public List<Prenotazione> getPrenotazioni() {
		return this.prenotazioni;
	}

	public Prenotazione create(Utente utente, Postazione postazione, LocalDate day) {
		Prenotazione prenotazione = new Prenotazione();

		boolean isDataPresente = utente.getPrenotazioni().stream().anyMatch(p -> p.getDataPrenotazione().equals(day));
		if (isDataPresente == false) {
			prenotazione.setUtente(utente);
			prenotazione.setDataPrenotazione(day);
		} else {
			System.out.println("questo utente non può prenotare nessuna postazione in questa data");
		}

		if (postazione.isDisponibile() == true) {
			prenotazione.setPostazione(postazione);
		} else {
			System.out.println("questa postazione non è disponibile");
		}

		if (prenotazione.getUtente() != null && prenotazione.getPostazione() != null
				&& prenotazione.getDataPrenotazione() != null) {
			this.prenotazioni.add(prenotazione);

		}
		return prenotazione;

	}
}
