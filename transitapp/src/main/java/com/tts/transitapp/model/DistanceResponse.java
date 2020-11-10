package com.tts.transitapp.model;

import java.util.List;

public class DistanceResponse {

	public List<Row> rows;

	public DistanceResponse() {
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "DistanceResponse [rows=" + rows + "]";
	}

	

}
