package com.iam.restapi;

public enum Office {
	CONFERENCE_ROOM("2:00pm", "Meeting"), CAFETERIA("5:00pm", "Tea time"),
	TRAINING_ROOM("10:00am - 11:00", "Java_session");

	String time;
	String purpose;

	private Office(String time, String purpose) {
		this.time = time;
		this.purpose = purpose;
	}

	private Office() {
	}

}
