package co.edu.unbosque.CodeCraftersForrestM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Station {

@Id
	private String stationName;
	private String transmissionMode;
	private String music;

	public Station() {

	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getTransmissionMode() {
		return transmissionMode;
	}

	public void setTransmissionMode(String transmissionMode) {
		this.transmissionMode = transmissionMode;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

}
