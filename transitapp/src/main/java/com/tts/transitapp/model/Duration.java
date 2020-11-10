package com.tts.transitapp.model;

public class Duration {

	public String text;
	public int value;

	public Duration() {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Duration [text=" + text + ", value=" + value + "]";
	}

	
	
	

}
