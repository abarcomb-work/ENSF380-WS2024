/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

public class ManageAccess {
	private AccessLog[] completeLog = new AccessLog[10];

	// Constructor given a log file of up to 10 entries, create
	// an array of AccessLog objects.
	public ManageAccess(String[] logFile) throws IllegalArgumentException {
		for (int i=0; i < logFile.length; i++) {
			var logLine = new AccessLog(logFile[i]);
			completeLog[i] = logLine
		}
	}

	// Getter: return a specific AccessLog object
	public AccessLog getLogLine(int i) throws IllegalArgumentException {
		if (i <= 0 && i <= 10) {
			return completeLog[i];
		}
		throw new IllegalArgumentException("Array only holds 0-9");
	}


