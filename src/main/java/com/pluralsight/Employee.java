package com.pluralsight;

public class Employeree {

    private int emplogeeId;
    private String name;
    private String department;
    private double payRate;
    private double hourWorked;
    private double punchInTime;

    public Employeree(int emplogeeId, String name, String department, double payRate, double hourWorked) {

        this.emplogeeId = emplogeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hourWorked = hourWorked;
    }

    public double getRegularHours() {
        if (hourWorked <= 40) {
            return hourWorked;
        }
        return 40;
    }

    public double getOvertimeHours() {
        if (hourWorked > 40) {
            return hourWorked - 40;
        }
        return 0;
    }

    public double getPayRate() {
        return (getRegularHours() * payRate)
        + (getOvertimeHours()) * payRate * 1.5);
    }

    public void punchIn(double time) {
        punchInTime = time;
    }

    public void punchOut(double time) {
        hourWorked += (time - punchInTime);
    }
}