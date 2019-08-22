package com.tyss.elf.songs;

import java.time.LocalDateTime;
import java.util.Date;

public class Songs implements Comparable<Songs> {

	private String songName;
	private LocalDateTime date;

	public String getSongName() {
		return songName;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Songs(String songName, LocalDateTime date) {
		super();
		this.songName = songName;
		this.date = date;
	}

	@Override
	public int compareTo(Songs arg0) {

		return this.date.compareTo(arg0.getDate());
	}

}
