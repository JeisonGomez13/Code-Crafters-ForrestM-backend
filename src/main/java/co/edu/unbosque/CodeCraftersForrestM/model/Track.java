package co.edu.unbosque.CodeCraftersForrestM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Track {
@GeneratedValue (strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String genre;
	private String nameMusic;
	private String nameArtist;
	private String fileMP3;

	public Track() {
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getNameMusic() {
		return nameMusic;
	}

	public void setNameMusic(String nameMusic) {
		this.nameMusic = nameMusic;
	}

	public String getNameArtist() {
		return nameArtist;
	}

	public void setNameArtist(String nameArtist) {
		this.nameArtist = nameArtist;
	}

	public String getFileMP3() {
		return fileMP3;
	}

	public void setFileMP3(String fileMP3) {
		this.fileMP3 = fileMP3;
	}

}
