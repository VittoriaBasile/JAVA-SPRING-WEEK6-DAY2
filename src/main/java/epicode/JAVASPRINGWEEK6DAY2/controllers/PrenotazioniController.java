package epicode.JAVASPRINGWEEK6DAY2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioniController {
	@GetMapping("/info")
	public String info() {
		return "Inserisci una lingua scegliendo tra italiano e inglese";
	}

	@GetMapping("/info/{lingua}")
	public String infoIta(@PathVariable String lingua) {
		if (lingua.equals("ita")) {
			return "Benvenut nel sistema di prenotazioni delle postazioni di lavoro; puoi scegliere in base alla città , all'edificio e al tipo di postazione richiesta.Ricorda che ogni prenotazione effettuata è valida per 24 ore.";
		} else if (lingua.equals("eng")) {
			return "Welcome to the workstation reservation system; you can choose according to the city, the building and the type of seat requested. Remember that every reservation made is valid for 24 hours.";
		} else {
			return "Inserisci una lingua scegliendo tra italiano e inglese";
		}
	}

}
