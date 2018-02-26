package com.example.java;
import java.text.NumberFormat;

// Creating Employee Class.
class Employee {

    //Initializing all the class specific variables
    private String name;
    private String position;
    private Boolean salary;
    private Double payRate;
    private int shift;
    private String startDate;


    public Employee(String name, String position, Boolean salary, Double payRate, int shift) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;

    }

    //Setter/Getter methods for each variable


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getSalary() {
        return salary;
    }

    public void setSalary(Boolean salary) {
        this.salary = salary;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    //creating a method that will calculate the total


    public void calculate(double hoursIn) {
        //setting a double variable that will be returned at the end of the method

        double weeklyIncome;
        //setting double variables equal to their respected percentages

        double first_shift_rate = 0;
        double second_shift_rate = 0.05;
        double third_shift_rate = 0.10;
        double overtime_bonus = 1.5;

        if (shift == 1) {
            //Have to be build in an overtime mechanic into method.

            if (hoursIn >= 40) {
                weeklyIncome = ((payRate * 40) + (payRate * 40 * first_shift_rate)) + ((hoursIn - 40) * (payRate)) +
                        (((hoursIn - 40) * (payRate)) * first_shift_rate) * overtime_bonus;
            } else {

                weeklyIncome = (payRate * hoursIn) + (payRate * hoursIn * first_shift_rate);
            }

            //Printing weekly income to user

            String totalout;
            //Have to format weekly income value so it prints as a currency.
            NumberFormat nF = NumberFormat.getNumberInstance();
            nF.setGroupingUsed(true);  //puts a comma every 3 digits
            nF.setMaximumFractionDigits(2); //max and min number of decimal places set to 2
            nF.setMinimumFractionDigits(2);

            totalout = nF.format(weeklyIncome);

            System.out.println("Weekly Pay:  $" + totalout);
        }

        if (shift == 2) {

            if (hoursIn >= 40) {
                weeklyIncome = ((payRate * 40) + (payRate * 40 * second_shift_rate)) + ((hoursIn - 40) * (payRate)) +
                        (((hoursIn - 40) * (payRate)) * second_shift_rate) * overtime_bonus;
            } else {

                weeklyIncome = (payRate * hoursIn) + (payRate * hoursIn * second_shift_rate);
            }

            //Printing weekly income to user

            String totalout;

            //Have to format weekly income value so it prints as a currency.

            NumberFormat nF = NumberFormat.getNumberInstance();
            nF.setGroupingUsed(true);  //puts a comma every 3 digits
            nF.setMaximumFractionDigits(2); //max and min number of decimal places set to 2
            nF.setMinimumFractionDigits(2);

            totalout = nF.format(weeklyIncome);

            System.out.println("Weekly Pay:  $" + totalout);

        }

        if (shift == 3) {

            if (hoursIn >= 40) {
                weeklyIncome = ((payRate * 40) + (payRate * 40 * third_shift_rate)) + ((hoursIn - 40) * (payRate)) +
                        (((hoursIn - 40) * (payRate)) * third_shift_rate) * overtime_bonus;
            } else {

                weeklyIncome = (payRate * hoursIn) + (payRate * hoursIn * third_shift_rate);
            }

            //Printing the weekly income to the user
            String totalout;
            //Have to format weekly income value so it prints as a currency.
            NumberFormat nF = NumberFormat.getNumberInstance();
            nF.setGroupingUsed(true);  //puts a comma every 3 digits
            nF.setMaximumFractionDigits(2); //max and min number of decimal places set to 2
            nF.setMinimumFractionDigits(2);

            totalout = nF.format(weeklyIncome);

            System.out.println("Weekly Pay:  $" + totalout);
        }


    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Administration is " + position + "  Salary: " + salary);
        System.out.println("Shift: " + shift);
        System.out.println("Pay Rate:  $" + payRate);


    }
}



public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Alec Diraimondo", "Administration", true, 27.00, 1);
        Employee emp2 = new Employee("Chris George","Maintanence", false, 21.00 , 2);
        Employee emp3 = new Employee("Diego Emmit", "Production", true, 22.00, 3);

        emp1.printInfo();
        emp1.calculate(45);

        System.out.println();
        System.out.println();
        System.out.println();

        emp2.printInfo();
        emp2.calculate(50);

        System.out.println();
        System.out.println();
        System.out.println();
        
        emp3.printInfo();
        emp3.calculate(35);
    }
}
