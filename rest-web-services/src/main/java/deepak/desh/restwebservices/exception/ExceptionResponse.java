package deepak.desh.restwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timestampDate;
	private String msg;
	private String details;

	public ExceptionResponse(Date timestampDate, String msg, String details) {
		super();
		this.timestampDate = timestampDate;
		this.msg = msg;
		this.details = details;
	}

	public Date getTimestampDate() {
		return timestampDate;
	}

	public String getMsg() {
		return msg;
	}

	public String getDetails() {
		return details;
	}

}
