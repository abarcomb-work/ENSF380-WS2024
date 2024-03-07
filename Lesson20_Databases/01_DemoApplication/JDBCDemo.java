/*
Copyright Ann Barcomb and Emily Marasco, 2021-2024
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

import java.sql.*;

public class JDBCDemo{

    private Connection dbConnect;
    private ResultSet results;
            
    public JDBCDemo(){
    }
    
    public void createConnection(){
                
        try{
            dbConnect = DriverManager.getConnection("jdbc:postgresql://localhost/pets", "oop", "ucalgary");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String selectCats(){

        StringBuffer catAndOwners = new StringBuffer();
        
        try {                    
            Statement myStmt = dbConnect.createStatement();
            results = myStmt.executeQuery("SELECT * FROM cat");
            
            while (results.next()){
                System.out.println("Print results: " + results.getString("name") + ", " + results.getString("owner"));
                
                catAndOwners.append(results.getString("name") + ", " + results.getString("owner"));
                catAndOwners.append('\n');
            }
            
            myStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return catAndOwners.toString();
    }    
    
    public void insertNewCat(String name, String owner, Date birthdate){

        try {
            
            String query = "INSERT INTO cat (name, owner, birth) VALUES (?,?,?)";
            PreparedStatement myStmt = dbConnect.prepareStatement(query);
            
            myStmt.setString(1, name);
            myStmt.setString(2, owner);
            myStmt.setDate(3, birthdate);
            
            int rowCount = myStmt.executeUpdate();
            System.out.println("Rows affected: " + rowCount);
            
            myStmt.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    

    public void deleteCat(String name){
                    
        try {
            String query = "DELETE FROM cat WHERE name = ?";
            PreparedStatement myStmt = dbConnect.prepareStatement(query);

            myStmt.setString(1, name);
                        
            int rowCount = myStmt.executeUpdate();
            System.out.println("Rows affected: " + rowCount);
            
            myStmt.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }    

    public void close() {
        try {
            results.close();
            dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {

        JDBCDemo myJDBC = new JDBCDemo();
 
        myJDBC.createConnection();
        
        String allCats = myJDBC.selectCats();
        System.out.println("Here is a list of cats and owners: ");
        System.out.println(allCats);
        
        Date birthdate = new Date(2023,11,13);
        
        myJDBC.insertNewCat("Cookie","Casey",birthdate);
        myJDBC.selectCats();        
        myJDBC.deleteCat("Cookie");
        myJDBC.selectCats();
        
        myJDBC.close();        
    }
}
