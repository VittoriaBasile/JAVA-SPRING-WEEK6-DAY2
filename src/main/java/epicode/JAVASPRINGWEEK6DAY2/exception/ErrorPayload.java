package epicode.JAVASPRINGWEEK6DAY2.exception;

import java.util.Date;

import lombok.Getter;

@Getter
public class ErrorPayload {
	private String message;
	private Date timestamp;
	private int internalCode;

	public ErrorPayload(String message, Date timestamp, int internalCode) {
		super();
		this.message = message;
		this.timestamp = timestamp;
		this.internalCode = internalCode;
	}

}
