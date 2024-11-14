package com.xavier.pelle.dto;

public class AlbumDto {
	
	private Long id;
	private String title;
	private String artist;
	private String genre;
	private String releaseDate;
	private String status;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist(){
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre(){
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getReleaseDate(){
		return releaseDate;
	}
	public void setReleaseDate(String string) {
		this.releaseDate = string;
	}
	public String getStatus(){
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
