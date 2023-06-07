package epicode.JAVASPRINGWEEK6DAY2.entities;

import java.util.List;
import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Utente {
	private Random r = new Random();
	private int id = r.nextInt(0, 100);
	private String username;
	private String name;
	private String email;
	private List<Prenotazione> prenotazioni;

	public Utente(String username, String name, String email) {
		super();
		this.username = username;
		this.name = name;
		this.email = email;

	}

	@Override
	public String toString() {
		return "username=" + username + ", name=" + name + ", email=" + email;
	}

}
