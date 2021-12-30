package com.bridgelabz;

public class Main {

    private static int wage_per_hr = 20;
    private static final int Full_Time = 1;
    private static final int Part_Time = 2;

    public static void main(String[] args) {
	    /*i= Employee Attendance
            0=Employee is Absent
            1=Full time Employee
            2=Part time employee*/

        int i = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(i);
            int day_hr = 0;

        switch ((int) i) {
            case Full_Time:
                System.out.println("Employee is Present for Full Day");
                day_hr = 8;
                break;

            case Part_Time:
                System.out.println("Employee is Present for Half Day");
                day_hr = 4;
                break;

            default:
                System.out.println("Employee is Absent");
                day_hr = 0;
                break;
            }
            int empWages = day_hr * wage_per_hr;
            System.out.println("Wages= " + empWages);
    }
}
