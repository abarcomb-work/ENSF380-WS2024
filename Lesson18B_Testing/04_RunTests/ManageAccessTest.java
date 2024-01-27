
/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ManageAccessTest {

    public String[] logFile = {
            "20220102.063815 User:A782 Door:631",
            "20220102.104502 User:B661 Door:802",
            "20220102.105019 User:B661 Door:802",
            "20220102.110234 User:CY61 Door:230",
            "20220102.110236 User:A782 Door:030",
            "20220102.123014 User:A782 Door:030",
            "20220102.123507 User:CY61 Door:230",
            "20220102.131048 User:B955 Door:631",
            "20220102.151718 User:B661 Door:631",
            "20220102.170513 User:A782 Door:631"
    };

    public String logLine = "20220102.063815 User:A782 Door:631";
        
    public ManageAccessTest() { }

    // Test the constructor for ManageAccess
    @Test
    public void testManageAccessConstructorGoodData() {
        ManageAccess logs = new ManageAccess(logFile);
        assertNotNull("ManageAccess constructor did not create an object when given a valid array of log entries.", logs);
    }

    // Test the constructor for AccessLog
    @Test
    public void testAccessLogConstructorGoodData() {
        AccessLog accessLine = new AccessLog(logLine);
        assertNotNull("AccessLog constructor did not create an object when given a valid log string.", accessLine);
    }

    // Test the constructor exception for AccessLog
    @Test
    public void testAccessLogConstructorInvalidData() {
        
        boolean correctException = false;
        
        try{
            AccessLog accessLine = new AccessLog("20220102.170513A782631");
        }
        catch(IllegalArgumentException e){
            correctException = true;
        }

        assertEquals("AccessLog constructor did not throw an IllegalArgumentException when given an invalid log string: ", true, correctException);        
    }

    // Test the getter for AccessLog within ManageAccess- no way to test individual values without using the getters in AccessLog
    @Test
    public void testGetLogLine(){
        ManageAccess logs = new ManageAccess(logFile);
        AccessLog foundLine = logs.getLogLine(0);
        assertNotNull("Method testGetLogLine did not return an AccessLog object: ", foundLine);
    }
    
    // Test the getter/setter for userID within AccessLog
    @Test
    public void testGetUserID() {
        AccessLog accessLine = new AccessLog(logLine);
        String foundUserID = accessLine.getUserID();
        String expectedUserID = "A782";
        assertEquals("Method getUserID did not return the expected result: ", expectedUserID, foundUserID);
    }  

    @Test
    public void testSetUserID() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setUserID("Z000");
        String foundUserID = accessLine.getUserID();
        String expectedUserID = "Z000";
        assertEquals("Method setUserID did not return the expected result: ", expectedUserID, foundUserID);
    }  

    
    // Test the getter/setter for doorID within AccessLog    
    @Test
    public void testGetDoorID() {
        AccessLog accessLine = new AccessLog(logLine);
        String foundDoorID = accessLine.getDoorID();
        String expectedDoorID = "631";
        assertEquals("Method getDoorID did not return the expected result: ", expectedDoorID, foundDoorID);
    }  
 
    @Test
    public void testSetDoorID() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setDoorID("999");
        String foundDoorID = accessLine.getDoorID();
        String expectedDoorID = "999";
        assertEquals("Method setDoorID did not return the expected result: ", expectedDoorID, foundDoorID);
    }  
    
    
    // Test the getter/setter for year within AccessLog
    @Test
    public void testGetYear() {
        AccessLog accessLine = new AccessLog(logLine);
        int foundYear = accessLine.getYear();
        int expectedYear = 2022;
        assertEquals("Method getYear did not return the expected result: ", expectedYear, foundYear);
    }  

    @Test
    public void testSetYear() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setYear(2020);
        int foundYear = accessLine.getYear();
        int expectedYear = 2020;
        assertEquals("Method setYear did not return the expected result: ", expectedYear, foundYear);
    }  
    

    // Test the getter/setter for month within AccessLog
    @Test
    public void testGetMonth() {
        AccessLog accessLine = new AccessLog(logLine);
        int foundMonth = accessLine.getMonth();
        int expectedMonth = 01;
        assertEquals("Method getMonth did not return the expected result: ", expectedMonth, foundMonth);
    }  

    @Test
    public void testSetMonth() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setMonth(11);
        int foundMonth = accessLine.getMonth();
        int expectedMonth = 11;
        assertEquals("Method setMonth did not return the expected result: ", expectedMonth, foundMonth);
    }  

    
    // Test the getter/setter for day within AccessLog    
    @Test
    public void testGetDay() {
        AccessLog accessLine = new AccessLog(logLine);
        int foundDay = accessLine.getDay();
        int expectedDay = 02;
        assertEquals("Method getDay did not return the expected result: ", expectedDay, foundDay);
    }  
    
    @Test
    public void testSetDay() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setDay(24);
        int foundDay = accessLine.getDay();
        int expectedDay = 24;
        assertEquals("Method setDay did not return the expected result: ", expectedDay, foundDay);
    }  

    
    // Test the getter/setter for hour within AccessLog   
    @Test
    public void testGetHour() {
        AccessLog accessLine = new AccessLog(logLine);
        int foundHour = accessLine.getHour();
        int expectedHour = 06;
        assertEquals("Method getHour did not return the expected result: ", expectedHour, foundHour);
    }  

    @Test
    public void testSetHour() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setHour(23);
        int foundHour = accessLine.getHour();
        int expectedHour = 23;
        assertEquals("Method setHour did not return the expected result: ", expectedHour, foundHour);
    }  

    @Test
    public void testHourException() {
        boolean correctException = false;
        try{
            AccessLog accessLine = new AccessLog(logLine);
            accessLine.setHour(-1); 
        }
        catch(IllegalArgumentException e){
            correctException = true;
        }
        assertEquals("setHour did not throw an IllegalArgumentException when given invalid input: ", true, correctException);
    }
    

    
    // Test the getter/setter for minute within AccessLog    
    @Test
    public void testGetMinute() {
        AccessLog accessLine = new AccessLog(logLine);
        int foundMinute = accessLine.getMinute();
        int expectedMinute = 38;
        assertEquals("Method getMinute did not return the expected result: ", expectedMinute, foundMinute);
    }  
    
    @Test
    public void testSetMinute() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setMinute(16);
        int foundMinute = accessLine.getMinute();
        int expectedMinute = 16;
        assertEquals("Method setMinute did not return the expected result: ", expectedMinute, foundMinute);
    }  
    

    // Test the getter/setter for second within AccessLog        
    @Test
    public void testGetSecond() {
        AccessLog accessLine = new AccessLog(logLine);
        int foundSecond = accessLine.getSecond();
        int expectedSecond = 15;
        assertEquals("Method getSecond did not return the expected result: ", expectedSecond, foundSecond);
    } 
    
    @Test
    public void testSetSecond() {
        AccessLog accessLine = new AccessLog(logLine);
        accessLine.setSecond(42);
        int foundSecond = accessLine.getSecond();
        int expectedSecond = 42;
        assertEquals("Method setSecond did not return the expected result: ", expectedSecond, foundSecond);
    }  
    
}
