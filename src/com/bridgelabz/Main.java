package com.bridgelabz;

public class Main {

    private static int wage_per_hr = 20;
    private static int max_working_days = 20;
    private static int max_working_hours = 100;
    private static final int Full_Time = 1;
    private static final int Part_Time = 2;

    public static void main(String[] args) {
	    /*i= Employee Attendance
            0=Employee is Absent
            1=Full time Employee
            2=Part time employee*/
        int day_hr = 0;
        int total_working_hours = 0;
        int total_working_days = 1;
        int total_wages = 0;

        while (total_working_days <= max_working_days && total_working_hours <= max_working_hours) {

            int i = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(i);

            switch ((int) i) {
                case Full_Time:
                    System.out.println("Employee is Present for Full Day");
                    day_hr = 8;
                    break;

                case Part_Time:
                    System.out.println("Employee is Present for Half Day");
                    day_hr = 4;
                    System.out.println("Employee is Absent");
                    break;

                default:
                    day_hr = 0;
                    System.out.println("Employee is Absent");

            }
            System.out.println("Day= "+total_working_days + " Working Hour= "+total_working_hours);
            total_working_days++;

            total_working_hours = total_working_hours + day_hr;
        }
        total_wages = total_working_hours * wage_per_hr;
        System.out.println("Total Wages= "+total_wages);
    }
}
