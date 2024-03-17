/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class GUIPetID extends JFrame implements ActionListener, MouseListener{

    private String firstName;
    private String lastName;
    private String petName;
    private int birthYear;
    
    private JLabel instructions;
    private JLabel fnLabel;
    private JLabel lnLabel;
    private JLabel petLabel;
    private JLabel yearLabel;
    
    private JTextField fnInput;
    private JTextField lnInput;
    private JTextField petInput;
    private JTextField yearInput;
    
    public GUIPetID(){
        super("Create a PetID");
        setupGUI();
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
    }
    
    public void setupGUI(){
        
        instructions = new JLabel("Please enter your information to generate an identifier.");
        fnLabel = new JLabel("First Name:");
        lnLabel = new JLabel("Last Name:");
        petLabel = new JLabel("Pet Name:");
        yearLabel = new JLabel("Pet Birth Year:");
        
        fnInput = new JTextField("e.g. Dorothy", 15);
        lnInput = new JTextField("e.g. Gale", 15);
        petInput = new JTextField("e.g. Toto", 15);
        yearInput = new JTextField("e.g. 2000", 15);    
        
        fnInput.addMouseListener(this);
        lnInput.addMouseListener(this);
        petInput.addMouseListener(this);
        yearInput.addMouseListener(this);
        
        JButton submitInfo = new JButton("Submit");
        submitInfo.addActionListener(this);
        
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout());
        
        JPanel clientPanel = new JPanel();
        clientPanel.setLayout(new FlowLayout());

        JPanel submitPanel = new JPanel();
        submitPanel.setLayout(new FlowLayout());
        
        headerPanel.add(instructions);
        clientPanel.add(fnLabel);
        clientPanel.add(fnInput);
        clientPanel.add(lnLabel);
        clientPanel.add(lnInput);
        clientPanel.add(petLabel);
        clientPanel.add(petInput);
        clientPanel.add(yearLabel);
        clientPanel.add(yearInput);
        submitPanel.add(submitInfo);
        
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(clientPanel, BorderLayout.CENTER);
        this.add(submitPanel, BorderLayout.PAGE_END);
    }
    
    public void actionPerformed(ActionEvent event){
        lastName = lnInput.getText();
        firstName = fnInput.getText();
        petName = petInput.getText();
        birthYear = Integer.parseInt(yearInput.getText());
        
        if(validateInput()){
            String petID = idProcessing();
            JOptionPane.showMessageDialog(this, "Your pet's clinic ID is " + petID);
        }
    }
    
    public void mouseClicked(MouseEvent event){
        
        if(event.getSource().equals(fnInput))
            fnInput.setText("");

        if(event.getSource().equals(lnInput))
            lnInput.setText("");

        if(event.getSource().equals(petInput))
            petInput.setText("");

        if(event.getSource().equals(yearInput))
            yearInput.setText("");
                
    }
    
    public void mouseEntered(MouseEvent event){
        
    }

    public void mouseExited(MouseEvent event){
        
    }

    public void mousePressed(MouseEvent event){
        
    }

    public void mouseReleased(MouseEvent event){
        
    }
    
    private String idProcessing(){

        String petID = new String(String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0)) + String.valueOf(petName.charAt(0)) + String.valueOf(birthYear));
        
        return petID;
    }    
    
    private boolean validateInput(){
        
        boolean allInputValid = true;
        
        if(!Character.isUpperCase(firstName.charAt(0)) || firstName.length() < 2 || firstName.length() > 26){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, firstName + " is an invalid name input.");
        }
        
        if(!Character.isUpperCase(lastName.charAt(0)) || lastName.length() < 2 || lastName.length() > 26){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, lastName + " is an invalid name input.");
        }

        if(!Character.isUpperCase(petName.charAt(0)) || petName.length() < 2 || petName.length() > 26){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, petName + " is an invalid name input.");
        }

        if(birthYear < 1922 || birthYear > 2022){
            allInputValid = false;
            JOptionPane.showMessageDialog(this, birthYear + " is an invalid birth year. Pets must be born between 1922 and 2022.");
        }
        
        return allInputValid;
        
    }

    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            new GUIPetID().setVisible(true);        
        });
    }
        
}
