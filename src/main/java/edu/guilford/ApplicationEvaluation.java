/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.guilford;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author amyme
 */
public class ApplicationEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PositionApplicant> applicants = new ArrayList<PositionApplicant>();
        
        PositionApplicant testApplicant = new PositionApplicant("Linda Lit Program","Programmer 1", 93.1, 90.8, 88.4, 100.1, 60.7, 97.4, 99.9);
        System.out.println("This is applicant name: " + testApplicant.getApplicantName());
        System.out.println("This is database systems grade: " + testApplicant.getDatabaseSys());
        System.out.println("This is Linda's overall GPA: " + testApplicant.getOverallCollegeGPA());
        applicants.add(testApplicant);
        System.out.println("The size of the list is " +applicants.size());
        
       //String testString = "Will this work?";
        //applicants.add(testString);
        
        PositionApplicant testItem = applicants.get(0);
        System.out.println("First item from the list: " + applicants.get(0));
        
        applicants.remove(0);
        System.out.println("Size of list after remove method: " + applicants.size());
        try
        {
            Scanner fileScan = new Scanner(new File("resources/allTheApps.txt"));
            
            Random randGenerator = new Random();
            while(fileScan.hasNext()) {
                int introToCompProg = fileScan.nextInt();
                int advCompProg = fileScan.nextInt();
                int networking = fileScan.nextInt();
                int databaseSystems = fileScan.nextInt();
                int algorithms = fileScan.nextInt();
                int operatingSystems = fileScan.nextInt();
                double overallGPA = fileScan.nextDouble();
                int applicantNum = randGenerator.nextInt(1000000);
                String name = "Applicant";
                String position = "Programmer";
                PositionApplicant theApplicant = new PositionApplicant(name, position, introToCompProg, advCompProg,networking,databaseSystems,algorithms,operatingSystems,overallGPA);
                applicants.add(theApplicant);
                //System.out.println("The size of the list is: " + applicants.size);
        
              
            }
            fileScan.close();
        }
        
        catch (FileNotFoundException e)
        {
            System.out.println(e);
            System.exit(0);
        }
        int countApproved = 0;
        for (PositionApplicant app : applicants) {
            if (app.analyze_applicant1()) {
                countApproved = countApproved + 1;
            }
        }
        
        int countApproved_2 = 0;
        for (PositionApplicant app : applicants) {
            if (app.analyze_applicant2()) {
                countApproved_2 = countApproved_2 + 1;
            }
        }
        
        int countApproved_3 = 0;
        for (PositionApplicant app : applicants) {
            if (app.analyze_applicant3()) {
                countApproved_3 = countApproved_3 + 1;
            }
        }
        
        int countApproved_4 = 0;
        for (PositionApplicant app : applicants) {
            if (app.analyze_applicant4()) {
                countApproved_4 = countApproved_4 + 1;
            }
        }
        
        int countApproved_5 = 0;
        for (PositionApplicant app : applicants) {
            if (app.analyze_applicant5()) {
                countApproved_5 = countApproved_5 + 1;
            }
        }
        int countApproved_6 = 0;
        for (PositionApplicant app :  applicants) {
            if (app.analyze_applicant6()){
                countApproved_6 = countApproved_6 + 1;
            }
        }
        
        System.out.println("The size of the list is: " + applicants.size());
        System.out.println("Number of applicants approved using analyze_applicant1 method: " + countApproved);
        System.out.println("Number of applicants approved using second evaluation: " + countApproved_2 );
        System.out.println("Number of applicants approved using third evaluation: " + countApproved_3);
        System.out.println("Number of applicants approved using fourth evaluation: " + countApproved_4);
        System.out.println("Number of applicants approved using fith evaluation: " + countApproved_5);
        System.out.println("Number of applicants approved using sixth evaluation: " + countApproved_6);
        
        double calculatePercentM1;
        calculatePercentM1 = (100. * countApproved/applicants.size());
        
        System.out.println("The percentage of aplicants approved using analyze_applicant1 method: " + calculatePercentM1 + "%");
        System.out.println("Percentanage of applicants approved using analyze_applicant2 method: " +  (100.* countApproved_2/applicants.size()) + "%");
        System.out.println("Percentage of applicants approved using analyze_applicant3 method: " + (100.* countApproved_3/applicants.size()) + "%");
        System.out.println("Percentage of applicants approved using analyze_applicant4 method: " + (100.* countApproved_4/applicants.size()) + "%");
        System.out.println("Percentage of applicants approved using analyze_applicant5 method: " + (100.* countApproved_5/applicants.size()) + "%");
        System.out.println("Percentage of applicants approved using analyze_applicant6 method: " + (100.* countApproved_6/applicants.size()) + "%");
        
        //The average score method hones in on comp sci courses and as an employer I am most interested
        //in students and future employees that excelled thoroughly in comp sci classes. My desired
        //percentage I believe needs to be under 2% because this means I would have to do significantly less interviews.
     
    JFrame appWindow = new JFrame("Applicants");
    appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ApplicantsPanel appPanel = new ApplicantsPanel(applicants);
    ApplicantsPanel appPanel1 = new ApplicantsPanel (applicants);
    JPanel appsPanel = new JPanel();
    appsPanel.add(appPanel);
    appsPanel.add(appPanel1); //Implements specification 7
    appWindow.add(appsPanel);
  
    int red = (255);
    int green = (255);
    int blue = (255);
    Color labelColor = new Color (red, green, blue);
    appPanel1.setBackground(labelColor);
   
    appWindow.pack();
    appWindow.setVisible(true);
    
    
    }
    
    }
