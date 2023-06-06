package epicode.JAVASPRINGWEEK6DAY2.exception;

public class NotFoundException extends RuntimeException {
	public NotFoundException(int id) {
		super("Item with id " + id + " not found!");
	}

}
