package com.tyss.filecreationutil.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class CreateFileUtil {

	public boolean createFile(String fileName, String data) {
		try {
			FileUtils.writeStringToFile(new File(fileName), data, Charset.defaultCharset());
			log.info("file created and written ");
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
}
