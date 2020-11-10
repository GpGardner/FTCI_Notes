package com.tts.transitapp.model;

public class Bus {
	

	public String ADHERENCE;
	public String BLOCKID;
	public String BLOCK_ABBR;
	public String DIRECTION;
	public String LATITUDE;
	public String LONGITUDE;
	public String MSGTIME;
	public String ROUTE;
	public String STOPID;
	public String TIMEPOINT;
	public String TRIPID;
	public String VEHICLE;
	public double distance;

	public Bus() {
	}

	public String getADHERENCE() {
		return ADHERENCE;
	}

	public void setADHERENCE(String aDHERENCE) {
		ADHERENCE = aDHERENCE;
	}

	public String getBLOCKID() {
		return BLOCKID;
	}

	public void setBLOCKID(String bLOCKID) {
		BLOCKID = bLOCKID;
	}

	public String getBLOCK_ABBR() {
		return BLOCK_ABBR;
	}

	public void setBLOCK_ABBR(String bLOCK_ABBR) {
		BLOCK_ABBR = bLOCK_ABBR;
	}

	public String getDIRECTION() {
		return DIRECTION;
	}

	public void setDIRECTION(String dIRECTION) {
		DIRECTION = dIRECTION;
	}

	public String getLATITUDE() {
		return LATITUDE;
	}

	public void setLATITUDE(String lATITUDE) {
		LATITUDE = lATITUDE;
	}

	public String getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(String lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}

	public String getMSGTIME() {
		return MSGTIME;
	}

	public void setMSGTIME(String mSGTIME) {
		MSGTIME = mSGTIME;
	}

	public String getROUTE() {
		return ROUTE;
	}

	public void setROUTE(String rOUTE) {
		ROUTE = rOUTE;
	}

	public String getSTOPID() {
		return STOPID;
	}

	public void setSTOPID(String sTOPID) {
		STOPID = sTOPID;
	}

	public String getTIMEPOINT() {
		return TIMEPOINT;
	}

	public void setTIMEPOINT(String tIMEPOINT) {
		TIMEPOINT = tIMEPOINT;
	}

	public String getTRIPID() {
		return TRIPID;
	}

	public void setTRIPID(String tRIPID) {
		TRIPID = tRIPID;
	}

	public String getVEHICLE() {
		return VEHICLE;
	}

	public void setVEHICLE(String vEHICLE) {
		VEHICLE = vEHICLE;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Bus [ADHERENCE=" + ADHERENCE + ", BLOCKID=" + BLOCKID + ", BLOCK_ABBR=" + BLOCK_ABBR + ", DIRECTION="
				+ DIRECTION + ", LATITUDE=" + LATITUDE + ", LONGITUDE=" + LONGITUDE + ", MSGTIME=" + MSGTIME + ", ROUTE="
				+ ROUTE + ", STOPID=" + STOPID + ", TIMEPOINT=" + TIMEPOINT + ", TRIPID=" + TRIPID + ", VEHICLE=" + VEHICLE
				+ ", distance=" + distance + "]";
	}

	
	
}
