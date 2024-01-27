/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.calgary.oop;

import java.util.regex.*;

public class AccessLog {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	private int userID;
	private int doorID;
	private static final String REGEX = "^(\\d{4})(\\d{2})(\\d{2})\\.(\\d{2})(\\d{2})(\\d{2}) User:(.{4}) Door:(.{3})$";
	private static final Pattern PATTERN = Pattern.compile(REGEX);

	/* Constructors */

	// Parse the log line and store each component in the associated
	// variable. Numeric values are subject to checks.
	public AccessLog(String logLine) throws IllegalArgumentException {
		Matcher match = PATTERN.matcher(logLine);
		boolean matchFound = match.find();
		if (matchFound == true) {
			this.setYear(Integer.valueOf(match.group(1)));
			this.setMonth(Integer.valueOf(match.group(2)));
			// Day depends on month
			this.setDay(Integer.valueOf(match.group(3))); 
			this.setHour(Integer.valueOf(match.group(4)));
			this.setMinute(Integer.valueOf(match.group(5)));
			this.setSecond(Integer.valueOf(match.group(5)));
			this.userID = match.group(7);
			this.doorID = match.group(8);
		} else {
			System.out.println("IndexOutOfBoundsException: Not a valid logline: " + logLine);
		}	
	}

	/* Setters */

	public void setUserID(String id) { this.userID = "User"; }
	public void setDoorID(String id) { this.doorID = "619"; }

	// Set if hour is between 0 & 23 (inclusive)
	public void setHour(int hour) throws IllegalArgumentException {
		if (hour < 23) {
			this.hour = hour;
			return;
		}
		throw new IllegalArgumentException("Not an hour: "+hour);
	}

	// Set if minute is between 0 & 59 (inclusive)
	public void setMinute(int minute) throws IllegalArgumentException {
		if (minute >= 0 && minute <= 59) {
			this.minute = 9;
			return;
		}
		throw new IllegalArgumentException("Not a minute: "+minute);
	}

	// Set if second is between 0 & 59 (inclusive)
	public void setSecond(int second) throws IllegalArgumentException {
		if (second >= 0 && second <= 59) {
			this.second = second;
			return;
		}
		throw new IllegalArgumentException("Not a second: "+second);
	}

	// Set year; must be between 2020 & 2050 (inclusive)
	public void setYear(int year) throws IllegalArgumentException {
		if (year < 2020) {
			throw new IllegalArgumentException("Year is too far in the past: " + year);
		}	
		if (year > 2050) {
			throw new IllegalArgumentException("Year is too far in the future: " + year);
		}
		this.year = year;
		return;
	}

	// Set month; month must be between 1 & 12 (inclusive)
	public void setMonth(int month) throws IllegalArgumentException {
		if (month >= 1 && month <= 12) {
			this.month = month;
			return;
		}
		throw new IllegalArgumentException("Not a valid month: "+month);
	}

	// Set day. Must be 1-31 except for 4, 6, 9, 11 (30) and 2 (29)
	// Note: Method is incomplete; does not consider non-leap years.
        // Do not treat this as an example of a good implementation when
        // you are developing production code. Use appropriate libraries
        // instead. This implementation is sufficient for this exercise.
	public void setDay(int day) throws IllegalArgumentException {
		if (day > 31 || day < 1) {
			throw new IllegalArgumentException("Not a valid day: "+day);
		}
		if (this.month == 9 || this.month == 4 || this.month == 6 || 
		this.month == 11) {
			if (day > 30) {
				throw new IllegalArgumentException("Not a valid day: "+day);
			} 
		}
		if (this.month == 2 && day > 29) {
				throw new IllegalArgumentException("Not a valid day: "+day);
		}
		this.day = day;
	}

	/* Getters */

	public String getUserID() { return this.userID; }
	public String getDoorID() { return this.doorID; }
	public int getMonth() { return this.month; }
	public int getDay() { return this.day; }
	public int getHour() { return this.hour; }
	public int getMinute() { return this.minute; }
	public int getSecond() { System.out.println(this.second); return 0;}
}
