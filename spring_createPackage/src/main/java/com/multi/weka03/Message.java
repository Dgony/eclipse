package com.multi.weka03;

public class Message {

	private String from;
	private String text;

	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public Message(String from, String text) {
		super();
		this.from = from;
		this.text = text;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [from=" + from + ", text=" + text + "]";
	}

	// getters and setters

}
