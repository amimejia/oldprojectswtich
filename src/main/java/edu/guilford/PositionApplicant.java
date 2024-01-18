/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.guilford;

/**
 *
 * @author amyme
 */
public class PositionApplicant {

    private String applicantName = ("Amy Mejia");

    public PositionApplicant(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public double getIntroCompProg() {
        return introCompProg;
    }

    public void setIntroCompProg(double introCompProg) {
        this.introCompProg = introCompProg;
    }

    public double getAdvCompProg() {
        return advCompProg;
    }

    public void setAdvCompProg(double advCompProg) {
        this.advCompProg = advCompProg;
    }

    public double getOperatingSys() {
        return operatingSys;
    }

    public void setOperatingSys(double operatingSys) {
        this.operatingSys = operatingSys;
    }

    public double getNetworkingSys() {
        return networkingSys;
    }

    public void setNetworkingSys(double networkingSys) {
        this.networkingSys = networkingSys;
    }

    public double getDatabaseSys() {
        return databaseSys;
    }

    public void setDatabaseSys(double databaseSys) {
        this.databaseSys = databaseSys;
    }

    public double getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(double algorithms) {
        this.algorithms = algorithms;
    }

    public double getOverallCollegeGPA() {
        return overallCollegeGPA;
    }

    public void setOverallCollegeGPA(double overallCollegeGPA) {
        this.overallCollegeGPA = overallCollegeGPA;
    }
  //Implements specification 2

    public PositionApplicant(String applicantName, String positionName, double introCompProg, double advCompProg, double operatingSys, double networkingSys, double databaseSys, double algorithms, double overallCollegeGPA) {
        this.applicantName = applicantName;
        this.positionName = positionName;
        this.introCompProg = introCompProg;
        this.advCompProg = advCompProg;
        this.operatingSys = operatingSys;
        this.networkingSys = networkingSys;
        this.databaseSys = databaseSys;
        this.algorithms = algorithms;
        this.overallCollegeGPA = overallCollegeGPA;
    }

    public double calculateAverageScore() {
        double averageScore;
        averageScore = (introCompProg + advCompProg + operatingSys + networkingSys + databaseSys + algorithms) / 6.0;
        return averageScore;
    }

    public String toString() {
        String output;

        output = "Applicant Name: " + applicantName + "\n"
                + "Position Name: " + positionName + "\n"
                + "Intro to Comp Prog: " + introCompProg + "\n"
                + "Adv Comp Prog: " + advCompProg + "\n"
                + "Operating Sys: " + operatingSys + "\n"
                + "Networking Sys: " + networkingSys + "\n"
                + "Database Sys: " + databaseSys + "\n"
                + "Algorithms: " + algorithms + "\n"
                + "Average Score: " + calculateAverageScore() + "\n"
                + "overall college GPA: " + overallCollegeGPA;
        return output;
    }
    
    public double calculateStandardDeviation() {
       double standardDev;
       double exICompProg = (Math.pow(introCompProg - calculateAverageScore(),2));
       double exACompProg = (Math.pow(advCompProg - calculateAverageScore(), 2));
       double exOsys = (Math.pow(operatingSys - calculateAverageScore(), 2));
       double exNsys = (Math.pow(networkingSys - calculateAverageScore(),2));
       double exAlgo = (Math.pow(algorithms - calculateAverageScore(),2));
       standardDev = (Math.sqrt((exICompProg + exACompProg + exOsys + exNsys + exAlgo)/4));
       return standardDev;
       
    }

    private String positionName = ("Programmer 6");
    private double introCompProg = (70.1);
    private double advCompProg = (88.12);
    private double operatingSys = (82.5);
    private double networkingSys = (55.0);
    private double databaseSys = (87.8);
    private double algorithms = (100.9);
    private double overallCollegeGPA = (90.12);
    //Implements specification 1
    
    //Consider the applicant further if the score in Introduction to Computer Programming is more than 80
    public boolean analyze_applicant1(){
        boolean accept;
        accept = introCompProg > 80;
        return accept;
    }
    
    public boolean analyze_applicant2(){
    boolean accept;
        accept = (introCompProg > 85) && (advCompProg > 85);
        return accept;
}
    public boolean analyze_applicant3(){
        boolean accept;
        accept = (overallCollegeGPA > 90 ) || (calculateAverageScore() > 85);
        return accept;
    }
    
    public boolean analyze_applicant4(){
        boolean accept;
        accept = (databaseSys > 95);
        return accept;
        
    }
    
    
    public boolean analyze_applicant5(){
        boolean accept;
        accept = (algorithms > 70);
        return accept;
    }
    
     public boolean analyze_applicant6(){
        boolean accept;
        accept = (calculateAverageScore() > 99);
        return accept;
     }
}
//The average score method hones in on comp sci courses and as an employer I am most interested
//in students and future employees that excelled thoroughly in comp sci classes. My desired
//percentage I believe needs to be under 2% because this means I would have to do significantly less interviews.