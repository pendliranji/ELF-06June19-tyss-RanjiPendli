package com.tyss.elf.songs;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class SortAllSongs {

	public static void main(String[] args) {

		ArrayList<Songs> al = new ArrayList<>();
		Songs s = new Songs("aa", LocalDateTime.of(1995, 12, 1, 5, 3));
		Songs s1 = new Songs("bb", LocalDateTime.of(1995, 11, 1, 5, 3));
		Songs s3 = new Songs("ccc", LocalDateTime.of(1995, 10, 1, 5, 3));

		al.add(s1);
		al.add(s);
		al.add(s3);
		Collections.sort(al);
		for (Songs ss : al) {
			log.info("song name: " + ss.getSongName());
		}

	}

}
