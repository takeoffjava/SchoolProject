package com.school.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilSection {

	private static UtilSection utilSectionInstance = null;

	public static UtilSection getInstance() {
		if (utilSectionInstance == null)
			utilSectionInstance = new UtilSection();
		return utilSectionInstance;
	}

	public String getDateandTime() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		return df.format(dateobj);
	}
}
